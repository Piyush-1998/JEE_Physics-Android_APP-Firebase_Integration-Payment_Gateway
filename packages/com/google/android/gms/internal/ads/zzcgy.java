package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgy implements zzelo<zzcgw> {
    private final zzelx<zzcdr> zzexm;
    private final zzelx<Context> zzfrj;
    private final zzelx<zzccv> zzfwo;
    private final zzelx<zzcco> zzgcf;

    private zzcgy(zzelx<Context> zzelxVar, zzelx<zzccv> zzelxVar2, zzelx<zzcdr> zzelxVar3, zzelx<zzcco> zzelxVar4) {
        this.zzfrj = zzelxVar;
        this.zzfwo = zzelxVar2;
        this.zzexm = zzelxVar3;
        this.zzgcf = zzelxVar4;
    }

    public static zzcgy zzc(zzelx<Context> zzelxVar, zzelx<zzccv> zzelxVar2, zzelx<zzcdr> zzelxVar3, zzelx<zzcco> zzelxVar4) {
        return new zzcgy(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcgw(this.zzfrj.get(), this.zzfwo.get(), this.zzexm.get(), this.zzgcf.get());
    }
}
