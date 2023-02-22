package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdpo implements zzelo<zzdpf> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzdpi> zzezl;
    private final zzelx<ScheduledExecutorService> zzfnz;

    private zzdpo(zzelx<zzdvw> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<zzdpi> zzelxVar3) {
        this.zzerr = zzelxVar;
        this.zzfnz = zzelxVar2;
        this.zzezl = zzelxVar3;
    }

    public static zzdpo zzv(zzelx<zzdvw> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<zzdpi> zzelxVar3) {
        return new zzdpo(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdpf(this.zzerr.get(), this.zzfnz.get(), this.zzezl.get());
    }
}
