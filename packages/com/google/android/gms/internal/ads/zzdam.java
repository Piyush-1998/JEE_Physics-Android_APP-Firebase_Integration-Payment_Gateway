package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdam implements zzelo<zzdal> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzaxk> zzgsp;

    private zzdam(zzelx<Executor> zzelxVar, zzelx<zzaxk> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzgsp = zzelxVar2;
    }

    public static zzdam zzay(zzelx<Executor> zzelxVar, zzelx<zzaxk> zzelxVar2) {
        return new zzdam(zzelxVar, zzelxVar2);
    }

    public static zzdal zza(Executor executor, zzaxk zzaxkVar) {
        return new zzdal(executor, zzaxkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzerr.get(), this.zzgsp.get());
    }
}
