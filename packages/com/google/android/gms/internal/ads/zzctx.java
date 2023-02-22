package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctx extends zzcty<zzbni> {
    private final zzbxj zzetx;
    private final zzcbj zzetz;
    private final zzcwh zzfga;
    private final ViewGroup zzfnx;
    private final zzbvb zzfpp;
    private final zzbii zzgmy;
    private final zzbsg.zza zzgmz;

    public zzctx(zzbii zzbiiVar, zzbsg.zza zzaVar, zzcwh zzcwhVar, zzbxj zzbxjVar, zzcbj zzcbjVar, zzbvb zzbvbVar, ViewGroup viewGroup) {
        this.zzgmy = zzbiiVar;
        this.zzgmz = zzaVar;
        this.zzfga = zzcwhVar;
        this.zzetx = zzbxjVar;
        this.zzetz = zzcbjVar;
        this.zzfpp = zzbvbVar;
        this.zzfnx = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzcty
    protected final zzdvt<zzbni> zza(zzdln zzdlnVar, Bundle bundle) {
        return this.zzgmy.zzadq().zzc(this.zzgmz.zza(zzdlnVar).zzf(bundle).zzajj()).zzc(this.zzetx).zza(this.zzfga).zzb(this.zzetz).zza(new zzbpa(this.zzfpp)).zzb(new zzbnd(this.zzfnx)).zzafp().zzafc().zzaiv();
    }
}
