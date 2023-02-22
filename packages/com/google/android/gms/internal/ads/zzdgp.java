package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgp implements zzelo<zzdgn> {
    private final zzelx<Context> zzert;
    private final zzelx<zzaqt> zzesv;
    private final zzelx<ScheduledExecutorService> zzflu;

    public zzdgp(zzelx<zzaqt> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<Context> zzelxVar3) {
        this.zzesv = zzelxVar;
        this.zzflu = zzelxVar2;
        this.zzert = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdgn(this.zzesv.get(), this.zzflu.get(), this.zzert.get());
    }
}
