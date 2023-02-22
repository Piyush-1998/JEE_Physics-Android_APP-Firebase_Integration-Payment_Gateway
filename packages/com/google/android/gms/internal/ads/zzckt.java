package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckt implements zzelo<zzcks> {
    private final zzelx<zzto> zzgek;
    private final zzelx<Map<zzdpg, zzcku>> zzges;

    private zzckt(zzelx<zzto> zzelxVar, zzelx<Map<zzdpg, zzcku>> zzelxVar2) {
        this.zzgek = zzelxVar;
        this.zzges = zzelxVar2;
    }

    public static zzckt zzah(zzelx<zzto> zzelxVar, zzelx<Map<zzdpg, zzcku>> zzelxVar2) {
        return new zzckt(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcks(this.zzgek.get(), this.zzges.get());
    }
}
