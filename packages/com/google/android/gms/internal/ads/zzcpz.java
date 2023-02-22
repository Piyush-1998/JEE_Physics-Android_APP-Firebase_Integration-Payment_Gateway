package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcpz implements zzelo<zzcpj> {
    private final zzelx<Context> zzert;
    private final zzelx<Executor> zzfol;
    private final zzelx<zzatc> zzgjk;
    private final zzelx<zzble> zzgjl;
    private final zzelx<zzatd> zzgjm;
    private final zzelx<HashMap<String, zzcpy>> zzgjn;

    private zzcpz(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzatc> zzelxVar3, zzelx<zzble> zzelxVar4, zzelx<zzatd> zzelxVar5, zzelx<HashMap<String, zzcpy>> zzelxVar6) {
        this.zzert = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzgjk = zzelxVar3;
        this.zzgjl = zzelxVar4;
        this.zzgjm = zzelxVar5;
        this.zzgjn = zzelxVar6;
    }

    public static zzcpz zza(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzatc> zzelxVar3, zzelx<zzble> zzelxVar4, zzelx<zzatd> zzelxVar5, zzelx<HashMap<String, zzcpy>> zzelxVar6) {
        return new zzcpz(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcpj(this.zzert.get(), this.zzfol.get(), this.zzgjk.get(), this.zzgjl.get(), this.zzgjm.get(), this.zzgjn.get());
    }
}
