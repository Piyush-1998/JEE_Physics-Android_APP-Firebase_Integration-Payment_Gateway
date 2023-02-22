package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzpx extends zzlu {
    private static final int[] zzbkx = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int zzaib;
    private boolean zzali;
    private final zzqb zzbky;
    private final zzqg zzbkz;
    private final long zzbla;
    private final int zzblb;
    private final boolean zzblc;
    private final long[] zzbld;
    private zzho[] zzble;
    private zzpz zzblf;
    private Surface zzblg;
    private Surface zzblh;
    private int zzbli;
    private boolean zzblj;
    private long zzblk;
    private long zzbll;
    private int zzblm;
    private int zzbln;
    private int zzblo;
    private float zzblp;
    private int zzblq;
    private int zzblr;
    private int zzbls;
    private float zzblt;
    private int zzblu;
    private int zzblv;
    private int zzblw;
    private float zzblx;
    zzqc zzbly;
    private long zzblz;
    private int zzbma;
    private final Context zzvr;

    public zzpx(Context context, zzlw zzlwVar, long j, Handler handler, zzqd zzqdVar, int i) {
        this(context, zzlwVar, 0L, null, false, handler, zzqdVar, -1);
    }

    private static boolean zzem(long j) {
        return j < -30000;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzpx(Context context, zzlw zzlwVar, long j, zzjs<zzju> zzjsVar, boolean z, Handler handler, zzqd zzqdVar, int i) {
        super(2, zzlwVar, null, false);
        boolean z2 = false;
        this.zzbla = 0L;
        this.zzblb = -1;
        this.zzvr = context.getApplicationContext();
        this.zzbky = new zzqb(context);
        this.zzbkz = new zzqg(handler, zzqdVar);
        if (zzpq.SDK_INT <= 22 && "foster".equals(zzpq.DEVICE) && "NVIDIA".equals(zzpq.MANUFACTURER)) {
            z2 = true;
        }
        this.zzblc = z2;
        this.zzbld = new long[10];
        this.zzblz = -9223372036854775807L;
        this.zzblk = -9223372036854775807L;
        this.zzblq = -1;
        this.zzblr = -1;
        this.zzblt = -1.0f;
        this.zzblp = -1.0f;
        this.zzbli = 1;
        zzjj();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final int zza(zzlw zzlwVar, zzho zzhoVar) throws zzlz {
        boolean z;
        String str = zzhoVar.zzagy;
        if (zzpg.zzbg(str)) {
            zzjn zzjnVar = zzhoVar.zzahb;
            if (zzjnVar != null) {
                z = false;
                for (int i = 0; i < zzjnVar.zzaoh; i++) {
                    z |= zzjnVar.zzag(i).zzaoi;
                }
            } else {
                z = false;
            }
            zzlr zzc = zzlwVar.zzc(str, z);
            if (zzc == null) {
                return 1;
            }
            boolean zzbc = zzc.zzbc(zzhoVar.zzagv);
            if (zzbc && zzhoVar.width > 0 && zzhoVar.height > 0) {
                if (zzpq.SDK_INT >= 21) {
                    zzbc = zzc.zza(zzhoVar.width, zzhoVar.height, zzhoVar.zzahc);
                } else {
                    boolean z2 = zzhoVar.width * zzhoVar.height <= zzly.zzhi();
                    if (!z2) {
                        int i2 = zzhoVar.width;
                        int i3 = zzhoVar.height;
                        String str2 = zzpq.zzbki;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                        sb.append("FalseCheck [legacyFrameSize, ");
                        sb.append(i2);
                        sb.append("x");
                        sb.append(i3);
                        sb.append("] [");
                        sb.append(str2);
                        sb.append("]");
                        Log.d("MediaCodecVideoRenderer", sb.toString());
                    }
                    zzbc = z2;
                }
            }
            return (zzbc ? 3 : 2) | (zzc.zzbba ? 8 : 4) | (zzc.zzali ? 16 : 0);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void zze(boolean z) throws zzhd {
        super.zze(z);
        int i = zzeg().zzaib;
        this.zzaib = i;
        this.zzali = i != 0;
        this.zzbkz.zzc(this.zzbcr);
        this.zzbky.enable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zza(zzho[] zzhoVarArr, long j) throws zzhd {
        this.zzble = zzhoVarArr;
        if (this.zzblz == -9223372036854775807L) {
            this.zzblz = j;
        } else {
            int i = this.zzbma;
            long[] jArr = this.zzbld;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.zzbma = i + 1;
            }
            this.zzbld[this.zzbma - 1] = j;
        }
        super.zza(zzhoVarArr, j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void zza(long j, boolean z) throws zzhd {
        super.zza(j, z);
        zzjh();
        this.zzbln = 0;
        int i = this.zzbma;
        if (i != 0) {
            this.zzblz = this.zzbld[i - 1];
            this.zzbma = 0;
        }
        if (z) {
            zzjg();
        } else {
            this.zzblk = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhx
    public final boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.zzblj || (((surface = this.zzblh) != null && this.zzblg == surface) || zzhc() == null))) {
            this.zzblk = -9223372036854775807L;
            return true;
        } else if (this.zzblk == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzblk) {
                return true;
            }
            this.zzblk = -9223372036854775807L;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void onStarted() {
        super.onStarted();
        this.zzblm = 0;
        this.zzbll = SystemClock.elapsedRealtime();
        this.zzblk = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void onStopped() {
        zzjm();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void zzef() {
        this.zzblq = -1;
        this.zzblr = -1;
        this.zzblt = -1.0f;
        this.zzblp = -1.0f;
        this.zzblz = -9223372036854775807L;
        this.zzbma = 0;
        zzjj();
        zzjh();
        this.zzbky.disable();
        this.zzbly = null;
        this.zzali = false;
        try {
            super.zzef();
        } finally {
            this.zzbcr.zzgl();
            this.zzbkz.zzd(this.zzbcr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhe
    public final void zza(int i, Object obj) throws zzhd {
        if (i != 1) {
            if (i == 4) {
                this.zzbli = ((Integer) obj).intValue();
                MediaCodec zzhc = zzhc();
                if (zzhc != null) {
                    zzhc.setVideoScalingMode(this.zzbli);
                    return;
                }
                return;
            }
            super.zza(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (surface == null) {
            Surface surface2 = this.zzblh;
            if (surface2 != null) {
                surface = surface2;
            } else {
                zzlr zzhd = zzhd();
                if (zzhd != null && zzn(zzhd.zzbbb)) {
                    surface = zzpt.zzc(this.zzvr, zzhd.zzbbb);
                    this.zzblh = surface;
                }
            }
        }
        if (this.zzblg != surface) {
            this.zzblg = surface;
            int state = getState();
            if (state == 1 || state == 2) {
                MediaCodec zzhc2 = zzhc();
                if (zzpq.SDK_INT >= 23 && zzhc2 != null && surface != null) {
                    zzhc2.setOutputSurface(surface);
                } else {
                    zzhe();
                    zzhb();
                }
            }
            if (surface != null && surface != this.zzblh) {
                zzjl();
                zzjh();
                if (state == 2) {
                    zzjg();
                    return;
                }
                return;
            }
            zzjj();
            zzjh();
        } else if (surface == null || surface == this.zzblh) {
        } else {
            zzjl();
            if (this.zzblj) {
                this.zzbkz.zzb(this.zzblg);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(zzlr zzlrVar) {
        return this.zzblg != null || zzn(zzlrVar.zzbbb);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zza(zzlr zzlrVar, MediaCodec mediaCodec, zzho zzhoVar, MediaCrypto mediaCrypto) throws zzlz {
        zzpz zzpzVar;
        Point point;
        zzho[] zzhoVarArr = this.zzble;
        int i = zzhoVar.width;
        int i2 = zzhoVar.height;
        int zzi = zzi(zzhoVar);
        if (zzhoVarArr.length == 1) {
            zzpzVar = new zzpz(i, i2, zzi);
        } else {
            boolean z = false;
            for (zzho zzhoVar2 : zzhoVarArr) {
                if (zza(zzlrVar.zzbba, zzhoVar, zzhoVar2)) {
                    z |= zzhoVar2.width == -1 || zzhoVar2.height == -1;
                    i = Math.max(i, zzhoVar2.width);
                    i2 = Math.max(i2, zzhoVar2.height);
                    zzi = Math.max(zzi, zzi(zzhoVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = zzhoVar.height > zzhoVar.width;
                int i3 = z2 ? zzhoVar.height : zzhoVar.width;
                int i4 = z2 ? zzhoVar.width : zzhoVar.height;
                float f = i4 / i3;
                int[] iArr = zzbkx;
                int length = iArr.length;
                int i5 = 0;
                while (i5 < length) {
                    int i6 = length;
                    int i7 = iArr[i5];
                    int[] iArr2 = iArr;
                    int i8 = (int) (i7 * f);
                    if (i7 <= i3 || i8 <= i4) {
                        break;
                    }
                    int i9 = i3;
                    int i10 = i4;
                    if (zzpq.SDK_INT >= 21) {
                        int i11 = z2 ? i8 : i7;
                        if (!z2) {
                            i7 = i8;
                        }
                        Point zzd = zzlrVar.zzd(i11, i7);
                        if (zzlrVar.zza(zzd.x, zzd.y, zzhoVar.zzahc)) {
                            point = zzd;
                            break;
                        }
                        i5++;
                        length = i6;
                        iArr = iArr2;
                        i3 = i9;
                        i4 = i10;
                    } else {
                        int zzf = zzpq.zzf(i7, 16) << 4;
                        int zzf2 = zzpq.zzf(i8, 16) << 4;
                        if (zzf * zzf2 <= zzly.zzhi()) {
                            int i12 = z2 ? zzf2 : zzf;
                            if (!z2) {
                                zzf = zzf2;
                            }
                            point = new Point(i12, zzf);
                        } else {
                            i5++;
                            length = i6;
                            iArr = iArr2;
                            i3 = i9;
                            i4 = i10;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i = Math.max(i, point.x);
                    i2 = Math.max(i2, point.y);
                    zzi = Math.max(zzi, zza(zzhoVar.zzagy, i, i2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i);
                    sb2.append("x");
                    sb2.append(i2);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            zzpzVar = new zzpz(i, i2, zzi);
        }
        this.zzblf = zzpzVar;
        boolean z3 = this.zzblc;
        int i13 = this.zzaib;
        MediaFormat zzey = zzhoVar.zzey();
        zzey.setInteger("max-width", zzpzVar.width);
        zzey.setInteger("max-height", zzpzVar.height);
        if (zzpzVar.zzbmb != -1) {
            zzey.setInteger("max-input-size", zzpzVar.zzbmb);
        }
        if (z3) {
            zzey.setInteger("auto-frc", 0);
        }
        if (i13 != 0) {
            zzey.setFeatureEnabled("tunneled-playback", true);
            zzey.setInteger("audio-session-id", i13);
        }
        if (this.zzblg == null) {
            zzoz.checkState(zzn(zzlrVar.zzbbb));
            if (this.zzblh == null) {
                this.zzblh = zzpt.zzc(this.zzvr, zzlrVar.zzbbb);
            }
            this.zzblg = this.zzblh;
        }
        mediaCodec.configure(zzey, this.zzblg, (MediaCrypto) null, 0);
        if (zzpq.SDK_INT < 23 || !this.zzali) {
            return;
        }
        this.zzbly = new zzqc(this, mediaCodec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzhe() {
        try {
            super.zzhe();
        } finally {
            Surface surface = this.zzblh;
            if (surface != null) {
                if (this.zzblg == surface) {
                    this.zzblg = null;
                }
                this.zzblh.release();
                this.zzblh = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zzc(String str, long j, long j2) {
        this.zzbkz.zzb(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzd(zzho zzhoVar) throws zzhd {
        super.zzd(zzhoVar);
        this.zzbkz.zzc(zzhoVar);
        this.zzblp = zzhoVar.zzahe == -1.0f ? 1.0f : zzhoVar.zzahe;
        this.zzblo = zzj(zzhoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zza(zzjk zzjkVar) {
        if (zzpq.SDK_INT >= 23 || !this.zzali) {
            return;
        }
        zzji();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzblq = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzblr = integer2;
        this.zzblt = this.zzblp;
        if (zzpq.SDK_INT >= 21) {
            int i = this.zzblo;
            if (i == 90 || i == 270) {
                int i2 = this.zzblq;
                this.zzblq = this.zzblr;
                this.zzblr = i2;
                this.zzblt = 1.0f / this.zzblt;
            }
        } else {
            this.zzbls = this.zzblo;
        }
        mediaCodec.setVideoScalingMode(this.zzbli);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(MediaCodec mediaCodec, boolean z, zzho zzhoVar, zzho zzhoVar2) {
        return zza(z, zzhoVar, zzhoVar2) && zzhoVar2.width <= this.zzblf.width && zzhoVar2.height <= this.zzblf.height && zzhoVar2.zzagz <= this.zzblf.zzbmb;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        while (true) {
            int i3 = this.zzbma;
            if (i3 == 0) {
                break;
            }
            long[] jArr = this.zzbld;
            if (j3 < jArr[0]) {
                break;
            }
            this.zzblz = jArr[0];
            int i4 = i3 - 1;
            this.zzbma = i4;
            System.arraycopy(jArr, 1, jArr, 0, i4);
        }
        long j4 = j3 - this.zzblz;
        if (z) {
            zza(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.zzblg == this.zzblh) {
            if (zzem(j5)) {
                zza(mediaCodec, i, j4);
                return true;
            }
            return false;
        } else if (!this.zzblj) {
            if (zzpq.SDK_INT >= 21) {
                zza(mediaCodec, i, j4, System.nanoTime());
            } else {
                zzb(mediaCodec, i, j4);
            }
            return true;
        } else if (getState() != 2) {
            return false;
        } else {
            long elapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
            long nanoTime = System.nanoTime();
            long zzf = this.zzbky.zzf(j3, (elapsedRealtime * 1000) + nanoTime);
            long j6 = (zzf - nanoTime) / 1000;
            if (zzem(j6)) {
                zzpn.beginSection("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i, false);
                zzpn.endSection();
                this.zzbcr.zzaoe++;
                this.zzblm++;
                this.zzbln++;
                this.zzbcr.zzaof = Math.max(this.zzbln, this.zzbcr.zzaof);
                if (this.zzblm == this.zzblb) {
                    zzjm();
                }
                return true;
            }
            if (zzpq.SDK_INT >= 21) {
                if (j6 < 50000) {
                    zza(mediaCodec, i, j4, zzf);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzb(mediaCodec, i, j4);
                return true;
            }
            return false;
        }
    }

    private final void zza(MediaCodec mediaCodec, int i, long j) {
        zzpn.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        zzpn.endSection();
        this.zzbcr.zzaod++;
    }

    private final void zzb(MediaCodec mediaCodec, int i, long j) {
        zzjk();
        zzpn.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        zzpn.endSection();
        this.zzbcr.zzaoc++;
        this.zzbln = 0;
        zzji();
    }

    private final void zza(MediaCodec mediaCodec, int i, long j, long j2) {
        zzjk();
        zzpn.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        zzpn.endSection();
        this.zzbcr.zzaoc++;
        this.zzbln = 0;
        zzji();
    }

    private final boolean zzn(boolean z) {
        if (zzpq.SDK_INT < 23 || this.zzali) {
            return false;
        }
        return !z || zzpt.zzc(this.zzvr);
    }

    private final void zzjg() {
        this.zzblk = this.zzbla > 0 ? SystemClock.elapsedRealtime() + this.zzbla : -9223372036854775807L;
    }

    private final void zzjh() {
        MediaCodec zzhc;
        this.zzblj = false;
        if (zzpq.SDK_INT < 23 || !this.zzali || (zzhc = zzhc()) == null) {
            return;
        }
        this.zzbly = new zzqc(this, zzhc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzji() {
        if (this.zzblj) {
            return;
        }
        this.zzblj = true;
        this.zzbkz.zzb(this.zzblg);
    }

    private final void zzjj() {
        this.zzblu = -1;
        this.zzblv = -1;
        this.zzblx = -1.0f;
        this.zzblw = -1;
    }

    private final void zzjk() {
        if (this.zzblu == this.zzblq && this.zzblv == this.zzblr && this.zzblw == this.zzbls && this.zzblx == this.zzblt) {
            return;
        }
        this.zzbkz.zzb(this.zzblq, this.zzblr, this.zzbls, this.zzblt);
        this.zzblu = this.zzblq;
        this.zzblv = this.zzblr;
        this.zzblw = this.zzbls;
        this.zzblx = this.zzblt;
    }

    private final void zzjl() {
        if (this.zzblu == -1 && this.zzblv == -1) {
            return;
        }
        this.zzbkz.zzb(this.zzblq, this.zzblr, this.zzbls, this.zzblt);
    }

    private final void zzjm() {
        if (this.zzblm > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbkz.zzf(this.zzblm, elapsedRealtime - this.zzbll);
            this.zzblm = 0;
            this.zzbll = elapsedRealtime;
        }
    }

    private static int zzi(zzho zzhoVar) {
        if (zzhoVar.zzagz != -1) {
            return zzhoVar.zzagz;
        }
        return zza(zzhoVar.zzagy, zzhoVar.width, zzhoVar.height);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zza(String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                if ("BRAVIA 4K 2015".equals(zzpq.MODEL)) {
                    return -1;
                }
                i3 = ((zzpq.zzf(i, 16) * zzpq.zzf(i2, 16)) << 4) << 4;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            } else if (c != 3) {
                if (c == 4 || c == 5) {
                    i3 = i * i2;
                    return (i3 * 3) / (i4 * 2);
                }
                return -1;
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    private static boolean zza(boolean z, zzho zzhoVar, zzho zzhoVar2) {
        if (zzhoVar.zzagy.equals(zzhoVar2.zzagy) && zzj(zzhoVar) == zzj(zzhoVar2)) {
            if (z) {
                return true;
            }
            return zzhoVar.width == zzhoVar2.width && zzhoVar.height == zzhoVar2.height;
        }
        return false;
    }

    private static int zzj(zzho zzhoVar) {
        if (zzhoVar.zzahd == -1) {
            return 0;
        }
        return zzhoVar.zzahd;
    }
}
