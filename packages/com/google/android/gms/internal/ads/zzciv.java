package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzciv implements zzelo<zzcih> {
    private final zzelx<Context> zzert;
    private final zzelx<zzabt> zzfcj;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzbvb> zzfot;
    private final zzelx<zzeg> zzfwp;
    private final zzelx<zzto> zzgbv;
    private final zzelx<zzbfy> zzgcy;
    private final zzelx<com.google.android.gms.ads.internal.zzb> zzgdn;
    private final zzelx<zzbzq> zzgdo;

    private zzciv(zzelx<zzbfy> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzdln> zzelxVar3, zzelx<zzeg> zzelxVar4, zzelx<zzabt> zzelxVar5, zzelx<zzbbg> zzelxVar6, zzelx<com.google.android.gms.ads.internal.zzb> zzelxVar7, zzelx<zzto> zzelxVar8, zzelx<zzbvb> zzelxVar9, zzelx<zzbzq> zzelxVar10) {
        this.zzgcy = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfos = zzelxVar3;
        this.zzfwp = zzelxVar4;
        this.zzfcj = zzelxVar5;
        this.zzfkr = zzelxVar6;
        this.zzgdn = zzelxVar7;
        this.zzgbv = zzelxVar8;
        this.zzfot = zzelxVar9;
        this.zzgdo = zzelxVar10;
    }

    public static zzciv zzc(zzelx<zzbfy> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzdln> zzelxVar3, zzelx<zzeg> zzelxVar4, zzelx<zzabt> zzelxVar5, zzelx<zzbbg> zzelxVar6, zzelx<com.google.android.gms.ads.internal.zzb> zzelxVar7, zzelx<zzto> zzelxVar8, zzelx<zzbvb> zzelxVar9, zzelx<zzbzq> zzelxVar10) {
        return new zzciv(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7, zzelxVar8, zzelxVar9, zzelxVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcih(this.zzgcy.get(), this.zzert.get(), this.zzfos.get(), this.zzfwp.get(), this.zzfcj.get(), this.zzfkr.get(), this.zzgdn.get(), this.zzgbv.get(), this.zzfot.get(), this.zzgdo.get());
    }
}
