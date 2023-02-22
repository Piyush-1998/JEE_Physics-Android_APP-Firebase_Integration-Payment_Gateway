package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcse implements zzelo<zzcsa> {
    private final zzelx<Context> zzert;
    private final zzelx<zzboe> zzglj;

    public zzcse(zzelx<Context> zzelxVar, zzelx<zzboe> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzglj = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcsa(this.zzert.get(), this.zzglj.get());
    }
}
