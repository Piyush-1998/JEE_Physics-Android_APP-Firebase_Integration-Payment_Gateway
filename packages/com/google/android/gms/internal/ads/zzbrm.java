package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbrm implements zzelo<zzbys<zzbtp>> {
    private final zzelx<zzbrx> zzfmx;
    private final zzbqz zzfri;

    private zzbrm(zzbqz zzbqzVar, zzelx<zzbrx> zzelxVar) {
        this.zzfri = zzbqzVar;
        this.zzfmx = zzelxVar;
    }

    public static zzbrm zzc(zzbqz zzbqzVar, zzelx<zzbrx> zzelxVar) {
        return new zzbrm(zzbqzVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
