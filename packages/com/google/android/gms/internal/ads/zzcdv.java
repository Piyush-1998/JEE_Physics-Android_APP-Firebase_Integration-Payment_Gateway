package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdv implements zzelo<zzcdr> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzccz> zzeul;
    private final zzelx<zzcdz> zzexi;
    private final zzelx<zzceh> zzexj;
    private final zzelx<zzccu> zzexl;
    private final zzelx<zzaya> zzeyo;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzccv> zzfwo;

    private zzcdv(zzelx<zzaya> zzelxVar, zzelx<zzdln> zzelxVar2, zzelx<zzccz> zzelxVar3, zzelx<zzccv> zzelxVar4, zzelx<zzcdz> zzelxVar5, zzelx<zzceh> zzelxVar6, zzelx<Executor> zzelxVar7, zzelx<Executor> zzelxVar8, zzelx<zzccu> zzelxVar9) {
        this.zzeyo = zzelxVar;
        this.zzfos = zzelxVar2;
        this.zzeul = zzelxVar3;
        this.zzfwo = zzelxVar4;
        this.zzexi = zzelxVar5;
        this.zzexj = zzelxVar6;
        this.zzfol = zzelxVar7;
        this.zzerr = zzelxVar8;
        this.zzexl = zzelxVar9;
    }

    public static zzcdv zza(zzelx<zzaya> zzelxVar, zzelx<zzdln> zzelxVar2, zzelx<zzccz> zzelxVar3, zzelx<zzccv> zzelxVar4, zzelx<zzcdz> zzelxVar5, zzelx<zzceh> zzelxVar6, zzelx<Executor> zzelxVar7, zzelx<Executor> zzelxVar8, zzelx<zzccu> zzelxVar9) {
        return new zzcdv(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7, zzelxVar8, zzelxVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcdr(this.zzeyo.get(), this.zzfos.get(), this.zzeul.get(), this.zzfwo.get(), this.zzexi.get(), this.zzexj.get(), this.zzfol.get(), this.zzerr.get(), this.zzexl.get());
    }
}
