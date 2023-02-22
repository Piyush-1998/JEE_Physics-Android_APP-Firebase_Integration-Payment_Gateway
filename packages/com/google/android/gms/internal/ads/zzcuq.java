package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcuq implements zzcrh<zzchu, zzapa, zzcso> {
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcuq(Context context, zzchx zzchxVar) {
        this.zzvr = context;
        this.zzgno = zzchxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr {
        try {
            zzcrgVar.zzdkn.zzdr(zzdkxVar.zzdln);
            if (zzdljVar.zzhbp.zzfqn.zzhcb.zzhbf == zzdlf.zzhbj) {
                zzcrgVar.zzdkn.zzb(zzdkxVar.zzeqb, zzdkxVar.zzhar.toString(), zzdljVar.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), new zzcus(this, zzcrgVar), zzcrgVar.zzglc);
            } else {
                zzcrgVar.zzdkn.zza(zzdkxVar.zzeqb, zzdkxVar.zzhar.toString(), zzdljVar.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), new zzcus(this, zzcrgVar), zzcrgVar.zzglc);
            }
        } catch (RemoteException e) {
            zzaxy.zza("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzchu zzb(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        zzcsy zzcsyVar = new zzcsy(zzdkxVar, zzcrgVar.zzdkn, true);
        zzchw zza = this.zzgno.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzchv(zzcsyVar));
        zzcsyVar.zza(zza.zzaep());
        zzcrgVar.zzglc.zzb(zza.zzagk());
        return zza.zzagh();
    }
}
