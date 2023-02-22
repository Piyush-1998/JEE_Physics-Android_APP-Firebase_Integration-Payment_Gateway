package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfn implements zzelo<zzdfl> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzass> zzesv;
    private final zzelx<String> zzfsc;

    public zzdfn(zzelx<zzass> zzelxVar, zzelx<Context> zzelxVar2, zzelx<String> zzelxVar3, zzelx<zzdvw> zzelxVar4) {
        this.zzesv = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfsc = zzelxVar3;
        this.zzerr = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdfl(this.zzesv.get(), this.zzert.get(), this.zzfsc.get(), this.zzerr.get());
    }
}
