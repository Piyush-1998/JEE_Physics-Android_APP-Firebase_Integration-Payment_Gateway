package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdkm implements zzelo<zzdkl> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdli> zzfjf;
    private final zzelx<String> zzgxn;
    private final zzelx<zzdkd> zzgxo;
    private final zzelx<zzdje> zzgxp;

    public zzdkm(zzelx<String> zzelxVar, zzelx<zzdkd> zzelxVar2, zzelx<Context> zzelxVar3, zzelx<zzdje> zzelxVar4, zzelx<zzdli> zzelxVar5) {
        this.zzgxn = zzelxVar;
        this.zzgxo = zzelxVar2;
        this.zzert = zzelxVar3;
        this.zzgxp = zzelxVar4;
        this.zzfjf = zzelxVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdkl(this.zzgxn.get(), this.zzgxo.get(), this.zzert.get(), this.zzgxp.get(), this.zzfjf.get());
    }
}
