package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxc implements zzelo<zzcwz> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzwl> zzgpu;
    private final zzelx<zzbni> zzgpv;

    public zzcxc(zzelx<Context> zzelxVar, zzelx<zzwl> zzelxVar2, zzelx<zzdln> zzelxVar3, zzelx<zzbni> zzelxVar4) {
        this.zzert = zzelxVar;
        this.zzgpu = zzelxVar2;
        this.zzfos = zzelxVar3;
        this.zzgpv = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcwz(this.zzert.get(), this.zzgpu.get(), this.zzfos.get(), this.zzgpv.get());
    }
}
