package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmf implements zzelo<zzalz> {
    private final zzelx<zzalu> zzfnb;

    private zzbmf(zzelx<zzalu> zzelxVar) {
        this.zzfnb = zzelxVar;
    }

    public static zzbmf zzb(zzelx<zzalu> zzelxVar) {
        return new zzbmf(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzalz) zzelu.zza(this.zzfnb.get().zztl(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
