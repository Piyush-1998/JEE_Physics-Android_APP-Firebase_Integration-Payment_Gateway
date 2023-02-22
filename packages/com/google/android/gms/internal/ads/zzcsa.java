package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsa implements zzcrh<zzbni, zzapa, zzcso> {
    private View view;
    private final zzboe zzglh;
    private final Context zzvr;

    public zzcsa(Context context, zzboe zzboeVar) {
        this.zzvr = context;
        this.zzglh = zzboeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final void zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr {
        try {
            zzcrgVar.zzdkn.zzdr(zzdkxVar.zzdln);
            zzcrgVar.zzdkn.zza(zzdkxVar.zzeqb, zzdkxVar.zzhar.toString(), zzdljVar.zzhbp.zzfqn.zzhbu, ObjectWrapper.wrap(this.zzvr), new zzcsb(this, zzcrgVar), zzcrgVar.zzglc, zzdljVar.zzhbp.zzfqn.zzbpb);
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcrh
    public final /* synthetic */ zzbni zzb(zzdlj zzdljVar, zzdkx zzdkxVar, zzcrg<zzapa, zzcso> zzcrgVar) throws zzdlr, zzcuh {
        zzbnh zza = this.zzglh.zza(new zzbpt(zzdljVar, zzdkxVar, zzcrgVar.zzfqh), new zzbnl(this.view, null, new zzbpe(zzcrgVar) { // from class: com.google.android.gms.internal.ads.zzcrz
            private final zzcrg zzglo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglo = zzcrgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbpe
            public final zzyg getVideoController() {
                return zzcsa.zza(this.zzglo);
            }
        }, zzdkxVar.zzhaq.get(0)));
        zza.zzaft().zzv(this.view);
        zzcrgVar.zzglc.zzb(zza.zzaes());
        return zza.zzafs();
    }

    public static final /* synthetic */ zzyg zza(zzcrg zzcrgVar) throws zzdlr {
        try {
            return ((zzapa) zzcrgVar.zzdkn).getVideoController();
        } catch (RemoteException e) {
            throw new zzdlr(e);
        }
    }
}
