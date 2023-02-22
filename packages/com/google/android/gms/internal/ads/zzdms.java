package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdms implements zzelo<zzdmo> {
    private final zzelx<zzdmm> zzfmp;
    private final zzdmq zzhdf;
    private final zzelx<String> zzhdh;

    private zzdms(zzdmq zzdmqVar, zzelx<zzdmm> zzelxVar, zzelx<String> zzelxVar2) {
        this.zzhdf = zzdmqVar;
        this.zzfmp = zzelxVar;
        this.zzhdh = zzelxVar2;
    }

    public static zzdms zza(zzdmq zzdmqVar, zzelx<zzdmm> zzelxVar, zzelx<String> zzelxVar2) {
        return new zzdms(zzdmqVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzdmo) zzelu.zza(this.zzfmp.get().zzgv(this.zzhdh.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
