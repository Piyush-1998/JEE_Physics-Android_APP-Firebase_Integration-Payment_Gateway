package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdki implements zzelo<zzdkd> {
    private final zzelx<zzbii> zzerp;
    private final zzelx<zzdli> zzfjf;
    private final zzelx<Executor> zzfol;
    private final zzelx<Context> zzgxc;
    private final zzelx<zzdiz<zzchx, zzchu>> zzgxd;
    private final zzelx<zzdje> zzgxe;
    private final zzelx<zzdlp> zzgxf;

    public zzdki(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzbii> zzelxVar3, zzelx<zzdiz<zzchx, zzchu>> zzelxVar4, zzelx<zzdje> zzelxVar5, zzelx<zzdlp> zzelxVar6, zzelx<zzdli> zzelxVar7) {
        this.zzgxc = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzerp = zzelxVar3;
        this.zzgxd = zzelxVar4;
        this.zzgxe = zzelxVar5;
        this.zzgxf = zzelxVar6;
        this.zzfjf = zzelxVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdkd(this.zzgxc.get(), this.zzfol.get(), this.zzerp.get(), this.zzgxd.get(), this.zzgxe.get(), this.zzgxf.get(), this.zzfjf.get());
    }
}
