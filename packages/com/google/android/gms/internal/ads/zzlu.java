package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzlu extends zzhb {
    private static final byte[] zzbbh = zzpq.zzbm("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private zzho zzaht;
    private ByteBuffer[] zzakz;
    private final zzlw zzbbi;
    private final zzjs<zzju> zzbbj;
    private final boolean zzbbk;
    private final zzjk zzbbl;
    private final zzjk zzbbm;
    private final zzhq zzbbn;
    private final List<Long> zzbbo;
    private final MediaCodec.BufferInfo zzbbp;
    private zzjq<zzju> zzbbq;
    private zzjq<zzju> zzbbr;
    private MediaCodec zzbbs;
    private zzlr zzbbt;
    private boolean zzbbu;
    private boolean zzbbv;
    private boolean zzbbw;
    private boolean zzbbx;
    private boolean zzbby;
    private boolean zzbbz;
    private boolean zzbca;
    private boolean zzbcb;
    private boolean zzbcc;
    private ByteBuffer[] zzbcd;
    private long zzbce;
    private int zzbcf;
    private int zzbcg;
    private boolean zzbch;
    private boolean zzbci;
    private int zzbcj;
    private int zzbck;
    private boolean zzbcl;
    private boolean zzbcm;
    private boolean zzbcn;
    private boolean zzbco;
    private boolean zzbcp;
    private boolean zzbcq;
    protected zzjl zzbcr;

    public zzlu(int i, zzlw zzlwVar, zzjs<zzju> zzjsVar, boolean z) {
        super(i);
        zzoz.checkState(zzpq.SDK_INT >= 16);
        this.zzbbi = (zzlw) zzoz.checkNotNull(zzlwVar);
        this.zzbbj = zzjsVar;
        this.zzbbk = z;
        this.zzbbl = new zzjk(0);
        this.zzbbm = new zzjk(0);
        this.zzbbn = new zzhq();
        this.zzbbo = new ArrayList();
        this.zzbbp = new MediaCodec.BufferInfo();
        this.zzbcj = 0;
        this.zzbck = 0;
    }

    protected void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzhd {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhb
    public void onStarted() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhb
    public void onStopped() {
    }

    protected abstract int zza(zzlw zzlwVar, zzho zzhoVar) throws zzlz;

    protected void zza(zzjk zzjkVar) {
    }

    protected abstract void zza(zzlr zzlrVar, MediaCodec mediaCodec, zzho zzhoVar, MediaCrypto mediaCrypto) throws zzlz;

    protected abstract boolean zza(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzhd;

    protected boolean zza(MediaCodec mediaCodec, boolean z, zzho zzhoVar, zzho zzhoVar2) {
        return false;
    }

    protected boolean zza(zzlr zzlrVar) {
        return true;
    }

    protected void zzc(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhw
    public final int zzee() {
        return 4;
    }

    protected void zzgc() throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final int zza(zzho zzhoVar) throws zzhd {
        try {
            return zza(this.zzbbi, zzhoVar);
        } catch (zzlz e) {
            throw zzhd.zza(e, getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public zzlr zza(zzlw zzlwVar, zzho zzhoVar, boolean z) throws zzlz {
        return zzlwVar.zzc(zzhoVar.zzagy, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzhb() throws zzhd {
        zzho zzhoVar;
        if (this.zzbbs != null || (zzhoVar = this.zzaht) == null) {
            return;
        }
        this.zzbbq = this.zzbbr;
        String str = zzhoVar.zzagy;
        zzjq<zzju> zzjqVar = this.zzbbq;
        if (zzjqVar != null) {
            int state = zzjqVar.getState();
            if (state == 0) {
                throw zzhd.zza(this.zzbbq.zzgn(), getIndex());
            }
            if (state == 3 || state == 4) {
                this.zzbbq.zzgm();
                throw new NoSuchMethodError();
            }
            return;
        }
        if (this.zzbbt == null) {
            try {
                this.zzbbt = zza(this.zzbbi, this.zzaht, false);
            } catch (zzlz e) {
                zza(new zzlt(this.zzaht, (Throwable) e, false, -49998));
            }
            if (this.zzbbt == null) {
                zza(new zzlt(this.zzaht, (Throwable) null, false, -49999));
            }
        }
        if (zza(this.zzbbt)) {
            String str2 = this.zzbbt.name;
            this.zzbbu = zzpq.SDK_INT < 21 && this.zzaht.zzaha.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            this.zzbbv = zzpq.SDK_INT < 18 || (zzpq.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzpq.SDK_INT == 19 && zzpq.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.zzbbw = zzpq.SDK_INT < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzpq.DEVICE) || "flounder_lte".equals(zzpq.DEVICE) || "grouper".equals(zzpq.DEVICE) || "tilapia".equals(zzpq.DEVICE));
            this.zzbbx = zzpq.SDK_INT <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.zzbby = (zzpq.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzpq.SDK_INT <= 19 && "hb2000".equals(zzpq.DEVICE) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.zzbbz = zzpq.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str2);
            this.zzbca = zzpq.SDK_INT <= 18 && this.zzaht.zzahi == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String valueOf = String.valueOf(str2);
                zzpn.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                this.zzbbs = MediaCodec.createByCodecName(str2);
                zzpn.endSection();
                zzpn.beginSection("configureCodec");
                zza(this.zzbbt, this.zzbbs, this.zzaht, (MediaCrypto) null);
                zzpn.endSection();
                zzpn.beginSection("startCodec");
                this.zzbbs.start();
                zzpn.endSection();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                zzc(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.zzbcd = this.zzbbs.getInputBuffers();
                this.zzakz = this.zzbbs.getOutputBuffers();
            } catch (Exception e2) {
                zza(new zzlt(this.zzaht, (Throwable) e2, false, str2));
            }
            this.zzbce = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.zzbcf = -1;
            this.zzbcg = -1;
            this.zzbcq = true;
            this.zzbcr.zzanz++;
        }
    }

    private final void zza(zzlt zzltVar) throws zzhd {
        throw zzhd.zza(zzltVar, getIndex());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec zzhc() {
        return this.zzbbs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzlr zzhd() {
        return this.zzbbt;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhb
    public void zze(boolean z) throws zzhd {
        this.zzbcr = new zzjl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhb
    public void zza(long j, boolean z) throws zzhd {
        this.zzbcn = false;
        this.zzbco = false;
        if (this.zzbbs != null) {
            this.zzbce = -9223372036854775807L;
            this.zzbcf = -1;
            this.zzbcg = -1;
            this.zzbcq = true;
            this.zzbcp = false;
            this.zzbch = false;
            this.zzbbo.clear();
            this.zzbcb = false;
            this.zzbcc = false;
            if (this.zzbbv || (this.zzbby && this.zzbcm)) {
                zzhe();
                zzhb();
            } else if (this.zzbck != 0) {
                zzhe();
                zzhb();
            } else {
                this.zzbbs.flush();
                this.zzbcl = false;
            }
            if (!this.zzbci || this.zzaht == null) {
                return;
            }
            this.zzbcj = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzhb
    public void zzef() {
        this.zzaht = null;
        try {
            zzhe();
            try {
                if (this.zzbbq != null) {
                    this.zzbbj.zza(this.zzbbq);
                }
                try {
                    if (this.zzbbr != null && this.zzbbr != this.zzbbq) {
                        this.zzbbj.zza(this.zzbbr);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.zzbbr != null && this.zzbbr != this.zzbbq) {
                        this.zzbbj.zza(this.zzbbr);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.zzbbq != null) {
                    this.zzbbj.zza(this.zzbbq);
                }
                try {
                    if (this.zzbbr != null && this.zzbbr != this.zzbbq) {
                        this.zzbbj.zza(this.zzbbr);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.zzbbr != null && this.zzbbr != this.zzbbq) {
                        this.zzbbj.zza(this.zzbbr);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzhe() {
        this.zzbce = -9223372036854775807L;
        this.zzbcf = -1;
        this.zzbcg = -1;
        this.zzbcp = false;
        this.zzbch = false;
        this.zzbbo.clear();
        this.zzbcd = null;
        this.zzakz = null;
        this.zzbbt = null;
        this.zzbci = false;
        this.zzbcl = false;
        this.zzbbu = false;
        this.zzbbv = false;
        this.zzbbw = false;
        this.zzbbx = false;
        this.zzbby = false;
        this.zzbca = false;
        this.zzbcb = false;
        this.zzbcc = false;
        this.zzbcm = false;
        this.zzbcj = 0;
        this.zzbck = 0;
        this.zzbbl.zzdd = null;
        if (this.zzbbs != null) {
            this.zzbcr.zzaoa++;
            try {
                this.zzbbs.stop();
                try {
                    this.zzbbs.release();
                    this.zzbbs = null;
                    zzjq<zzju> zzjqVar = this.zzbbq;
                    if (zzjqVar == null || this.zzbbr == zzjqVar) {
                        return;
                    }
                    try {
                        this.zzbbj.zza(zzjqVar);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.zzbbs = null;
                    zzjq<zzju> zzjqVar2 = this.zzbbq;
                    if (zzjqVar2 != null && this.zzbbr != zzjqVar2) {
                        try {
                            this.zzbbj.zza(zzjqVar2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.zzbbs.release();
                    this.zzbbs = null;
                    zzjq<zzju> zzjqVar3 = this.zzbbq;
                    if (zzjqVar3 != null && this.zzbbr != zzjqVar3) {
                        try {
                            this.zzbbj.zza(zzjqVar3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.zzbbs = null;
                    zzjq<zzju> zzjqVar4 = this.zzbbq;
                    if (zzjqVar4 != null && this.zzbbr != zzjqVar4) {
                        try {
                            this.zzbbj.zza(zzjqVar4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzb(long j, long j2) throws zzhd {
        if (this.zzbco) {
            zzgc();
            return;
        }
        if (this.zzaht == null) {
            this.zzbbm.clear();
            int zza = zza(this.zzbbn, this.zzbbm, true);
            if (zza != -5) {
                if (zza == -4) {
                    zzoz.checkState(this.zzbbm.zzgj());
                    this.zzbcn = true;
                    zzhg();
                    return;
                }
                return;
            }
            zzd(this.zzbbn.zzaht);
        }
        zzhb();
        if (this.zzbbs != null) {
            zzpn.beginSection("drainAndFeed");
            do {
            } while (zzd(j, j2));
            do {
            } while (zzhf());
            zzpn.endSection();
        } else {
            zzdp(j);
            this.zzbbm.clear();
            int zza2 = zza(this.zzbbn, this.zzbbm, false);
            if (zza2 == -5) {
                zzd(this.zzbbn.zzaht);
            } else if (zza2 == -4) {
                zzoz.checkState(this.zzbbm.zzgj());
                this.zzbcn = true;
                zzhg();
            }
        }
        this.zzbcr.zzgl();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzhf() throws com.google.android.gms.internal.ads.zzhd {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlu.zzhf():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzd(zzho zzhoVar) throws zzhd {
        MediaCodec mediaCodec;
        zzho zzhoVar2 = this.zzaht;
        this.zzaht = zzhoVar;
        boolean z = true;
        if (!zzpq.zza(zzhoVar.zzahb, zzhoVar2 == null ? null : zzhoVar2.zzahb)) {
            if (this.zzaht.zzahb != null) {
                zzjs<zzju> zzjsVar = this.zzbbj;
                if (zzjsVar == null) {
                    throw zzhd.zza(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
                }
                zzjq<zzju> zza = zzjsVar.zza(Looper.myLooper(), this.zzaht.zzahb);
                this.zzbbr = zza;
                if (zza == this.zzbbq) {
                    this.zzbbj.zza(zza);
                }
            } else {
                this.zzbbr = null;
            }
        }
        if (this.zzbbr == this.zzbbq && (mediaCodec = this.zzbbs) != null && zza(mediaCodec, this.zzbbt.zzbba, zzhoVar2, this.zzaht)) {
            this.zzbci = true;
            this.zzbcj = 1;
            this.zzbcb = (this.zzbbw && this.zzaht.width == zzhoVar2.width && this.zzaht.height == zzhoVar2.height) ? false : false;
        } else if (this.zzbcl) {
            this.zzbck = 1;
        } else {
            zzhe();
            zzhb();
        }
    }

    public boolean zzfc() {
        return this.zzbco;
    }

    public boolean isReady() {
        if (this.zzaht == null || this.zzbcp) {
            return false;
        }
        if (zzeh() || this.zzbcg >= 0) {
            return true;
        }
        return this.zzbce != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzbce;
    }

    private final boolean zzd(long j, long j2) throws zzhd {
        boolean zza;
        boolean z;
        if (this.zzbcg < 0) {
            if (this.zzbbz && this.zzbcm) {
                try {
                    this.zzbcg = this.zzbbs.dequeueOutputBuffer(this.zzbbp, 0L);
                } catch (IllegalStateException unused) {
                    zzhg();
                    if (this.zzbco) {
                        zzhe();
                    }
                    return false;
                }
            } else {
                this.zzbcg = this.zzbbs.dequeueOutputBuffer(this.zzbbp, 0L);
            }
            int i = this.zzbcg;
            if (i < 0) {
                if (i != -2) {
                    if (i == -3) {
                        this.zzakz = this.zzbbs.getOutputBuffers();
                        return true;
                    }
                    if (this.zzbbx && (this.zzbcn || this.zzbck == 2)) {
                        zzhg();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.zzbbs.getOutputFormat();
                if (this.zzbbw && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.zzbcc = true;
                } else {
                    if (this.zzbca) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    onOutputFormatChanged(this.zzbbs, outputFormat);
                }
                return true;
            } else if (this.zzbcc) {
                this.zzbcc = false;
                this.zzbbs.releaseOutputBuffer(i, false);
                this.zzbcg = -1;
                return true;
            } else if ((this.zzbbp.flags & 4) != 0) {
                zzhg();
                this.zzbcg = -1;
                return false;
            } else {
                ByteBuffer byteBuffer = this.zzakz[this.zzbcg];
                if (byteBuffer != null) {
                    byteBuffer.position(this.zzbbp.offset);
                    byteBuffer.limit(this.zzbbp.offset + this.zzbbp.size);
                }
                long j3 = this.zzbbp.presentationTimeUs;
                int size = this.zzbbo.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    } else if (this.zzbbo.get(i2).longValue() == j3) {
                        this.zzbbo.remove(i2);
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                this.zzbch = z;
            }
        }
        if (this.zzbbz && this.zzbcm) {
            try {
                zza = zza(j, j2, this.zzbbs, this.zzakz[this.zzbcg], this.zzbcg, this.zzbbp.flags, this.zzbbp.presentationTimeUs, this.zzbch);
            } catch (IllegalStateException unused2) {
                zzhg();
                if (this.zzbco) {
                    zzhe();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.zzbbs;
            ByteBuffer[] byteBufferArr = this.zzakz;
            int i3 = this.zzbcg;
            zza = zza(j, j2, mediaCodec, byteBufferArr[i3], i3, this.zzbbp.flags, this.zzbbp.presentationTimeUs, this.zzbch);
        }
        if (zza) {
            long j4 = this.zzbbp.presentationTimeUs;
            this.zzbcg = -1;
            return true;
        }
        return false;
    }

    private final void zzhg() throws zzhd {
        if (this.zzbck == 2) {
            zzhe();
            zzhb();
            return;
        }
        this.zzbco = true;
        zzgc();
    }
}
