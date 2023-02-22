package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbov implements zzelo<zzbow> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzbfq> zzfoi;
    private final zzelx<zzdkx> zzfpe;

    public zzbov(zzelx<Context> zzelxVar, zzelx<zzbfq> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzbbg> zzelxVar4) {
        this.zzert = zzelxVar;
        this.zzfoi = zzelxVar2;
        this.zzfpe = zzelxVar3;
        this.zzfkr = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbow(this.zzert.get(), this.zzfoi.get(), this.zzfpe.get(), this.zzfkr.get());
    }
}
