package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzciw implements zzelo<zzcij> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbma> zzeuq;
    private final zzelx<zzbtu> zzevd;
    private final zzelx<zzbst> zzevh;
    private final zzelx<zzbur> zzewj;
    private final zzelx<zzbyr> zzexd;
    private final zzelx<zzbws> zzfdx;
    private final zzelx<zzbui> zzfef;
    private final zzelx<zzbwl> zzffy;
    private final zzelx<zzavu> zzfrh;
    private final zzelx<zzeg> zzfwp;
    private final zzelx<com.google.android.gms.ads.internal.zza> zzgdp;
    private final zzelx<zzbto> zzgdq;

    private zzciw(zzelx<zzbst> zzelxVar, zzelx<zzbtu> zzelxVar2, zzelx<zzbui> zzelxVar3, zzelx<zzbur> zzelxVar4, zzelx<zzbws> zzelxVar5, zzelx<Executor> zzelxVar6, zzelx<zzbyr> zzelxVar7, zzelx<zzbma> zzelxVar8, zzelx<com.google.android.gms.ads.internal.zza> zzelxVar9, zzelx<zzbto> zzelxVar10, zzelx<zzavu> zzelxVar11, zzelx<zzeg> zzelxVar12, zzelx<zzbwl> zzelxVar13) {
        this.zzevh = zzelxVar;
        this.zzevd = zzelxVar2;
        this.zzfef = zzelxVar3;
        this.zzewj = zzelxVar4;
        this.zzfdx = zzelxVar5;
        this.zzerr = zzelxVar6;
        this.zzexd = zzelxVar7;
        this.zzeuq = zzelxVar8;
        this.zzgdp = zzelxVar9;
        this.zzgdq = zzelxVar10;
        this.zzfrh = zzelxVar11;
        this.zzfwp = zzelxVar12;
        this.zzffy = zzelxVar13;
    }

    public static zzciw zza(zzelx<zzbst> zzelxVar, zzelx<zzbtu> zzelxVar2, zzelx<zzbui> zzelxVar3, zzelx<zzbur> zzelxVar4, zzelx<zzbws> zzelxVar5, zzelx<Executor> zzelxVar6, zzelx<zzbyr> zzelxVar7, zzelx<zzbma> zzelxVar8, zzelx<com.google.android.gms.ads.internal.zza> zzelxVar9, zzelx<zzbto> zzelxVar10, zzelx<zzavu> zzelxVar11, zzelx<zzeg> zzelxVar12, zzelx<zzbwl> zzelxVar13) {
        return new zzciw(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7, zzelxVar8, zzelxVar9, zzelxVar10, zzelxVar11, zzelxVar12, zzelxVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcij(this.zzevh.get(), this.zzevd.get(), this.zzfef.get(), this.zzewj.get(), this.zzfdx.get(), this.zzerr.get(), this.zzexd.get(), this.zzeuq.get(), this.zzgdp.get(), this.zzgdq.get(), this.zzfrh.get(), this.zzfwp.get(), this.zzffy.get());
    }
}
