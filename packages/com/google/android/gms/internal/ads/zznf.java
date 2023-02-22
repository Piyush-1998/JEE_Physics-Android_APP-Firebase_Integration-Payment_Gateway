package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zznf {
    private int length;
    private int zzbfl;
    private int zzbfm;
    private int zzbfn;
    private zzho zzbfs;
    private int zzbfh = 1000;
    private int[] zzbfi = new int[1000];
    private long[] zzaok = new long[1000];
    private long[] zzaom = new long[1000];
    private int[] zzaxg = new int[1000];
    private int[] zzaoj = new int[1000];
    private zzkf[] zzbfj = new zzkf[1000];
    private zzho[] zzbfk = new zzho[1000];
    private long zzbfo = Long.MIN_VALUE;
    private long zzbfp = Long.MIN_VALUE;
    private boolean zzbfr = true;
    private boolean zzbfq = true;

    public final void zzhz() {
        this.zzbfl = 0;
        this.zzbfm = 0;
        this.zzbfn = 0;
        this.length = 0;
        this.zzbfq = true;
    }

    public final void zzia() {
        this.zzbfo = Long.MIN_VALUE;
        this.zzbfp = Long.MIN_VALUE;
    }

    public final int zzib() {
        return this.zzbfl + this.length;
    }

    public final synchronized boolean zzic() {
        return this.length != 0;
    }

    public final synchronized zzho zzid() {
        if (this.zzbfr) {
            return null;
        }
        return this.zzbfs;
    }

    public final synchronized long zzht() {
        return Math.max(this.zzbfo, this.zzbfp);
    }

    public final synchronized int zza(zzhq zzhqVar, zzjk zzjkVar, boolean z, boolean z2, zzho zzhoVar, zzni zzniVar) {
        if (!zzic()) {
            if (z2) {
                zzjkVar.setFlags(4);
                return -4;
            } else if (this.zzbfs == null || (!z && this.zzbfs == zzhoVar)) {
                return -3;
            } else {
                zzhqVar.zzaht = this.zzbfs;
                return -5;
            }
        }
        if (!z && this.zzbfk[this.zzbfm] == zzhoVar) {
            if (zzjkVar.zzdd == null) {
                return -3;
            }
            zzjkVar.zzanx = this.zzaom[this.zzbfm];
            zzjkVar.setFlags(this.zzaxg[this.zzbfm]);
            zzniVar.size = this.zzaoj[this.zzbfm];
            zzniVar.zzawj = this.zzaok[this.zzbfm];
            zzniVar.zzarm = this.zzbfj[this.zzbfm];
            this.zzbfo = Math.max(this.zzbfo, zzjkVar.zzanx);
            this.length--;
            int i = this.zzbfm + 1;
            this.zzbfm = i;
            this.zzbfl++;
            if (i == this.zzbfh) {
                this.zzbfm = 0;
            }
            zzniVar.zzbgg = this.length > 0 ? this.zzaok[this.zzbfm] : zzniVar.zzawj + zzniVar.size;
            return -4;
        }
        zzhqVar.zzaht = this.zzbfk[this.zzbfm];
        return -5;
    }

    public final synchronized long zzie() {
        if (zzic()) {
            int i = ((this.zzbfm + this.length) - 1) % this.zzbfh;
            this.zzbfm = (this.zzbfm + this.length) % this.zzbfh;
            this.zzbfl += this.length;
            this.length = 0;
            return this.zzaok[i] + this.zzaoj[i];
        }
        return -1L;
    }

    public final synchronized long zzd(long j, boolean z) {
        if (zzic() && j >= this.zzaom[this.zzbfm]) {
            if (j <= this.zzbfp || z) {
                int i = 0;
                int i2 = this.zzbfm;
                int i3 = -1;
                while (i2 != this.zzbfn && this.zzaom[i2] <= j) {
                    if ((this.zzaxg[i2] & 1) != 0) {
                        i3 = i;
                    }
                    i2 = (i2 + 1) % this.zzbfh;
                    i++;
                }
                if (i3 == -1) {
                    return -1L;
                }
                int i4 = (this.zzbfm + i3) % this.zzbfh;
                this.zzbfm = i4;
                this.zzbfl += i3;
                this.length -= i3;
                return this.zzaok[i4];
            }
            return -1L;
        }
        return -1L;
    }

    public final synchronized boolean zzg(zzho zzhoVar) {
        if (zzhoVar == null) {
            this.zzbfr = true;
            return false;
        }
        this.zzbfr = false;
        if (zzpq.zza(zzhoVar, this.zzbfs)) {
            return false;
        }
        this.zzbfs = zzhoVar;
        return true;
    }

    public final synchronized void zza(long j, int i, long j2, int i2, zzkf zzkfVar) {
        if (this.zzbfq) {
            if ((i & 1) == 0) {
                return;
            }
            this.zzbfq = false;
        }
        zzoz.checkState(!this.zzbfr);
        zzei(j);
        this.zzaom[this.zzbfn] = j;
        this.zzaok[this.zzbfn] = j2;
        this.zzaoj[this.zzbfn] = i2;
        this.zzaxg[this.zzbfn] = i;
        this.zzbfj[this.zzbfn] = zzkfVar;
        this.zzbfk[this.zzbfn] = this.zzbfs;
        this.zzbfi[this.zzbfn] = 0;
        int i3 = this.length + 1;
        this.length = i3;
        if (i3 == this.zzbfh) {
            int i4 = this.zzbfh + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            zzkf[] zzkfVarArr = new zzkf[i4];
            zzho[] zzhoVarArr = new zzho[i4];
            int i5 = this.zzbfh - this.zzbfm;
            System.arraycopy(this.zzaok, this.zzbfm, jArr, 0, i5);
            System.arraycopy(this.zzaom, this.zzbfm, jArr2, 0, i5);
            System.arraycopy(this.zzaxg, this.zzbfm, iArr2, 0, i5);
            System.arraycopy(this.zzaoj, this.zzbfm, iArr3, 0, i5);
            System.arraycopy(this.zzbfj, this.zzbfm, zzkfVarArr, 0, i5);
            System.arraycopy(this.zzbfk, this.zzbfm, zzhoVarArr, 0, i5);
            System.arraycopy(this.zzbfi, this.zzbfm, iArr, 0, i5);
            int i6 = this.zzbfm;
            System.arraycopy(this.zzaok, 0, jArr, i5, i6);
            System.arraycopy(this.zzaom, 0, jArr2, i5, i6);
            System.arraycopy(this.zzaxg, 0, iArr2, i5, i6);
            System.arraycopy(this.zzaoj, 0, iArr3, i5, i6);
            System.arraycopy(this.zzbfj, 0, zzkfVarArr, i5, i6);
            System.arraycopy(this.zzbfk, 0, zzhoVarArr, i5, i6);
            System.arraycopy(this.zzbfi, 0, iArr, i5, i6);
            this.zzaok = jArr;
            this.zzaom = jArr2;
            this.zzaxg = iArr2;
            this.zzaoj = iArr3;
            this.zzbfj = zzkfVarArr;
            this.zzbfk = zzhoVarArr;
            this.zzbfi = iArr;
            this.zzbfm = 0;
            this.zzbfn = this.zzbfh;
            this.length = this.zzbfh;
            this.zzbfh = i4;
            return;
        }
        int i7 = this.zzbfn + 1;
        this.zzbfn = i7;
        if (i7 == this.zzbfh) {
            this.zzbfn = 0;
        }
    }

    public final synchronized void zzei(long j) {
        this.zzbfp = Math.max(this.zzbfp, j);
    }
}
