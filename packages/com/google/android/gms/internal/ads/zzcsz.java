package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsz implements zzelo<zzcsx> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzcar> zzglj;

    public zzcsz(zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzcar> zzelxVar3, zzelx<Executor> zzelxVar4) {
        this.zzert = zzelxVar;
        this.zzfnd = zzelxVar2;
        this.zzglj = zzelxVar3;
        this.zzfol = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcsx(this.zzert.get(), this.zzfnd.get(), this.zzglj.get(), this.zzfol.get());
    }
}
