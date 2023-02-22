package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczk implements zzelo<zzczi> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdln> zzfos;
    private final zzelx<ViewGroup> zzgnb;
    private final zzelx<zzdvw> zzgsh;

    public zzczk(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzdln> zzelxVar3, zzelx<ViewGroup> zzelxVar4) {
        this.zzgsh = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfos = zzelxVar3;
        this.zzgnb = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzczi(this.zzgsh.get(), this.zzert.get(), this.zzfos.get(), this.zzgnb.get());
    }
}
