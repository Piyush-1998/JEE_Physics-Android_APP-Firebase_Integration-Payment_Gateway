package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcfg implements zzelo<zzcfe> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzazt> zzfch;
    private final zzelx<Clock> zzfms;

    public zzcfg(zzelx<zzazt> zzelxVar, zzelx<Clock> zzelxVar2, zzelx<Executor> zzelxVar3) {
        this.zzfch = zzelxVar;
        this.zzfms = zzelxVar2;
        this.zzerr = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcfe(this.zzfch.get(), this.zzfms.get(), this.zzerr.get());
    }
}
