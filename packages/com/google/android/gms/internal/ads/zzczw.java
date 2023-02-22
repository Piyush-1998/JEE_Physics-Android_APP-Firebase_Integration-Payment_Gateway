package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczw implements zzelo<zzczu> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdbj<zzdeq>> zzete;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzaxk> zzgsp;

    private zzczw(zzelx<zzdbj<zzdeq>> zzelxVar, zzelx<zzdln> zzelxVar2, zzelx<Context> zzelxVar3, zzelx<zzaxk> zzelxVar4) {
        this.zzete = zzelxVar;
        this.zzfos = zzelxVar2;
        this.zzert = zzelxVar3;
        this.zzgsp = zzelxVar4;
    }

    public static zzczw zzg(zzelx<zzdbj<zzdeq>> zzelxVar, zzelx<zzdln> zzelxVar2, zzelx<Context> zzelxVar3, zzelx<zzaxk> zzelxVar4) {
        return new zzczw(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzczu(this.zzete.get(), this.zzfos.get(), this.zzert.get(), this.zzgsp.get());
    }
}
