package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcul implements zzcrh<zzchu, zzdlx, zzcso> {
    private final Executor zzfmk;
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcul(Context context, Executor executor, zzchx zzchxVar) {
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzgno = zzchxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr {
        try {
            zzdln zzdlnVar = zzdljVar.zzhbp.zzfqn;
            if (zzdlnVar.zzhcb.zzhbf == zzdlf.zzhbj) {
                zzcrgVar.zzdkn.zzc(this.zzvr, zzdlnVar.zzhbu, zzdkxVar.zzhar.toString(), zzcrgVar.zzglc);
            } else {
                zzcrgVar.zzdkn.zzb(this.zzvr, zzdlnVar.zzhbu, zzdkxVar.zzhar.toString(), zzcrgVar.zzglc);
            }
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcrgVar.zzfqh);
            zzaxy.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzchu zzb(zzdlj zzdljVar, zzdkx zzdkxVar, final zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        zzchw zza = this.zzgno.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzchv(new zzcaz(zzcrgVar) { // from class: com.google.android.gms.internal.ads.zzcuo
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
                    ((zzdlx) zzcrgVar2.zzdkn).zzch(context);
                } catch (zzdlr e) {
                    throw new zzcbc(e.getCause());
                }
            }
        }));
        zza.zzaem().zza((zzbto) new zzbll(zzcrgVar.zzdkn), this.zzfmk);
        zzcrgVar.zzglc.zzb(zza.zzagj());
        return zza.zzagh();
    }
}
