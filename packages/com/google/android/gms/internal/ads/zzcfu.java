package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcfu implements zzelo<zzcfj> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzcfe> zzfci;
    private final zzelx<zzcga> zzfcl;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzeg> zzfwp;
    private final zzelx<com.google.android.gms.ads.internal.zzb> zzgbu;
    private final zzelx<zzto> zzgbv;

    public zzcfu(zzelx<Context> zzelxVar, zzelx<zzcfe> zzelxVar2, zzelx<zzeg> zzelxVar3, zzelx<zzbbg> zzelxVar4, zzelx<com.google.android.gms.ads.internal.zzb> zzelxVar5, zzelx<zzto> zzelxVar6, zzelx<Executor> zzelxVar7, zzelx<zzdln> zzelxVar8, zzelx<zzcga> zzelxVar9, zzelx<ScheduledExecutorService> zzelxVar10) {
        this.zzert = zzelxVar;
        this.zzfci = zzelxVar2;
        this.zzfwp = zzelxVar3;
        this.zzfkr = zzelxVar4;
        this.zzgbu = zzelxVar5;
        this.zzgbv = zzelxVar6;
        this.zzerr = zzelxVar7;
        this.zzfos = zzelxVar8;
        this.zzfcl = zzelxVar9;
        this.zzflu = zzelxVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcfj(this.zzert.get(), this.zzfci.get(), this.zzfwp.get(), this.zzfkr.get(), this.zzgbu.get(), this.zzgbv.get(), this.zzerr.get(), this.zzfos.get(), this.zzfcl.get(), this.zzflu.get());
    }
}
