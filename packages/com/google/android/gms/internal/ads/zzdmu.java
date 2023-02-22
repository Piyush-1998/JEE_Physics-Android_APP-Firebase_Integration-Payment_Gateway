package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmu implements zzelo<zzaxv> {
    private final zzdmq zzhdf;
    private final zzelx<zzdmo> zzhdg;

    private zzdmu(zzdmq zzdmqVar, zzelx<zzdmo> zzelxVar) {
        this.zzhdf = zzdmqVar;
        this.zzhdg = zzelxVar;
    }

    public static zzdmu zzc(zzdmq zzdmqVar, zzelx<zzdmo> zzelxVar) {
        return new zzdmu(zzdmqVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzaxv) zzelu.zza(this.zzhdg.get().zzdxp, "Cannot return null from a non-@Nullable @Provides method");
    }
}
