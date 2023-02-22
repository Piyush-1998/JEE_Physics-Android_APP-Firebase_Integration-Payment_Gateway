package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccg implements zzelo<zzcdd> {
    private final zzccc zzfwr;
    private final zzelx<zzcbv> zzfwt;

    public zzccg(zzccc zzcccVar, zzelx<zzcbv> zzelxVar) {
        this.zzfwr = zzcccVar;
        this.zzfwt = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcdd) zzelu.zza(this.zzfwt.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
