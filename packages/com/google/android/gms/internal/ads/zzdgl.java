package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgl implements zzelo<zzdgj> {
    private final zzelx<zzamh> zzesv;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<ApplicationInfo> zzghj;
    private final zzelx<Boolean> zzgwq;

    public zzdgl(zzelx<zzamh> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<Boolean> zzelxVar3, zzelx<ApplicationInfo> zzelxVar4) {
        this.zzesv = zzelxVar;
        this.zzflu = zzelxVar2;
        this.zzgwq = zzelxVar3;
        this.zzghj = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdgj(this.zzesv.get(), this.zzflu.get(), this.zzgwq.get().booleanValue(), this.zzghj.get());
    }
}
