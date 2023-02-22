package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcyy implements zzelo<zzcyk> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzeg> zzfly;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<zzdma<zzchc>> zzgmv;
    private final zzelx<zzbii> zzgrw;

    public zzcyy(zzelx<zzbii> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzeg> zzelxVar3, zzelx<zzbbg> zzelxVar4, zzelx<zzdma<zzchc>> zzelxVar5, zzelx<zzdvw> zzelxVar6, zzelx<ScheduledExecutorService> zzelxVar7) {
        this.zzgrw = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfly = zzelxVar3;
        this.zzfnd = zzelxVar4;
        this.zzgmv = zzelxVar5;
        this.zzerr = zzelxVar6;
        this.zzflu = zzelxVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcyk(this.zzgrw.get(), this.zzert.get(), this.zzfly.get(), this.zzfnd.get(), this.zzgmv.get(), this.zzerr.get(), this.zzflu.get());
    }
}
