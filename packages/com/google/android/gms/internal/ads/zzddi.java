package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddi implements zzelo<zzddj> {
    private final zzelx<String> zzgeo;

    private zzddi(zzelx<String> zzelxVar) {
        this.zzgeo = zzelxVar;
    }

    public static zzddi zzap(zzelx<String> zzelxVar) {
        return new zzddi(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzddj(this.zzgeo.get());
    }
}
