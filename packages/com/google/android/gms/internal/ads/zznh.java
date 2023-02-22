package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zznh implements zzkg {
    private final zzok zzbdi;
    private final int zzbfu;
    private zznk zzbfy;
    private zznk zzbfz;
    private zzho zzbga;
    private boolean zzbgb;
    private zzho zzbgc;
    private long zzbgd;
    private int zzbge;
    private zznj zzbgf;
    private final zznf zzbfv = new zznf();
    private final zzni zzbfw = new zzni();
    private final zzpk zzapo = new zzpk(32);
    private final AtomicInteger zzbfx = new AtomicInteger();

    public zznh(zzok zzokVar) {
        this.zzbdi = zzokVar;
        this.zzbfu = zzokVar.zzim();
        this.zzbge = this.zzbfu;
        zznk zznkVar = new zznk(0L, this.zzbfu);
        this.zzbfy = zznkVar;
        this.zzbfz = zznkVar;
    }

    public final void zzk(boolean z) {
        int andSet = this.zzbfx.getAndSet(z ? 0 : 2);
        zzhz();
        this.zzbfv.zzia();
        if (andSet == 2) {
            this.zzbga = null;
        }
    }

    public final int zzib() {
        return this.zzbfv.zzib();
    }

    public final void disable() {
        if (this.zzbfx.getAndSet(2) == 0) {
            zzhz();
        }
    }

    public final boolean zzic() {
        return this.zzbfv.zzic();
    }

    public final zzho zzid() {
        return this.zzbfv.zzid();
    }

    public final long zzht() {
        return this.zzbfv.zzht();
    }

    public final void zzif() {
        long zzie = this.zzbfv.zzie();
        if (zzie != -1) {
            zzej(zzie);
        }
    }

    public final boolean zze(long j, boolean z) {
        long zzd = this.zzbfv.zzd(j, z);
        if (zzd == -1) {
            return false;
        }
        zzej(zzd);
        return true;
    }

    public final int zza(zzhq zzhqVar, zzjk zzjkVar, boolean z, boolean z2, long j) {
        int i;
        int zza = this.zzbfv.zza(zzhqVar, zzjkVar, z, z2, this.zzbga, this.zzbfw);
        if (zza == -5) {
            this.zzbga = zzhqVar.zzaht;
            return -5;
        } else if (zza == -4) {
            if (!zzjkVar.zzgj()) {
                if (zzjkVar.zzanx < j) {
                    zzjkVar.zzac(Integer.MIN_VALUE);
                }
                if (zzjkVar.isEncrypted()) {
                    zzni zzniVar = this.zzbfw;
                    long j2 = zzniVar.zzawj;
                    this.zzapo.reset(1);
                    zza(j2, this.zzapo.data, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzapo.data[0];
                    boolean z3 = (b & 128) != 0;
                    int i2 = b & Byte.MAX_VALUE;
                    if (zzjkVar.zzanw.iv == null) {
                        zzjkVar.zzanw.iv = new byte[16];
                    }
                    zza(j3, zzjkVar.zzanw.iv, i2);
                    long j4 = j3 + i2;
                    if (z3) {
                        this.zzapo.reset(2);
                        zza(j4, this.zzapo.data, 2);
                        j4 += 2;
                        i = this.zzapo.readUnsignedShort();
                    } else {
                        i = 1;
                    }
                    int[] iArr = zzjkVar.zzanw.numBytesOfClearData;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzjkVar.zzanw.numBytesOfEncryptedData;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i3 = i * 6;
                        this.zzapo.reset(i3);
                        zza(j4, this.zzapo.data, i3);
                        j4 += i3;
                        this.zzapo.zzbo(0);
                        for (int i4 = 0; i4 < i; i4++) {
                            iArr2[i4] = this.zzapo.readUnsignedShort();
                            iArr4[i4] = this.zzapo.zzjd();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzniVar.size - ((int) (j4 - zzniVar.zzawj));
                    }
                    zzkf zzkfVar = zzniVar.zzarm;
                    zzjkVar.zzanw.set(i, iArr2, iArr4, zzkfVar.zzaow, zzjkVar.zzanw.iv, zzkfVar.zzaov);
                    int i5 = (int) (j4 - zzniVar.zzawj);
                    zzniVar.zzawj += i5;
                    zzniVar.size -= i5;
                }
                zzjkVar.zzae(this.zzbfw.size);
                long j5 = this.zzbfw.zzawj;
                ByteBuffer byteBuffer = zzjkVar.zzdd;
                int i6 = this.zzbfw.size;
                zzej(j5);
                while (i6 > 0) {
                    int i7 = (int) (j5 - this.zzbfy.zzbgh);
                    int min = Math.min(i6, this.zzbfu - i7);
                    zzoh zzohVar = this.zzbfy.zzbgj;
                    byteBuffer.put(zzohVar.data, zzohVar.zzbh(i7), min);
                    j5 += min;
                    i6 -= min;
                    if (j5 == this.zzbfy.zzawf) {
                        this.zzbdi.zza(zzohVar);
                        this.zzbfy = this.zzbfy.zzii();
                    }
                }
                zzej(this.zzbfw.zzbgg);
            }
            return -4;
        } else {
            if (zza == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
    }

    private final void zza(long j, byte[] bArr, int i) {
        zzej(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zzbfy.zzbgh);
            int min = Math.min(i - i2, this.zzbfu - i3);
            zzoh zzohVar = this.zzbfy.zzbgj;
            System.arraycopy(zzohVar.data, zzohVar.zzbh(i3), bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.zzbfy.zzawf) {
                this.zzbdi.zza(zzohVar);
                this.zzbfy = this.zzbfy.zzii();
            }
        }
    }

    private final void zzej(long j) {
        while (j >= this.zzbfy.zzawf) {
            this.zzbdi.zza(this.zzbfy.zzbgj);
            this.zzbfy = this.zzbfy.zzii();
        }
    }

    public final void zza(zznj zznjVar) {
        this.zzbgf = zznjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzho zzhoVar) {
        zzho zzhoVar2 = zzhoVar == null ? null : zzhoVar;
        boolean zzg = this.zzbfv.zzg(zzhoVar2);
        this.zzbgc = zzhoVar;
        this.zzbgb = false;
        zznj zznjVar = this.zzbgf;
        if (zznjVar == null || !zzg) {
            return;
        }
        zznjVar.zzf(zzhoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final int zza(zzjy zzjyVar, int i, boolean z) throws IOException, InterruptedException {
        if (!zzig()) {
            int zzah = zzjyVar.zzah(i);
            if (zzah != -1) {
                return zzah;
            }
            throw new EOFException();
        }
        try {
            int zzbc = zzbc(i);
            zzoh zzohVar = this.zzbfz.zzbgj;
            int read = zzjyVar.read(zzohVar.data, zzohVar.zzbh(this.zzbge), zzbc);
            if (read == -1) {
                throw new EOFException();
            }
            this.zzbge += read;
            this.zzbgd += read;
            return read;
        } finally {
            zzih();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zza(zzpk zzpkVar, int i) {
        if (!zzig()) {
            zzpkVar.zzbp(i);
            return;
        }
        while (i > 0) {
            int zzbc = zzbc(i);
            zzoh zzohVar = this.zzbfz.zzbgj;
            zzpkVar.zze(zzohVar.data, zzohVar.zzbh(this.zzbge), zzbc);
            this.zzbge += zzbc;
            this.zzbgd += zzbc;
            i -= zzbc;
        }
        zzih();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zza(long j, int i, int i2, int i3, zzkf zzkfVar) {
        if (!zzig()) {
            this.zzbfv.zzei(j);
            return;
        }
        try {
            this.zzbfv.zza(j, i, (this.zzbgd - i2) - i3, i2, zzkfVar);
        } finally {
            zzih();
        }
    }

    private final boolean zzig() {
        return this.zzbfx.compareAndSet(0, 1);
    }

    private final void zzih() {
        if (this.zzbfx.compareAndSet(1, 0)) {
            return;
        }
        zzhz();
    }

    private final void zzhz() {
        this.zzbfv.zzhz();
        zznk zznkVar = this.zzbfy;
        if (zznkVar.zzbgi) {
            int i = (this.zzbfz.zzbgi ? 1 : 0) + (((int) (this.zzbfz.zzbgh - zznkVar.zzbgh)) / this.zzbfu);
            zzoh[] zzohVarArr = new zzoh[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzohVarArr[i2] = zznkVar.zzbgj;
                zznkVar = zznkVar.zzii();
            }
            this.zzbdi.zza(zzohVarArr);
        }
        zznk zznkVar2 = new zznk(0L, this.zzbfu);
        this.zzbfy = zznkVar2;
        this.zzbfz = zznkVar2;
        this.zzbgd = 0L;
        this.zzbge = this.zzbfu;
        this.zzbdi.zzn();
    }

    private final int zzbc(int i) {
        if (this.zzbge == this.zzbfu) {
            this.zzbge = 0;
            if (this.zzbfz.zzbgi) {
                this.zzbfz = this.zzbfz.zzbgk;
            }
            zznk zznkVar = this.zzbfz;
            zzoh zzil = this.zzbdi.zzil();
            zznk zznkVar2 = new zznk(this.zzbfz.zzawf, this.zzbfu);
            zznkVar.zzbgj = zzil;
            zznkVar.zzbgk = zznkVar2;
            zznkVar.zzbgi = true;
        }
        return Math.min(i, this.zzbfu - this.zzbge);
    }
}
