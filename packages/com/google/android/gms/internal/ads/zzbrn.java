package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbrn implements zzelo<zzbro> {
    private final zzelx<zzcmi> zzesp;
    private final zzelx<zzaya> zzeyo;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<zzdln> zzfos;
    private final zzelx<Context> zzfrj;

    private zzbrn(zzelx<Context> zzelxVar, zzelx<zzdln> zzelxVar2, zzelx<zzbbg> zzelxVar3, zzelx<zzaya> zzelxVar4, zzelx<zzcmi> zzelxVar5) {
        this.zzfrj = zzelxVar;
        this.zzfos = zzelxVar2;
        this.zzfnd = zzelxVar3;
        this.zzeyo = zzelxVar4;
        this.zzesp = zzelxVar5;
    }

    public static zzbrn zzb(zzelx<Context> zzelxVar, zzelx<zzdln> zzelxVar2, zzelx<zzbbg> zzelxVar3, zzelx<zzaya> zzelxVar4, zzelx<zzcmi> zzelxVar5) {
        return new zzbrn(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbro(this.zzfrj.get(), this.zzfos.get(), this.zzfnd.get(), this.zzeyo.get(), this.zzesp.get());
    }
}
