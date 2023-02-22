package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmp implements zzelo<zzaya> {
    private final zzdmq zzhdf;
    private final zzelx<zzdmo> zzhdg;

    private zzdmp(zzdmq zzdmqVar, zzelx<zzdmo> zzelxVar) {
        this.zzhdf = zzdmqVar;
        this.zzhdg = zzelxVar;
    }

    public static zzdmp zza(zzdmq zzdmqVar, zzelx<zzdmo> zzelxVar) {
        return new zzdmp(zzdmqVar, zzelxVar);
    }

    public static zzaya zza(zzdmq zzdmqVar, zzdmo zzdmoVar) {
        return (zzaya) zzelu.zza(zzdmoVar.zzdza, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzhdf, this.zzhdg.get());
    }
}
