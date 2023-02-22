package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcrv implements zzcrh<zzbni, zzdlx, zzcso> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzboe zzglh;
    private final Context zzvr;

    public zzcrv(Context context, zzbbg zzbbgVar, zzboe zzboeVar, Executor executor) {
        this.zzvr = context;
        this.zzbop = zzbbgVar;
        this.zzglh = zzboeVar;
        this.zzfmk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr {
        zzvj zzb;
        zzvj zzvjVar = zzdljVar.zzhbp.zzfqn.zzbpb;
        if (zzvjVar.zzchu) {
            zzb = new zzvj(this.zzvr, com.google.android.gms.ads.zzb.zza(zzvjVar.width, zzvjVar.height));
        } else {
            zzb = zzdls.zzb(this.zzvr, zzdkxVar.zzhaq);
        }
        zzvj zzvjVar2 = zzb;
        if (this.zzbop.zzedr < 4100000) {
            zzcrgVar.zzdkn.zza(this.zzvr, zzvjVar2, zzdljVar.zzhbp.zzfqn.zzhbu, zzdkxVar.zzhar.toString(), zzcrgVar.zzglc);
        } else {
            zzcrgVar.zzdkn.zza(this.zzvr, zzvjVar2, zzdljVar.zzhbp.zzfqn.zzhbu, zzdkxVar.zzhar.toString(), zzbab.zza(zzdkxVar.zzhao), zzcrgVar.zzglc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzbni zzb(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzdlx, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        zzboe zzboeVar = this.zzglh;
        zzbpt zzbptVar = new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh);
        View view = zzcrgVar.zzdkn.getView();
        zzdlx zzdlxVar = zzcrgVar.zzdkn;
        zzdlxVar.getClass();
        zzbnh zza = zzboeVar.zza(zzbptVar, new zzbnl(view, null, zzcry.zza(zzdlxVar), zzdkxVar.zzhaq.get(0)));
        zza.zzaft().zzv(zzcrgVar.zzdkn.getView());
        zza.zzaem().zza((zzbto) new zzbll(zzcrgVar.zzdkn), this.zzfmk);
        zzcrgVar.zzglc.zzb(zza.zzaer());
        return zza.zzafs();
    }
}
