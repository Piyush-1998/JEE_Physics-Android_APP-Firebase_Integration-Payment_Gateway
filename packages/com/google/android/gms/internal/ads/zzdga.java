package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdga implements zzden<zzdgb> {
    private String packageName;
    private zzdvw zzgay;
    private zzaxc zzgwk;

    public zzdga(zzaxc zzaxcVar, zzdvw zzdvwVar, String str) {
        this.zzgwk = zzaxcVar;
        this.zzgay = zzdvwVar;
        this.packageName = str;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdgb> zzaqs() {
        new zzbbq();
        final zzdvt<String> zzaf = zzdvl.zzaf(null);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvc)).booleanValue()) {
            zzaf = this.zzgwk.zzeg(this.packageName);
        }
        final zzdvt<String> zzeh = this.zzgwk.zzeh(this.packageName);
        return zzdvl.zzb(zzaf, zzeh).zza(new Callable(zzaf, zzeh) { // from class: com.google.android.gms.internal.ads.zzdgd
            private final zzdvt zzfsi;
            private final zzdvt zzgbt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbt = zzaf;
                this.zzfsi = zzeh;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzdgb((String) this.zzgbt.get(), (String) this.zzfsi.get());
            }
        }, zzbbi.zzedu);
    }
}
