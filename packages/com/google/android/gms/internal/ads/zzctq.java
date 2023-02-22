package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctq implements zzelo<zzctn> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzcbn> zzglj;

    public zzctq(zzelx<Context> zzelxVar, zzelx<zzcbn> zzelxVar2, zzelx<Executor> zzelxVar3) {
        this.zzert = zzelxVar;
        this.zzglj = zzelxVar2;
        this.zzfol = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzctn(this.zzert.get(), this.zzglj.get(), this.zzfol.get());
    }
}
