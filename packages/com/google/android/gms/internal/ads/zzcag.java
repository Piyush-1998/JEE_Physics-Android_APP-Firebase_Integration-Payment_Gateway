package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcag implements zzelo<zzbys<zzahp>> {
    private final zzelx<zzchs> zzfnr;
    private final zzbzw zzfva;

    public zzcag(zzbzw zzbzwVar, zzelx<zzchs> zzelxVar) {
        this.zzfva = zzbzwVar;
        this.zzfnr = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), zzbbi.zzedz), "Cannot return null from a non-@Nullable @Provides method");
    }
}
