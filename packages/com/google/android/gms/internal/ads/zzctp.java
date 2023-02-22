package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctp implements zzcrh<zzcco, zzapa, zzcso> {
    private final zzcbn zzgmp;
    private zzanj zzgmw;
    private final Context zzvr;

    public zzctp(Context context, zzcbn zzcbnVar) {
        this.zzvr = context;
        this.zzgmp = zzcbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr {
        try {
            zzcrgVar.zzdkn.zzdr(zzdkxVar.zzdln);
            zzcrgVar.zzdkn.zza(zzdkxVar.zzeqb, zzdkxVar.zzhar.toString(), zzdljVar.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), new zzctr(this, zzcrgVar), zzcrgVar.zzglc);
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzcco zzb(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        if (!zzdljVar.zzhbp.zzfqn.zzhbw.contains(Integer.toString(6))) {
            throw new zzcuh(zzdmd.zzhcp, "Unified must be used for RTB.");
        }
        zzccv zzb = zzccv.zzb(this.zzgmw);
        if (!zzdljVar.zzhbp.zzfqn.zzhbw.contains(Integer.toString(zzb.zzaln()))) {
            throw new zzcuh(zzdmd.zzhco, "No corresponding native ad listener");
        }
        zzcda zza = this.zzgmp.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzcdh(zzb), new zzcew(null, null, this.zzgmw));
        zzcrgVar.zzglc.zzb(zza.zzaes());
        return zza.zzaet();
    }
}
