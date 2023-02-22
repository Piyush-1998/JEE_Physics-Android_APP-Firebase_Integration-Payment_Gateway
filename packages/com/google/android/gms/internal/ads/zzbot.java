package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbot implements zzelo<zzboo> {
    private final zzelx<zzbpg> zzewy;
    private final zzelx<Runnable> zzfhy;
    private final zzelx<zzafq> zzfmx;
    private final zzelx<Executor> zzfol;

    public zzbot(zzelx<zzbpg> zzelxVar, zzelx<zzafq> zzelxVar2, zzelx<Runnable> zzelxVar3, zzelx<Executor> zzelxVar4) {
        this.zzewy = zzelxVar;
        this.zzfmx = zzelxVar2;
        this.zzfhy = zzelxVar3;
        this.zzfol = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzboo(this.zzewy.get(), this.zzfmx.get(), this.zzfhy.get(), this.zzfol.get());
    }
}
