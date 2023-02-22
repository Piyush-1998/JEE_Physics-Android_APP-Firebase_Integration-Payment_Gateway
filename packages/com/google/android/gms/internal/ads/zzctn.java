package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctn implements zzcrh<zzcco, zzdlx, zzcso> {
    private final Executor zzfmk;
    private final zzcbn zzgmp;
    private final Context zzvr;

    public zzctn(Context context, zzcbn zzcbnVar, Executor executor) {
        this.zzvr = context;
        this.zzgmp = zzcbnVar;
        this.zzfmk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr {
        zzcrgVar.zzdkn.zza(this.zzvr, zzdljVar.zzhbp.zzfqn.zzhbu, zzdkxVar.zzhar.toString(), zzbab.zza(zzdkxVar.zzhao), zzcrgVar.zzglc, zzdljVar.zzhbp.zzfqn.zzdla, zzdljVar.zzhbp.zzfqn.zzhbw);
    }

    private static boolean zza(zzdlj zzdljVar, int i) {
        return zzdljVar.zzhbp.zzfqn.zzhbw.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzcco zzb(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        zzccv zza;
        zzand zztp = zzcrgVar.zzdkn.zztp();
        zzani zztq = zzcrgVar.zzdkn.zztq();
        zzanj zztv = zzcrgVar.zzdkn.zztv();
        if (zztv != null && zza(zzdljVar, 6)) {
            zza = zzccv.zzb(zztv);
        } else if (zztp != null && zza(zzdljVar, 6)) {
            zza = zzccv.zzb(zztp);
        } else if (zztp != null && zza(zzdljVar, 2)) {
            zza = zzccv.zza(zztp);
        } else if (zztq != null && zza(zzdljVar, 6)) {
            zza = zzccv.zzb(zztq);
        } else if (zztq != null && zza(zzdljVar, 1)) {
            zza = zzccv.zza(zztq);
        } else {
            throw new zzcuh(zzdmd.zzhco, "No native ad mappers");
        }
        if (!zzdljVar.zzhbp.zzfqn.zzhbw.contains(Integer.toString(zza.zzaln()))) {
            throw new zzcuh(zzdmd.zzhco, "No corresponding native ad listener");
        }
        zzcda zza2 = this.zzgmp.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzcdh(zza), new zzcew(zztq, zztp, zztv));
        zzcrgVar.zzglc.zzb(zza2.zzaer());
        zza2.zzaem().zza((zzbto) new zzbll(zzcrgVar.zzdkn), this.zzfmk);
        return zza2.zzaet();
    }
}
