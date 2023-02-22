package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnm implements zzelo<zzbnk> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbyw> zzewb;
    private final zzelx<zzbpg> zzewy;
    private final zzelx<zzcwz> zzfgv;
    private final zzelx<View> zzflx;
    private final zzelx<zzdkw> zzfoh;
    private final zzelx<zzbfq> zzfoi;
    private final zzelx<zzbpe> zzfoj;
    private final zzelx<zzcdg> zzfok;
    private final zzelx<Executor> zzfol;

    public zzbnm(zzelx<zzbpg> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzdkw> zzelxVar3, zzelx<View> zzelxVar4, zzelx<zzbfq> zzelxVar5, zzelx<zzbpe> zzelxVar6, zzelx<zzcdg> zzelxVar7, zzelx<zzbyw> zzelxVar8, zzelx<zzcwz> zzelxVar9, zzelx<Executor> zzelxVar10) {
        this.zzewy = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfoh = zzelxVar3;
        this.zzflx = zzelxVar4;
        this.zzfoi = zzelxVar5;
        this.zzfoj = zzelxVar6;
        this.zzfok = zzelxVar7;
        this.zzewb = zzelxVar8;
        this.zzfgv = zzelxVar9;
        this.zzfol = zzelxVar10;
    }

    public static zzbnk zza(zzbpg zzbpgVar, Context context, zzdkw zzdkwVar, View view, zzbfq zzbfqVar, zzbpe zzbpeVar, zzcdg zzcdgVar, zzbyw zzbywVar, zzeli<zzcwz> zzeliVar, Executor executor) {
        return new zzbnk(zzbpgVar, context, zzdkwVar, view, zzbfqVar, zzbpeVar, zzcdgVar, zzbywVar, zzeliVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzewy.get(), this.zzert.get(), this.zzfoh.get(), this.zzflx.get(), this.zzfoi.get(), this.zzfoj.get(), this.zzfok.get(), this.zzewb.get(), zzell.zzat(this.zzfgv), this.zzfol.get());
    }
}
