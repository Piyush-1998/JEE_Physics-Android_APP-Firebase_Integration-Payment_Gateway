package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdhi implements zzelo<zzdhc> {
    private final zzelx<zzbii> zzerp;
    private final zzelx<Executor> zzfol;
    private final zzelx<Context> zzgxc;
    private final zzelx<zzdiz<zzbmw, zzbnc>> zzgxd;
    private final zzelx<zzdht> zzgxe;
    private final zzelx<zzdlp> zzgxf;

    public zzdhi(zzelx<Context> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<zzbii> zzelxVar3, zzelx<zzdiz<zzbmw, zzbnc>> zzelxVar4, zzelx<zzdht> zzelxVar5, zzelx<zzdlp> zzelxVar6) {
        this.zzgxc = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzerp = zzelxVar3;
        this.zzgxd = zzelxVar4;
        this.zzgxe = zzelxVar5;
        this.zzgxf = zzelxVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdhc(this.zzgxc.get(), this.zzfol.get(), this.zzerp.get(), this.zzgxd.get(), this.zzgxe.get(), this.zzgxf.get());
    }
}
