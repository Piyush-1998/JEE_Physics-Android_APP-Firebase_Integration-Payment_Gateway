package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmt {
    private zzdmw zzhdi = null;
    private zzdmw zzhdj = null;
    private zzdmw zzhdk = null;
    private zzdmw zzhdl = null;
    private zzdmw zzhdm = null;
    private zzdmw zzhdn = null;
    private zzdmw zzhdo = null;
    private zzdmw zzhdp = null;

    public final void zza(zzdmw zzdmwVar) {
        this.zzhdl = zzdmwVar;
    }

    public final void onAdClosed() {
        zzdmw zzdmwVar = this.zzhdl;
        if (zzdmwVar != null) {
            zzdmwVar.execute();
        }
    }
}
