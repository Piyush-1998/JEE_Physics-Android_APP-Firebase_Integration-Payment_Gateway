package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdca implements zzelo<zzdby> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;

    private zzdca(zzelx<Context> zzelxVar, zzelx<zzdvw> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzdca zzbb(zzelx<Context> zzelxVar, zzelx<zzdvw> zzelxVar2) {
        return new zzdca(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdby(this.zzert.get(), this.zzerr.get());
    }
}
