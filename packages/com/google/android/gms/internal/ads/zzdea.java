package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdea implements zzelo<zzddy> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;

    private zzdea(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzbbg> zzelxVar3) {
        this.zzerr = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfkr = zzelxVar3;
    }

    public static zzdea zzu(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzbbg> zzelxVar3) {
        return new zzdea(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzddy(this.zzerr.get(), this.zzert.get(), this.zzfkr.get());
    }
}
