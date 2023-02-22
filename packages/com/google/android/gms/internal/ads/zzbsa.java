package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsa implements zzelo<zzbrx> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdkx> zzfpe;
    private final zzelx<zzaqs> zzfsa;

    private zzbsa(zzelx<Context> zzelxVar, zzelx<zzdkx> zzelxVar2, zzelx<zzaqs> zzelxVar3) {
        this.zzert = zzelxVar;
        this.zzfpe = zzelxVar2;
        this.zzfsa = zzelxVar3;
    }

    public static zzbsa zzh(zzelx<Context> zzelxVar, zzelx<zzdkx> zzelxVar2, zzelx<zzaqs> zzelxVar3) {
        return new zzbsa(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbrx(this.zzert.get(), this.zzfpe.get(), this.zzfsa.get());
    }
}
