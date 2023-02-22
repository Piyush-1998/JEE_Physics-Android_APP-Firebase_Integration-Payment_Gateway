package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdho implements zzelo<zzdhl> {
    private final zzelx<zzbii> zzerp;
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<String> zzgxn;
    private final zzelx<zzdhc> zzgxo;
    private final zzelx<zzdht> zzgxp;

    public zzdho(zzelx<zzbii> zzelxVar, zzelx<Context> zzelxVar2, zzelx<String> zzelxVar3, zzelx<zzdhc> zzelxVar4, zzelx<zzdht> zzelxVar5, zzelx<zzbbg> zzelxVar6) {
        this.zzerp = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzgxn = zzelxVar3;
        this.zzgxo = zzelxVar4;
        this.zzgxp = zzelxVar5;
        this.zzfnd = zzelxVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdhl(this.zzerp.get(), this.zzert.get(), this.zzgxn.get(), this.zzgxo.get(), this.zzgxp.get(), this.zzfnd.get());
    }
}
