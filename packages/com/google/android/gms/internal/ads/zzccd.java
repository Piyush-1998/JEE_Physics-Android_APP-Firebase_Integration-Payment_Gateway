package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccd implements zzelo<zzccz> {
    private final zzelx<zzcdc> zzeuk;
    private final zzccc zzfwr;

    public zzccd(zzccc zzcccVar, zzelx<zzcdc> zzelxVar) {
        this.zzfwr = zzcccVar;
        this.zzeuk = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzccz) zzelu.zza(this.zzeuk.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
