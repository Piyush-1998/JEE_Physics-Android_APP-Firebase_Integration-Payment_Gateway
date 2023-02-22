package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsq implements zzelo<zzavu> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdkx> zzfnc;
    private final zzbsr zzfsq;
    private final zzelx<zzbbg> zzfsr;
    private final zzelx<zzavw> zzfss;

    private zzbsq(zzbsr zzbsrVar, zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzavw> zzelxVar4) {
        this.zzfsq = zzbsrVar;
        this.zzert = zzelxVar;
        this.zzfsr = zzelxVar2;
        this.zzfnc = zzelxVar3;
        this.zzfss = zzelxVar4;
    }

    public static zzbsq zza(zzbsr zzbsrVar, zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzavw> zzelxVar4) {
        return new zzbsq(zzbsrVar, zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        Context context = this.zzert.get();
        zzbbg zzbbgVar = this.zzfsr.get();
        zzdkx zzdkxVar = this.zzfnc.get();
        zzavw zzavwVar = this.zzfss.get();
        if (zzdkxVar.zzhas != null) {
            return new zzavl(context, zzbbgVar, zzdkxVar.zzhas, zzdkxVar.zzhao.zzdos, zzavwVar);
        }
        return null;
    }
}
