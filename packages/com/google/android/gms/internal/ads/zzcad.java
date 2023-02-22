package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcad implements zzelo<zzbys<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzelx<zzcbb> zzfnr;
    private final zzbzw zzfva;

    private zzcad(zzbzw zzbzwVar, zzelx<zzcbb> zzelxVar) {
        this.zzfva = zzbzwVar;
        this.zzfnr = zzelxVar;
    }

    public static zzcad zzc(zzbzw zzbzwVar, zzelx<zzcbb> zzelxVar) {
        return new zzcad(zzbzwVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), zzbbi.zzedy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
