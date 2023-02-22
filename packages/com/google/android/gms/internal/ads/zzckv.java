package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckv implements zzelo<zzckw> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdlt> zzetm;
    private final zzelx<zzcli> zzetn;
    private final zzelx<zzdkx> zzflw;
    private final zzelx<zzdlj> zzgew;

    private zzckv(zzelx<Context> zzelxVar, zzelx<zzdlt> zzelxVar2, zzelx<zzcli> zzelxVar3, zzelx<zzdlj> zzelxVar4, zzelx<zzdkx> zzelxVar5) {
        this.zzert = zzelxVar;
        this.zzetm = zzelxVar2;
        this.zzetn = zzelxVar3;
        this.zzgew = zzelxVar4;
        this.zzflw = zzelxVar5;
    }

    public static zzckv zzf(zzelx<Context> zzelxVar, zzelx<zzdlt> zzelxVar2, zzelx<zzcli> zzelxVar3, zzelx<zzdlj> zzelxVar4, zzelx<zzdkx> zzelxVar5) {
        return new zzckv(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzckw(this.zzert.get(), this.zzetm.get(), this.zzetn.get(), this.zzgew.get(), this.zzflw.get());
    }
}
