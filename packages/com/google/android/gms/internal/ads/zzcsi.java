package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsi implements zzelo<zzcsd> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzcar> zzglj;
    private final zzelx<zzdkv> zzglx;

    public zzcsi(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzcar> zzelxVar3, zzelx<zzdkv> zzelxVar4) {
        this.zzert = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzglj = zzelxVar3;
        this.zzglx = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcsd(this.zzert.get(), this.zzfol.get(), this.zzglj.get(), this.zzglx.get());
    }
}
