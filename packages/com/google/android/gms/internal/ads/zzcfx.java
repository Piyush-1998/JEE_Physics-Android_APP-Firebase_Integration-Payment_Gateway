package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcfx implements zzelo<zzcft> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcfj> zzgbo;

    public zzcfx(zzelx<Executor> zzelxVar, zzelx<zzcfj> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzgbo = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcft(this.zzerr.get(), this.zzgbo.get());
    }
}
