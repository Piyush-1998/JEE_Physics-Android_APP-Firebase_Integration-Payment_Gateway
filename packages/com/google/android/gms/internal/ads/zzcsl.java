package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsl implements zzelo<zzcsh> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzboe> zzfhd;
    private final zzelx<zzcrn> zzfhh;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzbsx> zzglz;

    public zzcsl(zzelx<zzboe> zzelxVar, zzelx<zzcrn> zzelxVar2, zzelx<zzbsx> zzelxVar3, zzelx<ScheduledExecutorService> zzelxVar4, zzelx<zzdvw> zzelxVar5) {
        this.zzfhd = zzelxVar;
        this.zzfhh = zzelxVar2;
        this.zzglz = zzelxVar3;
        this.zzflu = zzelxVar4;
        this.zzerr = zzelxVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcsh(this.zzfhd.get(), this.zzfhh.get(), this.zzglz.get(), this.zzflu.get(), this.zzerr.get());
    }
}
