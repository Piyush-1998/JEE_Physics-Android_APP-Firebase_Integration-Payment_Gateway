package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbrp implements zzelo<zzbys<zzbvj>> {
    private final zzelx<zzbro> zzfmx;
    private final zzbrq zzfrk;

    private zzbrp(zzbrq zzbrqVar, zzelx<zzbro> zzelxVar) {
        this.zzfrk = zzbrqVar;
        this.zzfmx = zzelxVar;
    }

    public static zzbrp zza(zzbrq zzbrqVar, zzelx<zzbro> zzelxVar) {
        return new zzbrp(zzbrqVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
