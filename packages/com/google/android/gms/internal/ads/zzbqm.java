package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqm implements zzelo<zzbys<zzbtm>> {
    private final zzbqh zzfra;
    private final zzelx<zzbqq> zzfrb;

    private zzbqm(zzbqh zzbqhVar, zzelx<zzbqq> zzelxVar) {
        this.zzfra = zzbqhVar;
        this.zzfrb = zzelxVar;
    }

    public static zzbqm zzd(zzbqh zzbqhVar, zzelx<zzbqq> zzelxVar) {
        return new zzbqm(zzbqhVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfrb.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
