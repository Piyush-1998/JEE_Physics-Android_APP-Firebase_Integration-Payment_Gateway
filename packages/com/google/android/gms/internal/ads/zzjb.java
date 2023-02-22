package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzjb extends zzlu implements zzpd {
    private int zzahi;
    private int zzahk;
    private final zzij zzamk;
    private final zzio zzaml;
    private boolean zzamm;
    private boolean zzamn;
    private MediaFormat zzamo;
    private long zzamp;
    private boolean zzamq;

    public zzjb(zzlw zzlwVar) {
        this(zzlwVar, null, true);
    }

    public static void zza(int i, long j, long j2) {
    }

    public static void zzgb() {
    }

    public static void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhx
    public final zzpd zzdy() {
        return this;
    }

    private zzjb(zzlw zzlwVar, zzjs<zzju> zzjsVar, boolean z) {
        this(zzlwVar, null, true, null, null);
    }

    private zzjb(zzlw zzlwVar, zzjs<zzju> zzjsVar, boolean z, Handler handler, zzig zzigVar) {
        this(zzlwVar, null, true, null, null, null, new zzie[0]);
    }

    private zzjb(zzlw zzlwVar, zzjs<zzju> zzjsVar, boolean z, Handler handler, zzig zzigVar, zzif zzifVar, zzie... zzieVarArr) {
        super(1, zzlwVar, zzjsVar, z);
        this.zzaml = new zzio(null, zzieVarArr, new zzjd(this));
        this.zzamk = new zzij(null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final int zza(zzlw zzlwVar, zzho zzhoVar) throws zzlz {
        String str = zzhoVar.zzagy;
        boolean z = false;
        if (zzpg.zzbf(str)) {
            int i = zzpq.SDK_INT >= 21 ? 16 : 0;
            if (!zzba(str) || zzlwVar.zzhh() == null) {
                zzlr zzc = zzlwVar.zzc(str, false);
                if (zzc == null) {
                    return 1;
                }
                if (zzpq.SDK_INT < 21 || ((zzhoVar.zzahj == -1 || zzc.zzay(zzhoVar.zzahj)) && (zzhoVar.zzahi == -1 || zzc.zzaz(zzhoVar.zzahi)))) {
                    z = true;
                }
                return i | 4 | (z ? 3 : 2);
            }
            return i | 4 | 3;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final zzlr zza(zzlw zzlwVar, zzho zzhoVar, boolean z) throws zzlz {
        zzlr zzhh;
        if (zzba(zzhoVar.zzagy) && (zzhh = zzlwVar.zzhh()) != null) {
            this.zzamm = true;
            return zzhh;
        }
        this.zzamm = false;
        return super.zza(zzlwVar, zzhoVar, z);
    }

    private final boolean zzba(String str) {
        return this.zzaml.zzay(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zza(zzlr zzlrVar, MediaCodec mediaCodec, zzho zzhoVar, MediaCrypto mediaCrypto) {
        this.zzamn = zzpq.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(zzlrVar.name) && "samsung".equals(zzpq.MANUFACTURER) && (zzpq.DEVICE.startsWith("zeroflte") || zzpq.DEVICE.startsWith("herolte") || zzpq.DEVICE.startsWith("heroqlte"));
        if (this.zzamm) {
            MediaFormat zzey = zzhoVar.zzey();
            this.zzamo = zzey;
            zzey.setString("mime", "audio/raw");
            mediaCodec.configure(this.zzamo, (Surface) null, (MediaCrypto) null, 0);
            this.zzamo.setString("mime", zzhoVar.zzagy);
            return;
        }
        mediaCodec.configure(zzhoVar.zzey(), (Surface) null, (MediaCrypto) null, 0);
        this.zzamo = null;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zzc(String str, long j, long j2) {
        this.zzamk.zzb(str, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu
    public final void zzd(zzho zzhoVar) throws zzhd {
        super.zzd(zzhoVar);
        this.zzamk.zzc(zzhoVar);
        this.zzahk = "audio/raw".equals(zzhoVar.zzagy) ? zzhoVar.zzahk : 2;
        this.zzahi = zzhoVar.zzahi;
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhd {
        int[] iArr;
        int i;
        boolean z = this.zzamo != null;
        String string = z ? this.zzamo.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.zzamo;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzamn && integer == 6 && (i = this.zzahi) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.zzahi; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.zzaml.zza(string, integer, integer2, this.zzahk, 0, iArr);
        } catch (zzis e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void zze(boolean z) throws zzhd {
        super.zze(z);
        this.zzamk.zzc(this.zzbcr);
        int i = zzeg().zzaib;
        if (i != 0) {
            this.zzaml.zzz(i);
        } else {
            this.zzaml.zzfr();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void zza(long j, boolean z) throws zzhd {
        super.zza(j, z);
        this.zzaml.reset();
        this.zzamp = j;
        this.zzamq = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void onStarted() {
        super.onStarted();
        this.zzaml.play();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void onStopped() {
        this.zzaml.pause();
        super.onStopped();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhb
    public final void zzef() {
        try {
            this.zzaml.release();
            try {
                super.zzef();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzef();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhx
    public final boolean zzfc() {
        return super.zzfc() && this.zzaml.zzfc();
    }

    @Override // com.google.android.gms.internal.ads.zzlu, com.google.android.gms.internal.ads.zzhx
    public final boolean isReady() {
        return this.zzaml.zzfp() || super.isReady();
    }

    @Override // com.google.android.gms.internal.ads.zzpd
    public final long zzfx() {
        long zzj = this.zzaml.zzj(zzfc());
        if (zzj != Long.MIN_VALUE) {
            if (!this.zzamq) {
                zzj = Math.max(this.zzamp, zzj);
            }
            this.zzamp = zzj;
            this.zzamq = false;
        }
        return this.zzamp;
    }

    @Override // com.google.android.gms.internal.ads.zzpd
    public final zzhu zzb(zzhu zzhuVar) {
        return this.zzaml.zzb(zzhuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpd
    public final zzhu zzfq() {
        return this.zzaml.zzfq();
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzhd {
        if (this.zzamm && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zzbcr.zzaod++;
            this.zzaml.zzfm();
            return true;
        } else {
            try {
                if (this.zzaml.zzb(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.zzbcr.zzaoc++;
                    return true;
                }
                return false;
            } catch (zziv | zziw e) {
                throw zzhd.zza(e, getIndex());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlu
    protected final void zzgc() throws zzhd {
        try {
            this.zzaml.zzfn();
        } catch (zziw e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhe
    public final void zza(int i, Object obj) throws zzhd {
        if (i == 2) {
            this.zzaml.setVolume(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzaml.setStreamType(((Integer) obj).intValue());
        } else {
            super.zza(i, obj);
        }
    }
}
