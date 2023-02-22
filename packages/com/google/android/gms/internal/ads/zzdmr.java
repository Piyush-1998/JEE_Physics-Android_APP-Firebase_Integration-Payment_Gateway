package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmr implements zzelo<Context> {
    private final zzdmq zzhdf;
    private final zzelx<zzdmo> zzhdg;

    private zzdmr(zzdmq zzdmqVar, zzelx<zzdmo> zzelxVar) {
        this.zzhdf = zzdmqVar;
        this.zzhdg = zzelxVar;
    }

    public static zzdmr zzb(zzdmq zzdmqVar, zzelx<zzdmo> zzelxVar) {
        return new zzdmr(zzdmqVar, zzelxVar);
    }

    public static Context zzb(zzdmq zzdmqVar, zzdmo zzdmoVar) {
        return (Context) zzelu.zza(zzdmoVar.zzaai, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzhdf, this.zzhdg.get());
    }
}
