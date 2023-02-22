package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcrx implements zzelo<zzcrv> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzboe> zzglj;

    public zzcrx(zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzboe> zzelxVar3, zzelx<Executor> zzelxVar4) {
        this.zzert = zzelxVar;
        this.zzfnd = zzelxVar2;
        this.zzglj = zzelxVar3;
        this.zzfol = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcrv(this.zzert.get(), this.zzfnd.get(), this.zzglj.get(), this.zzfol.get());
    }
}
