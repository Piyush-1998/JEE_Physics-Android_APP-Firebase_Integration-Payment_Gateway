package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbjp implements zzdhr {
    private final /* synthetic */ zzbjc zzeud;
    private zzelx<Context> zzfgd;
    private zzelx<String> zzfge;
    private zzelx<zzdiz<zzbmw, zzbnc>> zzfgf;
    private zzelx<zzdht> zzfgg;
    private zzelx<zzdhc> zzfgh;
    private zzelx<zzdhl> zzfgi;

    private zzbjp(zzbjc zzbjcVar, Context context, String str) {
        zzelx zzelxVar;
        zzelx zzelxVar2;
        zzelx zzelxVar3;
        zzelx zzelxVar4;
        zzelx zzelxVar5;
        zzelx zzelxVar6;
        zzelx zzelxVar7;
        this.zzeud = zzbjcVar;
        this.zzfgd = zzeln.zzba(context);
        this.zzfge = zzeln.zzba(str);
        zzelx<Context> zzelxVar8 = this.zzfgd;
        zzelxVar = this.zzeud.zzetu;
        zzelxVar2 = this.zzeud.zzetv;
        this.zzfgf = new zzdjd(zzelxVar8, zzelxVar, zzelxVar2);
        zzelxVar3 = this.zzeud.zzetu;
        this.zzfgg = zzell.zzas(new zzdhz(zzelxVar3));
        zzelx<Context> zzelxVar9 = this.zzfgd;
        zzelxVar4 = this.zzeud.zzery;
        zzelxVar5 = this.zzeud.zzerp;
        this.zzfgh = zzell.zzas(new zzdhi(zzelxVar9, zzelxVar4, zzelxVar5, this.zzfgf, this.zzfgg, zzdlo.zzasq()));
        zzelxVar6 = this.zzeud.zzerp;
        zzelx<Context> zzelxVar10 = this.zzfgd;
        zzelx<String> zzelxVar11 = this.zzfge;
        zzelx<zzdhc> zzelxVar12 = this.zzfgh;
        zzelx<zzdht> zzelxVar13 = this.zzfgg;
        zzelxVar7 = this.zzeud.zzesg;
        this.zzfgi = zzell.zzas(new zzdho(zzelxVar6, zzelxVar10, zzelxVar11, zzelxVar12, zzelxVar13, zzelxVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzdhr
    public final zzdhl zzafq() {
        return this.zzfgi.get();
    }
}
