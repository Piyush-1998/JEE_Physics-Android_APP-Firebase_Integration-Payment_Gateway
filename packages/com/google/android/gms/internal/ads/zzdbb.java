package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbb implements zzelo<zzdaz> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;

    private zzdbb(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzert = zzelxVar2;
    }

    public static zzdbb zzaz(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2) {
        return new zzdbb(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdaz(this.zzerr.get(), this.zzert.get());
    }
}
