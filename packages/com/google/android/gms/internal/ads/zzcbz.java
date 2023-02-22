package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbz implements zzelo<zzcbv> {
    private final zzelx<Context> zzert;
    private final zzelx<JSONObject> zzeuj;
    private final zzelx<zzbma> zzeuq;
    private final zzelx<zzbst> zzevh;
    private final zzelx<zzbtl> zzevx;
    private final zzelx<zzbyr> zzexd;
    private final zzelx<zzdps> zzfbu;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<Clock> zzfms;
    private final zzelx<zzcdg> zzfok;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzdkx> zzfpe;
    private final zzelx<zzchc> zzfwn;
    private final zzelx<zzccv> zzfwo;
    private final zzelx<zzeg> zzfwp;
    private final zzelx<zzcdy> zzfwq;

    public zzcbz(zzelx<Context> zzelxVar, zzelx<zzcdg> zzelxVar2, zzelx<JSONObject> zzelxVar3, zzelx<zzchc> zzelxVar4, zzelx<zzccv> zzelxVar5, zzelx<zzeg> zzelxVar6, zzelx<zzbtl> zzelxVar7, zzelx<zzbst> zzelxVar8, zzelx<zzdkx> zzelxVar9, zzelx<zzbbg> zzelxVar10, zzelx<zzdln> zzelxVar11, zzelx<zzbma> zzelxVar12, zzelx<zzcdy> zzelxVar13, zzelx<Clock> zzelxVar14, zzelx<zzbyr> zzelxVar15, zzelx<zzdps> zzelxVar16) {
        this.zzert = zzelxVar;
        this.zzfok = zzelxVar2;
        this.zzeuj = zzelxVar3;
        this.zzfwn = zzelxVar4;
        this.zzfwo = zzelxVar5;
        this.zzfwp = zzelxVar6;
        this.zzevx = zzelxVar7;
        this.zzevh = zzelxVar8;
        this.zzfpe = zzelxVar9;
        this.zzfkr = zzelxVar10;
        this.zzfos = zzelxVar11;
        this.zzeuq = zzelxVar12;
        this.zzfwq = zzelxVar13;
        this.zzfms = zzelxVar14;
        this.zzexd = zzelxVar15;
        this.zzfbu = zzelxVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcbv(this.zzert.get(), this.zzfok.get(), this.zzeuj.get(), this.zzfwn.get(), this.zzfwo.get(), this.zzfwp.get(), this.zzevx.get(), this.zzevh.get(), this.zzfpe.get(), this.zzfkr.get(), this.zzfos.get(), this.zzeuq.get(), this.zzfwq.get(), this.zzfms.get(), this.zzexd.get(), this.zzfbu.get());
    }
}
