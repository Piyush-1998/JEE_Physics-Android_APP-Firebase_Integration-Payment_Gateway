package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbw implements zzelo<zzbpi<zzbni>> {
    private final zzelx<zzbvb> zzfrw;
    private final zzelx<zzbii> zzfwi;
    private final zzelx<zzbsg.zza> zzfwj;
    private final zzelx<zzbxj> zzfwk;
    private final zzelx<zzcbj> zzfwl;

    public zzcbw(zzelx<zzbii> zzelxVar, zzelx<zzbsg.zza> zzelxVar2, zzelx<zzbxj> zzelxVar3, zzelx<zzcbj> zzelxVar4, zzelx<zzbvb> zzelxVar5) {
        this.zzfwi = zzelxVar;
        this.zzfwj = zzelxVar2;
        this.zzfwk = zzelxVar3;
        this.zzfwl = zzelxVar4;
        this.zzfrw = zzelxVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbpi) zzelu.zza(this.zzfwi.get().zzadq().zzc(this.zzfwj.get().zzajj()).zzc(this.zzfwk.get()).zzb(this.zzfwl.get()).zza(new zzcwh(null)).zza(new zzbpa(this.zzfrw.get())).zzb(new zzbnd(null)).zzafp().zzafw(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
