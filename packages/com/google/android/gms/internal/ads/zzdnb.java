package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdnb {
    private final zzdne zzhdx = new zzdne();
    private int zzhdy;
    private int zzhdz;
    private int zzhea;
    private int zzheb;
    private int zzhec;

    public final void zzatm() {
        this.zzhea++;
    }

    public final void zzatn() {
        this.zzheb++;
    }

    public final void zzato() {
        this.zzhdy++;
        this.zzhdx.zzher = true;
    }

    public final void zzatp() {
        this.zzhdz++;
        this.zzhdx.zzhes = true;
    }

    public final void zzatq() {
        this.zzhec++;
    }

    public final zzdne zzatr() {
        zzdne zzdneVar = (zzdne) this.zzhdx.clone();
        zzdne zzdneVar2 = this.zzhdx;
        zzdneVar2.zzher = false;
        zzdneVar2.zzhes = false;
        return zzdneVar;
    }

    public final String zzats() {
        return "\n\tPool does not exist: " + this.zzhea + "\n\tNew pools created: " + this.zzhdy + "\n\tPools removed: " + this.zzhdz + "\n\tEntries added: " + this.zzhec + "\n\tNo entries retrieved: " + this.zzheb + "\n";
    }
}
