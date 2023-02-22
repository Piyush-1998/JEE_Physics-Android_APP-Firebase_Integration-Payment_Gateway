package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsx implements zzcrh<zzbzr, zzdlx, zzcso> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcsx(Context context, zzbbg zzbbgVar, zzcar zzcarVar, Executor executor) {
        this.zzvr = context;
        this.zzbop = zzbbgVar;
        this.zzglr = zzcarVar;
        this.zzfmk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr {
        if (this.zzbop.zzedr < 4100000) {
            zzcrgVar.zzdkn.zza(this.zzvr, zzdljVar.zzhbp.zzfqn.zzhbu, zzdkxVar.zzhar.toString(), zzcrgVar.zzglc);
        } else {
            zzcrgVar.zzdkn.zza(this.zzvr, zzdljVar.zzhbp.zzfqn.zzhbu, zzdkxVar.zzhar.toString(), zzbab.zza(zzdkxVar.zzhao), zzcrgVar.zzglc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzbzr zzb(zzdlj zzdljVar, zzdkx zzdkxVar, final zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        zzbzt zza = this.zzglr.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzbzw(new zzcaz(zzcrgVar) { // from class: com.google.android.gms.internal.ads.zzcta
            private final zzcrg zzglo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglo = zzcrgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcaz
            public final void zza(boolean z, Context context) {
                zzcrg zzcrgVar2 = this.zzglo;
                try {
                    ((zzdlx) zzcrgVar2.zzdkn).setImmersiveMode(z);
                    ((zzdlx) zzcrgVar2.zzdkn).showInterstitial();
                } catch (zzdlr e) {
                    zzaxy.zzfd("Cannot show interstitial.");
                    throw new zzcbc(e.getCause());
                }
            }
        }));
        zza.zzaem().zza((zzbto) new zzbll(zzcrgVar.zzdkn), this.zzfmk);
        zzcrgVar.zzglc.zzb(zza.zzaer());
        return zza.zzagb();
    }
}
