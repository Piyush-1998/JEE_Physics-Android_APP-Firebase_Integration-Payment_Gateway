package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdft implements zzelo<zzdfp> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzaxg> zzesv;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzaxk> zzgsp;
    private final zzelx<Integer> zzgwf;

    public zzdft(zzelx<zzaxg> zzelxVar, zzelx<Integer> zzelxVar2, zzelx<Context> zzelxVar3, zzelx<zzaxk> zzelxVar4, zzelx<ScheduledExecutorService> zzelxVar5, zzelx<Executor> zzelxVar6) {
        this.zzesv = zzelxVar;
        this.zzgwf = zzelxVar2;
        this.zzert = zzelxVar3;
        this.zzgsp = zzelxVar4;
        this.zzflu = zzelxVar5;
        this.zzerr = zzelxVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdfp(this.zzesv.get(), this.zzgwf.get().intValue(), this.zzert.get(), this.zzgsp.get(), this.zzflu.get(), this.zzerr.get());
    }
}
