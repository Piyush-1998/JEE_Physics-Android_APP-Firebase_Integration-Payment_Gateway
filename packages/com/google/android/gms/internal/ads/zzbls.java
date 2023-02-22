package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbls implements zzelo<zzbln> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzdps> zzfbu;
    private final zzelx<zzabt> zzfcj;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzdlj> zzflv;
    private final zzelx<zzdkx> zzflw;
    private final zzelx<View> zzflx;
    private final zzelx<zzeg> zzfly;
    private final zzelx<zzaby> zzflz;

    private zzbls(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<ScheduledExecutorService> zzelxVar3, zzelx<zzdlj> zzelxVar4, zzelx<zzdkx> zzelxVar5, zzelx<zzdps> zzelxVar6, zzelx<View> zzelxVar7, zzelx<zzeg> zzelxVar8, zzelx<zzabt> zzelxVar9, zzelx<zzaby> zzelxVar10) {
        this.zzert = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzflu = zzelxVar3;
        this.zzflv = zzelxVar4;
        this.zzflw = zzelxVar5;
        this.zzfbu = zzelxVar6;
        this.zzflx = zzelxVar7;
        this.zzfly = zzelxVar8;
        this.zzfcj = zzelxVar9;
        this.zzflz = zzelxVar10;
    }

    public static zzbls zza(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<ScheduledExecutorService> zzelxVar3, zzelx<zzdlj> zzelxVar4, zzelx<zzdkx> zzelxVar5, zzelx<zzdps> zzelxVar6, zzelx<View> zzelxVar7, zzelx<zzeg> zzelxVar8, zzelx<zzabt> zzelxVar9, zzelx<zzaby> zzelxVar10) {
        return new zzbls(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7, zzelxVar8, zzelxVar9, zzelxVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbln(this.zzert.get(), this.zzerr.get(), this.zzflu.get(), this.zzflv.get(), this.zzflw.get(), this.zzfbu.get(), this.zzflx.get(), this.zzfly.get(), this.zzfcj.get(), this.zzflz.get());
    }
}
