package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbri implements zzelo<zzbys<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzelx<zzbpx> zzfnr;
    private final zzbqz zzfri;

    private zzbri(zzbqz zzbqzVar, zzelx<zzbpx> zzelxVar) {
        this.zzfri = zzbqzVar;
        this.zzfnr = zzelxVar;
    }

    public static zzbri zza(zzbqz zzbqzVar, zzelx<zzbpx> zzelxVar) {
        return new zzbri(zzbqzVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
