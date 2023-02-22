package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmn implements zzelo<zzdmm> {
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<Context> zzfrj;
    private final zzelx<zzaxk> zzgsp;

    public zzdmn(zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzaxk> zzelxVar3) {
        this.zzfrj = zzelxVar;
        this.zzfnd = zzelxVar2;
        this.zzgsp = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdmm(this.zzfrj.get(), this.zzfnd.get(), this.zzgsp.get());
    }
}
