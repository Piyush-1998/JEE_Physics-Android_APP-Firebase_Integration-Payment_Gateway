package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcns implements zzelo<zzcnq> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzcol> zzghe;
    private final zzelx<zzcpj> zzghf;

    public zzcns(zzelx<ScheduledExecutorService> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcol> zzelxVar3, zzelx<zzcpj> zzelxVar4) {
        this.zzflu = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzghe = zzelxVar3;
        this.zzghf = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcnq(this.zzflu.get(), this.zzerr.get(), this.zzghe.get(), zzell.zzat(this.zzghf));
    }
}
