package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgl implements zzelo<zzcga> {
    private final zzelx<Executor> zzfol;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzcih> zzgac;

    public zzcgl(zzelx<zzdln> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzcih> zzelxVar3) {
        this.zzfos = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzgac = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcga(this.zzfos.get(), this.zzfol.get(), this.zzgac.get());
    }
}
