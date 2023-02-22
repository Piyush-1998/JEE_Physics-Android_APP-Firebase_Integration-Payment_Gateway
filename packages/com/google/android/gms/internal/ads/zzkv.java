package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzkv {
    public int index;
    public final int length;
    public int zzawi;
    public long zzawj;
    private final boolean zzawk;
    private final zzpk zzawl;
    private final zzpk zzawm;
    private int zzawn;
    private int zzawo;

    public zzkv(zzpk zzpkVar, zzpk zzpkVar2, boolean z) {
        this.zzawm = zzpkVar;
        this.zzawl = zzpkVar2;
        this.zzawk = z;
        zzpkVar2.zzbo(12);
        this.length = zzpkVar2.zzjd();
        zzpkVar.zzbo(12);
        this.zzawo = zzpkVar.zzjd();
        zzoz.checkState(zzpkVar.readInt() == 1, "first_chunk must be 1");
        this.index = -1;
    }

    public final boolean zzgv() {
        int i = this.index + 1;
        this.index = i;
        if (i == this.length) {
            return false;
        }
        this.zzawj = this.zzawk ? this.zzawl.zzje() : this.zzawl.zzja();
        if (this.index == this.zzawn) {
            this.zzawi = this.zzawm.zzjd();
            this.zzawm.zzbp(4);
            int i2 = this.zzawo - 1;
            this.zzawo = i2;
            this.zzawn = i2 > 0 ? this.zzawm.zzjd() - 1 : -1;
        }
        return true;
    }
}
