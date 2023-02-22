package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfx implements zzelo<zzdfv> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zztc> zzesv;

    public zzdfx(zzelx<zztc> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<Context> zzelxVar3) {
        this.zzesv = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzert = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdfv(this.zzesv.get(), this.zzerr.get(), this.zzert.get());
    }
}
