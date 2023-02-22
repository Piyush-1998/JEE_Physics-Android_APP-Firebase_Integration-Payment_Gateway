package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfc implements zzelo<zzdfb> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzaxg> zzesv;
    private final zzelx<ScheduledExecutorService> zzflu;

    public zzdfc(zzelx<zzaxg> zzelxVar, zzelx<Context> zzelxVar2, zzelx<ScheduledExecutorService> zzelxVar3, zzelx<Executor> zzelxVar4) {
        this.zzesv = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzflu = zzelxVar3;
        this.zzerr = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdfb(this.zzesv.get(), this.zzert.get(), this.zzflu.get(), this.zzerr.get());
    }
}
