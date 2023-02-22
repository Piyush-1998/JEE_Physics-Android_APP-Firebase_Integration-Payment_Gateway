package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbse;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdit<R extends zzbse<? extends zzbpd>> {
    private final Executor executor;
    private final zzdjb<R> zzgyn;
    private final zzdna zzgyr;
    private final zzdiy zzgyy;
    private zzdix zzgyz;

    public zzdit(zzdna zzdnaVar, zzdiy zzdiyVar, zzdjb<R> zzdjbVar, Executor executor) {
        this.zzgyr = zzdnaVar;
        this.zzgyy = zzdiyVar;
        this.zzgyn = zzdjbVar;
        this.executor = executor;
    }

    public final zzdvt<zzdix> zzasg() {
        zzdvt zza;
        zzdix zzdixVar = this.zzgyz;
        if (zzdixVar != null) {
            return zzdvl.zzaf(zzdixVar);
        }
        if (!zzacs.zzdbg.get().booleanValue()) {
            zzdix zzdixVar2 = new zzdix(null, zzash(), null);
            this.zzgyz = zzdixVar2;
            zza = zzdvl.zzaf(zzdixVar2);
        } else {
            zza = zzdvc.zzg(this.zzgyn.zzc(this.zzgyy).zza(new zzdij(this.zzgyr.zzatl().zzhem)).zzael().zzafc().zza(this.zzgyr.zzatl())).zza(new zzdiu(this), this.executor).zza(zzcpa.class, new zzdiv(this), this.executor);
        }
        return zzdvl.zzb(zza, zzdis.zzdwg, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzdnk zzash() {
        zzdln zzafj = this.zzgyn.zzc(this.zzgyy).zzael().zzafj();
        return this.zzgyr.zza(zzafj.zzhbu, zzafj.zzhbv, zzafj.zzhby);
    }
}
