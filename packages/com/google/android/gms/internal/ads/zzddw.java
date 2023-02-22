package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddw implements zzelo<zzddu> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzawb> zzfku;

    private zzddw(zzelx<zzawb> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<Context> zzelxVar3) {
        this.zzfku = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzert = zzelxVar3;
    }

    public static zzddw zzt(zzelx<zzawb> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<Context> zzelxVar3) {
        return new zzddw(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzddu(this.zzfku.get(), this.zzerr.get(), this.zzert.get());
    }
}
