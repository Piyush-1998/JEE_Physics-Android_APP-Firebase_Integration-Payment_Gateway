package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcrw implements zzelo<zzcrn> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzcih> zzgac;
    private final zzelx<zzboe> zzglj;
    private final zzelx<zzdsl<zzdkx, zzayy>> zzglm;

    public zzcrw(zzelx<zzboe> zzelxVar, zzelx<Context> zzelxVar2, zzelx<Executor> zzelxVar3, zzelx<zzcih> zzelxVar4, zzelx<zzdln> zzelxVar5, zzelx<zzdsl<zzdkx, zzayy>> zzelxVar6) {
        this.zzglj = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfol = zzelxVar3;
        this.zzgac = zzelxVar4;
        this.zzfos = zzelxVar5;
        this.zzglm = zzelxVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcrn(this.zzglj.get(), this.zzert.get(), this.zzfol.get(), this.zzgac.get(), this.zzfos.get(), this.zzglm.get());
    }
}
