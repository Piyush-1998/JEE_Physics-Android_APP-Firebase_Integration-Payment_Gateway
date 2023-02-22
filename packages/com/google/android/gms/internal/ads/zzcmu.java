package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmu implements zzelo<zzcmi> {
    private final zzelx<zzcji> zzero;
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcls> zzeso;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<Executor> zzfol;
    private final zzelx<Context> zzggw;
    private final zzelx<WeakReference<Context>> zzggx;

    public zzcmu(zzelx<Executor> zzelxVar, zzelx<Context> zzelxVar2, zzelx<WeakReference<Context>> zzelxVar3, zzelx<Executor> zzelxVar4, zzelx<zzcji> zzelxVar5, zzelx<ScheduledExecutorService> zzelxVar6, zzelx<zzcls> zzelxVar7, zzelx<zzbbg> zzelxVar8) {
        this.zzfol = zzelxVar;
        this.zzggw = zzelxVar2;
        this.zzggx = zzelxVar3;
        this.zzerr = zzelxVar4;
        this.zzero = zzelxVar5;
        this.zzflu = zzelxVar6;
        this.zzeso = zzelxVar7;
        this.zzfnd = zzelxVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcmi(this.zzfol.get(), this.zzggw.get(), this.zzggx.get(), this.zzerr.get(), this.zzero.get(), this.zzflu.get(), this.zzeso.get(), this.zzfnd.get());
    }
}
