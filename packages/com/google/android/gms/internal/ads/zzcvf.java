package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvf implements zzcrh<zzchu, zzdlx, zzcsn> {
    private final Executor zzfmk;
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcvf(Context context, Executor executor, zzchx zzchxVar) {
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzgno = zzchxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcsn> zzcrgVar) throws zzdlr {
        if (!zzcrgVar.zzdkn.isInitialized()) {
            zzcrgVar.zzglc.zza(new zzcvh(this, zzdljVar, zzdkxVar, zzcrgVar));
            zzcrgVar.zzdkn.zza(this.zzvr, zzdljVar.zzhbp.zzfqn.zzhbu, (String) null, zzcrgVar.zzglc, zzdkxVar.zzhar.toString());
            return;
        }
        zzc(zzdljVar, zzdkxVar, zzcrgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcsn> zzcrgVar) {
        try {
            zzcrgVar.zzdkn.zza(zzdljVar.zzhbp.zzfqn.zzhbu, zzdkxVar.zzhar.toString());
        } catch (Exception e) {
            String valueOf = String.valueOf(zzcrgVar.zzfqh);
            zzaxy.zzd(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzchu zzb(zzdlj zzdljVar, zzdkx zzdkxVar, final zzcrg<zzdlx, zzcsn> zzcrgVar) throws zzdlr, zzcuh {
        zzchw zza = this.zzgno.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzchv(new zzcaz(zzcrgVar) { // from class: com.google.android.gms.internal.ads.zzcvi
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
                    ((zzdlx) zzcrgVar2.zzdkn).showVideo();
                } catch (zzdlr e) {
                    zzaxy.zzd("Cannot show rewarded video.", e);
                    throw new zzcbc(e.getCause());
                }
            }
        }));
        zza.zzaem().zza((zzbto) new zzbll(zzcrgVar.zzdkn), this.zzfmk);
        zzbtu zzaen = zza.zzaen();
        zzbst zzaeo = zza.zzaeo();
        zzcrgVar.zzglc.zza(new zzcvj(this, zza.zzagc(), zzaeo, zzaen, zza.zzagi()));
        return zza.zzagh();
    }
}
