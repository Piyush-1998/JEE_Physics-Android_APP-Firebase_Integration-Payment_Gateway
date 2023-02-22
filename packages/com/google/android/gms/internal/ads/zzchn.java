package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchn implements zzelo<zzchm> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzbbg> zzfsr;
    private final zzelx<zzeg> zzfwp;
    private final zzelx<com.google.android.gms.ads.internal.zzb> zzgbu;
    private final zzelx<zzbfy> zzgcy;

    public zzchn(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzeg> zzelxVar3, zzelx<zzbbg> zzelxVar4, zzelx<com.google.android.gms.ads.internal.zzb> zzelxVar5, zzelx<zzbfy> zzelxVar6) {
        this.zzert = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzfwp = zzelxVar3;
        this.zzfsr = zzelxVar4;
        this.zzgbu = zzelxVar5;
        this.zzgcy = zzelxVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzchm(this.zzert.get(), this.zzfol.get(), this.zzfwp.get(), this.zzfsr.get(), this.zzgbu.get(), this.zzgcy.get());
    }
}
