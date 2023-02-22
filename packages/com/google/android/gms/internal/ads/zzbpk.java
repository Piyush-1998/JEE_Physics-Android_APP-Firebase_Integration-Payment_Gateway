package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpk<AdT> implements zzelo<zzbph<AdT>> {
    private final zzelx<Map<String, zzcre<AdT>>> zzfpz;

    private zzbpk(zzelx<Map<String, zzcre<AdT>>> zzelxVar) {
        this.zzfpz = zzelxVar;
    }

    public static <AdT> zzbpk<AdT> zzd(zzelx<Map<String, zzcre<AdT>>> zzelxVar) {
        return new zzbpk<>(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbph(this.zzfpz.get());
    }
}
