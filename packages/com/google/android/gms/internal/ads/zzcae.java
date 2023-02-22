package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcae implements zzelo<zzbys<zzbuj>> {
    private final zzelx<zzcbb> zzfnr;
    private final zzbzw zzfva;

    private zzcae(zzbzw zzbzwVar, zzelx<zzcbb> zzelxVar) {
        this.zzfva = zzbzwVar;
        this.zzfnr = zzelxVar;
    }

    public static zzcae zzd(zzbzw zzbzwVar, zzelx<zzcbb> zzelxVar) {
        return new zzcae(zzbzwVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), zzbbi.zzedy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
