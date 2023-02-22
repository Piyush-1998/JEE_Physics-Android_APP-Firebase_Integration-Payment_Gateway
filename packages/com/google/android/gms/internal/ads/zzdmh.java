package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmh implements zzelo<zzbys<zzbsz>> {
    private final zzelx<zzdmk> zzfrb;
    private final zzdmi zzhdc;

    private zzdmh(zzdmi zzdmiVar, zzelx<zzdmk> zzelxVar) {
        this.zzhdc = zzdmiVar;
        this.zzfrb = zzelxVar;
    }

    public static zzdmh zza(zzdmi zzdmiVar, zzelx<zzdmk> zzelxVar) {
        return new zzdmh(zzdmiVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfrb.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
