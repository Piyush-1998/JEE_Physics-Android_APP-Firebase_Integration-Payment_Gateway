package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbrv implements zzelo<zzbru> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbtl> zzfrs;
    private final zzelx<zzdkx> zzfrt;
    private final zzelx<ScheduledExecutorService> zzfru;

    private zzbrv(zzelx<zzbtl> zzelxVar, zzelx<zzdkx> zzelxVar2, zzelx<ScheduledExecutorService> zzelxVar3, zzelx<Executor> zzelxVar4) {
        this.zzfrs = zzelxVar;
        this.zzfrt = zzelxVar2;
        this.zzfru = zzelxVar3;
        this.zzerr = zzelxVar4;
    }

    public static zzbrv zzb(zzelx<zzbtl> zzelxVar, zzelx<zzdkx> zzelxVar2, zzelx<ScheduledExecutorService> zzelxVar3, zzelx<Executor> zzelxVar4) {
        return new zzbrv(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbru(this.zzfrs.get(), this.zzfrt.get(), this.zzfru.get(), this.zzerr.get());
    }
}
