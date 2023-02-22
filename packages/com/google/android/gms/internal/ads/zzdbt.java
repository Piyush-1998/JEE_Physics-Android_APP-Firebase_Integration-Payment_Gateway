package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbt implements zzelo<zzdbp> {
    private final zzelx<zzamh> zzesv;
    private final zzelx<zzaya> zzeyo;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzdln> zzfos;
    private final zzelx<ApplicationInfo> zzghj;

    private zzdbt(zzelx<zzamh> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<zzaya> zzelxVar3, zzelx<ApplicationInfo> zzelxVar4, zzelx<zzdln> zzelxVar5) {
        this.zzesv = zzelxVar;
        this.zzflu = zzelxVar2;
        this.zzeyo = zzelxVar3;
        this.zzghj = zzelxVar4;
        this.zzfos = zzelxVar5;
    }

    public static zzdbt zzi(zzelx<zzamh> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<zzaya> zzelxVar3, zzelx<ApplicationInfo> zzelxVar4, zzelx<zzdln> zzelxVar5) {
        return new zzdbt(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdbp(this.zzesv.get(), this.zzflu.get(), this.zzeyo.get(), this.zzghj.get(), this.zzfos.get());
    }
}
