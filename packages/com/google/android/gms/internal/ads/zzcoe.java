package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcoe implements zzelo<zzcoa> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzcqq> zzeyy;
    private final zzelx<zzcmw> zzfcx;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzdln> zzfos;

    private zzcoe(zzelx<zzdln> zzelxVar, zzelx<zzcmw> zzelxVar2, zzelx<zzdvw> zzelxVar3, zzelx<ScheduledExecutorService> zzelxVar4, zzelx<zzcqq> zzelxVar5) {
        this.zzfos = zzelxVar;
        this.zzfcx = zzelxVar2;
        this.zzerr = zzelxVar3;
        this.zzflu = zzelxVar4;
        this.zzeyy = zzelxVar5;
    }

    public static zzcoe zzg(zzelx<zzdln> zzelxVar, zzelx<zzcmw> zzelxVar2, zzelx<zzdvw> zzelxVar3, zzelx<ScheduledExecutorService> zzelxVar4, zzelx<zzcqq> zzelxVar5) {
        return new zzcoe(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcoa(this.zzfos.get(), this.zzfcx.get(), this.zzerr.get(), this.zzflu.get(), this.zzeyy.get());
    }
}
