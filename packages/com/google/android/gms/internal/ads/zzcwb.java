package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwb implements zzelo<zzcvv> {
    private final zzelx<zzdvw> zzfol;
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzboe> zzglj;
    private final zzelx<Context> zzgov;
    private final zzelx<zzabq> zzgow;

    public zzcwb(zzelx<Context> zzelxVar, zzelx<zzboe> zzelxVar2, zzelx<zzdpf> zzelxVar3, zzelx<zzdvw> zzelxVar4, zzelx<zzabq> zzelxVar5) {
        this.zzgov = zzelxVar;
        this.zzglj = zzelxVar2;
        this.zzfow = zzelxVar3;
        this.zzfol = zzelxVar4;
        this.zzgow = zzelxVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcvv(this.zzgov.get(), this.zzglj.get(), this.zzfow.get(), this.zzfol.get(), this.zzgow.get());
    }
}
