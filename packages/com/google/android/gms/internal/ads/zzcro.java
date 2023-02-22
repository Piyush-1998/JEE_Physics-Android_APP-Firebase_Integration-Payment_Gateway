package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcro implements zzelo<zzcrk> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzcih> zzgac;
    private final zzelx<zzbmw> zzglj;

    public zzcro(zzelx<zzbmw> zzelxVar, zzelx<Context> zzelxVar2, zzelx<Executor> zzelxVar3, zzelx<zzcih> zzelxVar4, zzelx<zzdln> zzelxVar5) {
        this.zzglj = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfol = zzelxVar3;
        this.zzgac = zzelxVar4;
        this.zzfos = zzelxVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcrk(this.zzglj.get(), this.zzert.get(), this.zzfol.get(), this.zzgac.get(), this.zzfos.get());
    }
}
