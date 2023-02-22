package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbyt implements zzelo<zzbyr> {
    private final zzelx<Context> zzert;
    private final zzelx<Set<zzbys<zzqu>>> zzfor;
    private final zzelx<zzdkx> zzfpe;

    private zzbyt(zzelx<Context> zzelxVar, zzelx<Set<zzbys<zzqu>>> zzelxVar2, zzelx<zzdkx> zzelxVar3) {
        this.zzert = zzelxVar;
        this.zzfor = zzelxVar2;
        this.zzfpe = zzelxVar3;
    }

    public static zzbyt zzj(zzelx<Context> zzelxVar, zzelx<Set<zzbys<zzqu>>> zzelxVar2, zzelx<zzdkx> zzelxVar3) {
        return new zzbyt(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbyr(this.zzert.get(), this.zzfor.get(), this.zzfpe.get());
    }
}
