package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcua implements zzelo<zzctx> {
    private final zzelx<zzbvb> zzfrw;
    private final zzelx<zzbii> zzfwi;
    private final zzelx<zzbsg.zza> zzfwj;
    private final zzelx<zzbxj> zzfwk;
    private final zzelx<zzcbj> zzfwl;
    private final zzelx<zzcwh> zzgna;
    private final zzelx<ViewGroup> zzgnb;

    public zzcua(zzelx<zzbii> zzelxVar, zzelx<zzbsg.zza> zzelxVar2, zzelx<zzcwh> zzelxVar3, zzelx<zzbxj> zzelxVar4, zzelx<zzcbj> zzelxVar5, zzelx<zzbvb> zzelxVar6, zzelx<ViewGroup> zzelxVar7) {
        this.zzfwi = zzelxVar;
        this.zzfwj = zzelxVar2;
        this.zzgna = zzelxVar3;
        this.zzfwk = zzelxVar4;
        this.zzfwl = zzelxVar5;
        this.zzfrw = zzelxVar6;
        this.zzgnb = zzelxVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzctx(this.zzfwi.get(), this.zzfwj.get(), this.zzgna.get(), this.zzfwk.get(), this.zzfwl.get(), this.zzfrw.get(), this.zzgnb.get());
    }
}
