package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbuz implements zzelo<zzbux> {
    private final zzelx<zzdkx> zzflw;
    private final zzelx<Set<zzbys<zzbuy>>> zzfor;

    private zzbuz(zzelx<Set<zzbys<zzbuy>>> zzelxVar, zzelx<zzdkx> zzelxVar2) {
        this.zzfor = zzelxVar;
        this.zzflw = zzelxVar2;
    }

    public static zzbuz zzu(zzelx<Set<zzbys<zzbuy>>> zzelxVar, zzelx<zzdkx> zzelxVar2) {
        return new zzbuz(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbux(this.zzfor.get(), this.zzflw.get());
    }
}
