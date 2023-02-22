package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbql implements zzelo<zzbys<zzbuj>> {
    private final zzbqh zzfra;
    private final zzelx<zzbqq> zzfrb;

    private zzbql(zzbqh zzbqhVar, zzelx<zzbqq> zzelxVar) {
        this.zzfra = zzbqhVar;
        this.zzfrb = zzelxVar;
    }

    public static zzbql zzc(zzbqh zzbqhVar, zzelx<zzbqq> zzelxVar) {
        return new zzbql(zzbqhVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfrb.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
