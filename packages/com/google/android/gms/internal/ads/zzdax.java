package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdax implements zzelo<zzdat> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<ScheduledExecutorService> zzflu;

    private zzdax(zzelx<Context> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<Executor> zzelxVar3) {
        this.zzert = zzelxVar;
        this.zzflu = zzelxVar2;
        this.zzerr = zzelxVar3;
    }

    public static zzdax zzr(zzelx<Context> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<Executor> zzelxVar3) {
        return new zzdax(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdat(this.zzert.get(), this.zzflu.get(), this.zzerr.get());
    }
}
