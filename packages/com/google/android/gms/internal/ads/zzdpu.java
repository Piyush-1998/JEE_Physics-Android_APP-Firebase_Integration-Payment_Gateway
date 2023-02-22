package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdpu implements zzelo<zzdps> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzbbh> zzesm;
    private final zzelx<zzdli> zzfjf;
    private final zzelx<zzeg> zzfly;
    private final zzelx<Clock> zzfms;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<String> zzgsv;
    private final zzelx<String> zzgtf;
    private final zzelx<zzcud> zzhig;

    private zzdpu(zzelx<Executor> zzelxVar, zzelx<zzbbh> zzelxVar2, zzelx<zzcud> zzelxVar3, zzelx<zzbbg> zzelxVar4, zzelx<String> zzelxVar5, zzelx<String> zzelxVar6, zzelx<Context> zzelxVar7, zzelx<zzdli> zzelxVar8, zzelx<Clock> zzelxVar9, zzelx<zzeg> zzelxVar10) {
        this.zzerr = zzelxVar;
        this.zzesm = zzelxVar2;
        this.zzhig = zzelxVar3;
        this.zzfnd = zzelxVar4;
        this.zzgsv = zzelxVar5;
        this.zzgtf = zzelxVar6;
        this.zzert = zzelxVar7;
        this.zzfjf = zzelxVar8;
        this.zzfms = zzelxVar9;
        this.zzfly = zzelxVar10;
    }

    public static zzdpu zzd(zzelx<Executor> zzelxVar, zzelx<zzbbh> zzelxVar2, zzelx<zzcud> zzelxVar3, zzelx<zzbbg> zzelxVar4, zzelx<String> zzelxVar5, zzelx<String> zzelxVar6, zzelx<Context> zzelxVar7, zzelx<zzdli> zzelxVar8, zzelx<Clock> zzelxVar9, zzelx<zzeg> zzelxVar10) {
        return new zzdpu(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7, zzelxVar8, zzelxVar9, zzelxVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdps(this.zzerr.get(), this.zzesm.get(), this.zzhig.get(), this.zzfnd.get(), this.zzgsv.get(), this.zzgtf.get(), this.zzert.get(), this.zzfjf.get(), this.zzfms.get(), this.zzfly.get());
    }
}
