package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvg implements zzelo<zzcuv> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzcih> zzgac;
    private final zzelx<zzchx> zzglj;

    public zzcvg(zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzdln> zzelxVar3, zzelx<Executor> zzelxVar4, zzelx<zzchx> zzelxVar5, zzelx<zzcih> zzelxVar6) {
        this.zzert = zzelxVar;
        this.zzfnd = zzelxVar2;
        this.zzfos = zzelxVar3;
        this.zzfol = zzelxVar4;
        this.zzglj = zzelxVar5;
        this.zzgac = zzelxVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcuv(this.zzert.get(), this.zzfnd.get(), this.zzfos.get(), this.zzfol.get(), this.zzglj.get(), this.zzgac.get());
    }
}
