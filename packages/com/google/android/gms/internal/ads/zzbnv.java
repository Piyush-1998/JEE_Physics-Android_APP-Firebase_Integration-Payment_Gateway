package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnv implements zzelo<zzbys<zzbtm>> {
    private final zzelx<zzbow> zzfnr;
    private final zzbnl zzfoq;

    public zzbnv(zzbnl zzbnlVar, zzelx<zzbow> zzelxVar) {
        this.zzfoq = zzbnlVar;
        this.zzfnr = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), zzbbi.zzedy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
