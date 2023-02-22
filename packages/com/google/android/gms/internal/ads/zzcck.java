package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcck implements zzelo<zzbys<zzbtm>> {
    private final zzelx<zzces> zzfnr;
    private final zzccc zzfwr;

    public zzcck(zzccc zzcccVar, zzelx<zzces> zzelxVar) {
        this.zzfwr = zzcccVar;
        this.zzfnr = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
