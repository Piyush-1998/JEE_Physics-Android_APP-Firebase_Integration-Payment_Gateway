package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccj implements zzelo<zzbmj> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<Clock> zzfms;
    private final zzelx<zzqo> zzfwu;

    public zzccj(zzelx<zzqo> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<Context> zzelxVar3, zzelx<Clock> zzelxVar4) {
        this.zzfwu = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzert = zzelxVar3;
        this.zzfms = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbmj) zzelu.zza(new zzbmj(this.zzerr.get(), new zzbly(this.zzert.get(), this.zzfwu.get()), this.zzfms.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
