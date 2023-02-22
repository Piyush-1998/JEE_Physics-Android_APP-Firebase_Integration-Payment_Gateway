package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczh implements zzelo<zzczf> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcnq> zzghe;

    public zzczh(zzelx<Executor> zzelxVar, zzelx<zzcnq> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzghe = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzczf(this.zzerr.get(), this.zzghe.get());
    }
}
