package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctc implements zzcrh<zzbzr, zzapa, zzcso> {
    private final zzcar zzglr;
    private final Context zzvr;

    public zzctc(Context context, zzcar zzcarVar) {
        this.zzvr = context;
        this.zzglr = zzcarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr {
        try {
            zzcrgVar.zzdkn.zzdr(zzdkxVar.zzdln);
            zzcrgVar.zzdkn.zza(zzdkxVar.zzeqb, zzdkxVar.zzhar.toString(), zzdljVar.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), new zzcte(this, zzcrgVar), zzcrgVar.zzglc);
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzbzr zzb(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        zzcsy zzcsyVar = new zzcsy(zzdkxVar, zzcrgVar.zzdkn, false);
        zzbzt zza = this.zzglr.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzbzw(zzcsyVar));
        zzcsyVar.zza(zza.zzaep());
        zzcrgVar.zzglc.zzb(zza.zzaes());
        return zza.zzagb();
    }
}
