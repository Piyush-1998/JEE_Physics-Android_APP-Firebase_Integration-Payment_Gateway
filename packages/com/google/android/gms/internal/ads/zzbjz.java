package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbjz implements zzdkp {
    private final /* synthetic */ zzbjc zzeud;
    private zzelx<Context> zzfgd;
    private zzelx<String> zzfge;
    private zzelx<zzdiz<zzchx, zzchu>> zzfjd;
    private zzelx<zzdje> zzfje;
    private zzelx<zzdli> zzfjf;
    private zzelx<zzdkd> zzfjg;
    private zzelx<zzdkr> zzfjh;
    private zzelx<zzdkl> zzfji;

    private zzbjz(zzbjc zzbjcVar, Context context, String str) {
        zzelx zzelxVar;
        zzelx zzelxVar2;
        zzelx zzelxVar3;
        zzelx zzelxVar4;
        zzelx zzelxVar5;
        this.zzeud = zzbjcVar;
        zzelo zzba = zzeln.zzba(context);
        this.zzfgd = zzba;
        zzelxVar = this.zzeud.zzetu;
        zzelxVar2 = this.zzeud.zzetv;
        this.zzfjd = new zzdjc(zzba, zzelxVar, zzelxVar2);
        zzelxVar3 = this.zzeud.zzetu;
        this.zzfje = zzell.zzas(new zzdkb(zzelxVar3));
        this.zzfjf = zzell.zzas(zzdll.zzaso());
        zzelx<Context> zzelxVar6 = this.zzfgd;
        zzelxVar4 = this.zzeud.zzery;
        zzelxVar5 = this.zzeud.zzerp;
        zzelx<zzdkd> zzas = zzell.zzas(new zzdki(zzelxVar6, zzelxVar4, zzelxVar5, this.zzfjd, this.zzfje, zzdlo.zzasq(), this.zzfjf));
        this.zzfjg = zzas;
        this.zzfjh = zzell.zzas(new zzdks(zzas, this.zzfje, this.zzfjf));
        zzelo zzbb = zzeln.zzbb(str);
        this.zzfge = zzbb;
        this.zzfji = zzell.zzas(new zzdkm(zzbb, this.zzfjg, this.zzfgd, this.zzfje, this.zzfjf));
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final zzdkr zzagf() {
        return this.zzfjh.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkp
    public final zzdkl zzagg() {
        return this.zzfji.get();
    }
}
