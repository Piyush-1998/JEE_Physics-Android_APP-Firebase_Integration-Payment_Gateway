package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbrl implements zzelo<zzbys<zzbuj>> {
    private final zzelx<zzbrx> zzfmx;
    private final zzbqz zzfri;

    private zzbrl(zzbqz zzbqzVar, zzelx<zzbrx> zzelxVar) {
        this.zzfri = zzbqzVar;
        this.zzfmx = zzelxVar;
    }

    public static zzbrl zzb(zzbqz zzbqzVar, zzelx<zzbrx> zzelxVar) {
        return new zzbrl(zzbqzVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
