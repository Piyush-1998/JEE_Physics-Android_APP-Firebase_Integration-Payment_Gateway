package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvm implements zzelo<zzcvf> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzchx> zzglj;

    public zzcvm(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzchx> zzelxVar3) {
        this.zzert = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzglj = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcvf(this.zzert.get(), this.zzfol.get(), this.zzglj.get());
    }
}
