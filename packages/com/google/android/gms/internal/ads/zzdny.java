package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdny {
    private final long zzhgb;
    private long zzhgd;
    private final zzdnx zzhgc = new zzdnx();
    private int zzhge = 0;
    private int zzhgf = 0;
    private int zzhga = 0;

    public zzdny() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
        this.zzhgb = currentTimeMillis;
        this.zzhgd = currentTimeMillis;
    }

    public final void zzauc() {
        this.zzhgd = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
        this.zzhge++;
    }

    public final void zzaud() {
        this.zzhgf++;
        this.zzhgc.zzhfz = true;
    }

    public final void zzaue() {
        this.zzhga++;
        this.zzhgc.zzhga++;
    }

    public final long getCreationTimeMillis() {
        return this.zzhgb;
    }

    public final long zzatf() {
        return this.zzhgd;
    }

    public final int zzatg() {
        return this.zzhge;
    }

    public final zzdnx zzauf() {
        zzdnx zzdnxVar = (zzdnx) this.zzhgc.clone();
        zzdnx zzdnxVar2 = this.zzhgc;
        zzdnxVar2.zzhfz = false;
        zzdnxVar2.zzhga = 0;
        return zzdnxVar;
    }

    public final String zzats() {
        return "Created: " + this.zzhgb + " Last accessed: " + this.zzhgd + " Accesses: " + this.zzhge + "\nEntries retrieved: Valid: " + this.zzhgf + " Stale: " + this.zzhga;
    }
}
