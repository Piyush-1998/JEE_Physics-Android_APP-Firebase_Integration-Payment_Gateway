package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdcv implements zzelo<zzdco> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzaya> zzeyo;
    private final zzelx<zzdln> zzfos;
    private final zzelx<PackageInfo> zzfse;

    public zzdcv(zzelx<zzdvw> zzelxVar, zzelx<zzdln> zzelxVar2, zzelx<PackageInfo> zzelxVar3, zzelx<zzaya> zzelxVar4) {
        this.zzerr = zzelxVar;
        this.zzfos = zzelxVar2;
        this.zzfse = zzelxVar3;
        this.zzeyo = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdco(this.zzerr.get(), this.zzfos.get(), this.zzfse.get(), this.zzeyo.get());
    }
}
