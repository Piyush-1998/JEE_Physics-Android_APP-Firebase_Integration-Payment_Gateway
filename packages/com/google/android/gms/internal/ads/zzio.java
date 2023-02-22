package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzio {
    private static boolean zzajj = false;
    private static boolean zzajk = false;
    private int streamType;
    private zzhu zzafd;
    private int zzahj;
    private final zziz zzajm;
    private final zzje zzajn;
    private final zzie[] zzajo;
    private final zziu zzajp;
    private final long[] zzajr;
    private final zziq zzajs;
    private final LinkedList<zzix> zzajt;
    private AudioTrack zzaju;
    private int zzajv;
    private int zzajw;
    private int zzajx;
    private boolean zzajy;
    private int zzajz;
    private long zzaka;
    private zzhu zzakb;
    private long zzakc;
    private long zzakd;
    private ByteBuffer zzake;
    private int zzakf;
    private int zzakg;
    private int zzakh;
    private long zzaki;
    private long zzakj;
    private boolean zzakk;
    private long zzakl;
    private Method zzakm;
    private int zzakn;
    private long zzako;
    private long zzakp;
    private int zzakq;
    private long zzakr;
    private long zzaks;
    private int zzakt;
    private int zzaku;
    private long zzakv;
    private long zzakw;
    private long zzakx;
    private zzie[] zzaky;
    private ByteBuffer[] zzakz;
    private ByteBuffer zzala;
    private ByteBuffer zzalb;
    private byte[] zzalc;
    private int zzald;
    private int zzale;
    private boolean zzalf;
    private boolean zzalg;
    private int zzalh;
    private boolean zzali;
    private boolean zzalj;
    private long zzalk;
    private float zzdj;
    private final zzif zzajl = null;
    private final ConditionVariable zzajq = new ConditionVariable(true);

    public zzio(zzif zzifVar, zzie[] zzieVarArr, zziu zziuVar) {
        this.zzajp = zziuVar;
        if (zzpq.SDK_INT >= 18) {
            try {
                this.zzakm = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzpq.SDK_INT >= 19) {
            this.zzajs = new zzit();
        } else {
            this.zzajs = new zziq(null);
        }
        this.zzajm = new zziz();
        this.zzajn = new zzje();
        zzie[] zzieVarArr2 = new zzie[zzieVarArr.length + 3];
        this.zzajo = zzieVarArr2;
        zzieVarArr2[0] = new zzjc();
        zzie[] zzieVarArr3 = this.zzajo;
        zzieVarArr3[1] = this.zzajm;
        System.arraycopy(zzieVarArr, 0, zzieVarArr3, 2, zzieVarArr.length);
        this.zzajo[zzieVarArr.length + 2] = this.zzajn;
        this.zzajr = new long[10];
        this.zzdj = 1.0f;
        this.zzaku = 0;
        this.streamType = 3;
        this.zzalh = 0;
        this.zzafd = zzhu.zzahv;
        this.zzale = -1;
        this.zzaky = new zzie[0];
        this.zzakz = new ByteBuffer[0];
        this.zzajt = new LinkedList<>();
    }

    public final boolean zzay(String str) {
        zzif zzifVar = this.zzajl;
        return zzifVar != null && zzifVar.zzw(zzaz(str));
    }

    public final long zzj(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        Method method;
        if (isInitialized() && this.zzaku != 0) {
            if (this.zzaju.getPlayState() == 3) {
                long zzfx = this.zzajs.zzfx();
                if (zzfx != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - this.zzakj >= 30000) {
                        long[] jArr = this.zzajr;
                        int i = this.zzakg;
                        jArr[i] = zzfx - nanoTime;
                        this.zzakg = (i + 1) % 10;
                        int i2 = this.zzakh;
                        if (i2 < 10) {
                            this.zzakh = i2 + 1;
                        }
                        this.zzakj = nanoTime;
                        this.zzaki = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = this.zzakh;
                            if (i3 >= i4) {
                                break;
                            }
                            this.zzaki += this.zzajr[i3] / i4;
                            i3++;
                        }
                    }
                    if (!zzfv() && nanoTime - this.zzakl >= 500000) {
                        boolean zzfy = this.zzajs.zzfy();
                        this.zzakk = zzfy;
                        if (zzfy) {
                            long zzfz = this.zzajs.zzfz() / 1000;
                            long zzga = this.zzajs.zzga();
                            if (zzfz < this.zzakw) {
                                this.zzakk = false;
                            } else if (Math.abs(zzfz - nanoTime) > 5000000) {
                                StringBuilder sb = new StringBuilder(136);
                                sb.append("Spurious audio timestamp (system clock mismatch): ");
                                sb.append(zzga);
                                sb.append(", ");
                                sb.append(zzfz);
                                sb.append(", ");
                                sb.append(nanoTime);
                                sb.append(", ");
                                sb.append(zzfx);
                                Log.w("AudioTrack", sb.toString());
                                this.zzakk = false;
                            } else if (Math.abs(zzdw(zzga) - zzfx) > 5000000) {
                                StringBuilder sb2 = new StringBuilder(138);
                                sb2.append("Spurious audio timestamp (frame position mismatch): ");
                                sb2.append(zzga);
                                sb2.append(", ");
                                sb2.append(zzfz);
                                sb2.append(", ");
                                sb2.append(nanoTime);
                                sb2.append(", ");
                                sb2.append(zzfx);
                                Log.w("AudioTrack", sb2.toString());
                                this.zzakk = false;
                            }
                        }
                        if (this.zzakm != null && !this.zzajy) {
                            try {
                                long intValue = (((Integer) method.invoke(this.zzaju, null)).intValue() * 1000) - this.zzaka;
                                this.zzakx = intValue;
                                long max = Math.max(intValue, 0L);
                                this.zzakx = max;
                                if (max > 5000000) {
                                    StringBuilder sb3 = new StringBuilder(61);
                                    sb3.append("Ignoring impossibly large audio latency: ");
                                    sb3.append(max);
                                    Log.w("AudioTrack", sb3.toString());
                                    this.zzakx = 0L;
                                }
                            } catch (Exception unused) {
                                this.zzakm = null;
                            }
                        }
                        this.zzakl = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (this.zzakk) {
                j = zzdw(this.zzajs.zzga() + zzdx(nanoTime2 - (this.zzajs.zzfz() / 1000)));
            } else {
                if (this.zzakh == 0) {
                    j = this.zzajs.zzfx();
                } else {
                    j = nanoTime2 + this.zzaki;
                }
                if (!z) {
                    j -= this.zzakx;
                }
            }
            long j5 = this.zzakv;
            while (!this.zzajt.isEmpty() && j >= zzix.zzb(this.zzajt.getFirst())) {
                zzix remove = this.zzajt.remove();
                this.zzafd = zzix.zza(remove);
                this.zzakd = zzix.zzb(remove);
                this.zzakc = zzix.zzc(remove) - this.zzakv;
            }
            if (this.zzafd.zzahw == 1.0f) {
                j4 = (j + this.zzakc) - this.zzakd;
            } else {
                if (this.zzajt.isEmpty() && this.zzajn.zzge() >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                    j2 = this.zzakc;
                    j3 = zzpq.zza(j - this.zzakd, this.zzajn.zzgd(), this.zzajn.zzge());
                } else {
                    j2 = this.zzakc;
                    double d = this.zzafd.zzahw;
                    double d2 = j - this.zzakd;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    j3 = (long) (d * d2);
                }
                j4 = j3 + j2;
            }
            return j5 + j4;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zzis {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzio.zza(java.lang.String, int, int, int, int, int[]):void");
    }

    private final void zzfl() {
        zzie[] zzieVarArr;
        ArrayList arrayList = new ArrayList();
        for (zzie zzieVar : this.zzajo) {
            if (zzieVar.isActive()) {
                arrayList.add(zzieVar);
            } else {
                zzieVar.flush();
            }
        }
        int size = arrayList.size();
        this.zzaky = (zzie[]) arrayList.toArray(new zzie[size]);
        this.zzakz = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzie zzieVar2 = this.zzaky[i];
            zzieVar2.flush();
            this.zzakz[i] = zzieVar2.zzfk();
        }
    }

    public final void play() {
        this.zzalg = true;
        if (isInitialized()) {
            this.zzakw = System.nanoTime() / 1000;
            this.zzaju.play();
        }
    }

    public final void zzfm() {
        if (this.zzaku == 1) {
            this.zzaku = 2;
        }
    }

    public final boolean zzb(ByteBuffer byteBuffer, long j) throws zziv, zziw {
        int i;
        int zzo;
        ByteBuffer byteBuffer2 = this.zzala;
        zzoz.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!isInitialized()) {
            this.zzajq.block();
            if (this.zzali) {
                this.zzaju = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.zzajv).setEncoding(this.zzajx).setSampleRate(this.zzahj).build(), this.zzajz, 1, this.zzalh);
            } else if (this.zzalh == 0) {
                this.zzaju = new AudioTrack(this.streamType, this.zzahj, this.zzajv, this.zzajx, this.zzajz, 1);
            } else {
                this.zzaju = new AudioTrack(this.streamType, this.zzahj, this.zzajv, this.zzajx, this.zzajz, 1, this.zzalh);
            }
            int state = this.zzaju.getState();
            if (state != 1) {
                try {
                    this.zzaju.release();
                } catch (Exception unused) {
                } finally {
                    this.zzaju = null;
                }
                throw new zziv(state, this.zzahj, this.zzajv, this.zzajz);
            }
            int audioSessionId = this.zzaju.getAudioSessionId();
            if (this.zzalh != audioSessionId) {
                this.zzalh = audioSessionId;
                this.zzajp.zzx(audioSessionId);
            }
            this.zzajs.zza(this.zzaju, zzfv());
            zzfs();
            this.zzalj = false;
            if (this.zzalg) {
                play();
            }
        }
        if (zzfv()) {
            if (this.zzaju.getPlayState() == 2) {
                this.zzalj = false;
                return false;
            } else if (this.zzaju.getPlayState() == 1 && this.zzajs.zzfw() != 0) {
                return false;
            }
        }
        boolean z = this.zzalj;
        boolean zzfp = zzfp();
        this.zzalj = zzfp;
        if (z && !zzfp && this.zzaju.getPlayState() != 1) {
            this.zzajp.zzc(this.zzajz, zzha.zzdm(this.zzaka), SystemClock.elapsedRealtime() - this.zzalk);
        }
        if (this.zzala == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzajy && this.zzakt == 0) {
                int i2 = this.zzajx;
                if (i2 == 7 || i2 == 8) {
                    zzo = zziy.zzo(byteBuffer);
                } else if (i2 == 5) {
                    zzo = zzic.zzfg();
                } else if (i2 == 6) {
                    zzo = zzic.zzm(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i2);
                    throw new IllegalStateException(sb.toString());
                }
                this.zzakt = zzo;
            }
            if (this.zzakb != null) {
                if (!zzfo()) {
                    return false;
                }
                this.zzajt.add(new zzix(this.zzakb, Math.max(0L, j), zzdw(zzft()), null));
                this.zzakb = null;
                zzfl();
            }
            if (this.zzaku == 0) {
                this.zzakv = Math.max(0L, j);
                this.zzaku = 1;
            } else {
                long zzdw = this.zzakv + zzdw(this.zzajy ? this.zzakp : this.zzako / this.zzakn);
                if (this.zzaku != 1 || Math.abs(zzdw - j) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(zzdw);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.zzaku = 2;
                }
                if (this.zzaku == i) {
                    this.zzakv += j - zzdw;
                    this.zzaku = 1;
                    this.zzajp.zzel();
                }
            }
            if (this.zzajy) {
                this.zzakp += this.zzakt;
            } else {
                this.zzako += byteBuffer.remaining();
            }
            this.zzala = byteBuffer;
        }
        if (this.zzajy) {
            zzc(this.zzala, j);
        } else {
            zzdv(j);
        }
        if (this.zzala.hasRemaining()) {
            return false;
        }
        this.zzala = null;
        return true;
    }

    private final void zzdv(long j) throws zziw {
        ByteBuffer byteBuffer;
        int length = this.zzaky.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzakz[i - 1];
            } else {
                byteBuffer = this.zzala;
                if (byteBuffer == null) {
                    byteBuffer = zzie.zzaiu;
                }
            }
            if (i == length) {
                zzc(byteBuffer, j);
            } else {
                zzie zzieVar = this.zzaky[i];
                zzieVar.zzn(byteBuffer);
                ByteBuffer zzfk = zzieVar.zzfk();
                this.zzakz[i] = zzfk;
                if (zzfk.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r11 < r10) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzc(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzio.zzc(java.nio.ByteBuffer, long):boolean");
    }

    public final void zzfn() throws zziw {
        if (!this.zzalf && isInitialized() && zzfo()) {
            this.zzajs.zzdy(zzft());
            this.zzakf = 0;
            this.zzalf = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzfo() throws com.google.android.gms.internal.ads.zziw {
        /*
            r9 = this;
            int r0 = r9.zzale
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.zzajy
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzie[] r0 = r9.zzaky
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.zzale = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.zzale
            com.google.android.gms.internal.ads.zzie[] r5 = r9.zzaky
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zzfj()
        L28:
            r9.zzdv(r7)
            boolean r0 = r4.zzfc()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.zzale
            int r0 = r0 + r2
            r9.zzale = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzalb
            if (r0 == 0) goto L44
            r9.zzc(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzalb
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.zzale = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzio.zzfo():boolean");
    }

    public final boolean zzfc() {
        if (isInitialized()) {
            return this.zzalf && !zzfp();
        }
        return true;
    }

    public final boolean zzfp() {
        if (isInitialized()) {
            if (zzft() <= this.zzajs.zzfw()) {
                if (zzfv() && this.zzaju.getPlayState() == 2 && this.zzaju.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final zzhu zzb(zzhu zzhuVar) {
        if (this.zzajy) {
            zzhu zzhuVar2 = zzhu.zzahv;
            this.zzafd = zzhuVar2;
            return zzhuVar2;
        }
        zzhu zzhuVar3 = new zzhu(this.zzajn.zza(zzhuVar.zzahw), this.zzajn.zzb(zzhuVar.zzahx));
        zzhu zzhuVar4 = this.zzakb;
        if (zzhuVar4 == null) {
            if (!this.zzajt.isEmpty()) {
                zzhuVar4 = zzix.zza(this.zzajt.getLast());
            } else {
                zzhuVar4 = this.zzafd;
            }
        }
        if (!zzhuVar3.equals(zzhuVar4)) {
            if (isInitialized()) {
                this.zzakb = zzhuVar3;
            } else {
                this.zzafd = zzhuVar3;
            }
        }
        return this.zzafd;
    }

    public final zzhu zzfq() {
        return this.zzafd;
    }

    public final void setStreamType(int i) {
        if (this.streamType == i) {
            return;
        }
        this.streamType = i;
        if (this.zzali) {
            return;
        }
        reset();
        this.zzalh = 0;
    }

    public final void zzz(int i) {
        zzoz.checkState(zzpq.SDK_INT >= 21);
        if (this.zzali && this.zzalh == i) {
            return;
        }
        this.zzali = true;
        this.zzalh = i;
        reset();
    }

    public final void zzfr() {
        if (this.zzali) {
            this.zzali = false;
            this.zzalh = 0;
            reset();
        }
    }

    public final void setVolume(float f) {
        if (this.zzdj != f) {
            this.zzdj = f;
            zzfs();
        }
    }

    private final void zzfs() {
        if (isInitialized()) {
            if (zzpq.SDK_INT >= 21) {
                this.zzaju.setVolume(this.zzdj);
                return;
            }
            AudioTrack audioTrack = this.zzaju;
            float f = this.zzdj;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void pause() {
        this.zzalg = false;
        if (isInitialized()) {
            zzfu();
            this.zzajs.pause();
        }
    }

    public final void reset() {
        if (isInitialized()) {
            this.zzako = 0L;
            this.zzakp = 0L;
            this.zzakr = 0L;
            this.zzaks = 0L;
            this.zzakt = 0;
            zzhu zzhuVar = this.zzakb;
            if (zzhuVar != null) {
                this.zzafd = zzhuVar;
                this.zzakb = null;
            } else if (!this.zzajt.isEmpty()) {
                this.zzafd = zzix.zza(this.zzajt.getLast());
            }
            this.zzajt.clear();
            this.zzakc = 0L;
            this.zzakd = 0L;
            this.zzala = null;
            this.zzalb = null;
            int i = 0;
            while (true) {
                zzie[] zzieVarArr = this.zzaky;
                if (i >= zzieVarArr.length) {
                    break;
                }
                zzie zzieVar = zzieVarArr[i];
                zzieVar.flush();
                this.zzakz[i] = zzieVar.zzfk();
                i++;
            }
            this.zzalf = false;
            this.zzale = -1;
            this.zzake = null;
            this.zzakf = 0;
            this.zzaku = 0;
            this.zzakx = 0L;
            zzfu();
            if (this.zzaju.getPlayState() == 3) {
                this.zzaju.pause();
            }
            AudioTrack audioTrack = this.zzaju;
            this.zzaju = null;
            this.zzajs.zza(null, false);
            this.zzajq.close();
            new zzir(this, audioTrack).start();
        }
    }

    public final void release() {
        reset();
        for (zzie zzieVar : this.zzajo) {
            zzieVar.reset();
        }
        this.zzalh = 0;
        this.zzalg = false;
    }

    private final boolean isInitialized() {
        return this.zzaju != null;
    }

    private final long zzdw(long j) {
        return (j * 1000000) / this.zzahj;
    }

    private final long zzdx(long j) {
        return (j * this.zzahj) / 1000000;
    }

    private final long zzft() {
        return this.zzajy ? this.zzaks : this.zzakr / this.zzakq;
    }

    private final void zzfu() {
        this.zzaki = 0L;
        this.zzakh = 0;
        this.zzakg = 0;
        this.zzakj = 0L;
        this.zzakk = false;
        this.zzakl = 0L;
    }

    private final boolean zzfv() {
        if (zzpq.SDK_INT < 23) {
            int i = this.zzajx;
            return i == 5 || i == 6;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzaz(String str) {
        char c;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return c != 3 ? 0 : 8;
                }
                return 7;
            }
            return 6;
        }
        return 5;
    }
}
