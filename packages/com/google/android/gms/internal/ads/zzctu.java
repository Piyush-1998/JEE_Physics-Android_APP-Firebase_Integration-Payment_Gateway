package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctu implements zzelo<zzctp> {
    private final zzelx<Context> zzert;
    private final zzelx<zzcbn> zzglj;

    public zzctu(zzelx<Context> zzelxVar, zzelx<zzcbn> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzglj = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzctp(this.zzert.get(), this.zzglj.get());
    }
}
