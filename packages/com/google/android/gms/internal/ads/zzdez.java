package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdez implements zzelo<zzdex> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;

    private zzdez(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzert = zzelxVar2;
    }

    public static zzdez zzbi(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2) {
        return new zzdez(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdex(this.zzerr.get(), this.zzert.get());
    }
}
