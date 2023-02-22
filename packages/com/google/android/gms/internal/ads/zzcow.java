package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcow implements zzcox {
    private final zzdvw zzgay;
    private final Map<String, zzelx<zzcox>> zzgiq;
    private final zzbve zzgir;

    public zzcow(Map<String, zzelx<zzcox>> map, zzdvw zzdvwVar, zzbve zzbveVar) {
        this.zzgiq = map;
        this.zzgay = zzdvwVar;
        this.zzgir = zzbveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcox
    public final zzdvt<zzdlj> zzh(final zzasp zzaspVar) {
        this.zzgir.zzd(zzaspVar);
        zzdvt<zzdlj> immediateFailedFuture = zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcq));
        for (String str : ((String) zzwe.zzpu().zzd(zzaat.zzcxv)).split(",")) {
            final zzelx<zzcox> zzelxVar = this.zzgiq.get(str.trim());
            if (zzelxVar != null) {
                immediateFailedFuture = zzdvl.zzb(immediateFailedFuture, zzcmt.class, new zzduv(zzelxVar, zzaspVar) { // from class: com.google.android.gms.internal.ads.zzcov
                    private final zzasp zzggz;
                    private final zzelx zzgip;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgip = zzelxVar;
                        this.zzggz = zzaspVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzduv
                    public final zzdvt zzf(Object obj) {
                        zzelx zzelxVar2 = this.zzgip;
                        zzcmt zzcmtVar = (zzcmt) obj;
                        return ((zzcox) zzelxVar2.get()).zzh(this.zzggz);
                    }
                }, this.zzgay);
            }
        }
        zzdvl.zza(immediateFailedFuture, new zzcoy(this), zzbbi.zzedz);
        return immediateFailedFuture;
    }
}
