package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcot implements zzelo<zzcou> {
    private final zzelx<Context> zzert;
    private final zzelx<zzawb> zzfku;

    private zzcot(zzelx<Context> zzelxVar, zzelx<zzawb> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzfku = zzelxVar2;
    }

    public static zzcot zzar(zzelx<Context> zzelxVar, zzelx<zzawb> zzelxVar2) {
        return new zzcot(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcou(this.zzert.get(), this.zzfku.get());
    }
}
