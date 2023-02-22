package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbny implements zzelo<zzbys<zzbuj>> {
    private final zzelx<zzbow> zzfnr;
    private final zzbnl zzfoq;

    public zzbny(zzbnl zzbnlVar, zzelx<zzbow> zzelxVar) {
        this.zzfoq = zzbnlVar;
        this.zzfnr = zzelxVar;
    }

    public static zzbys<zzbuj> zza(zzbnl zzbnlVar, zzbow zzbowVar) {
        return (zzbys) zzelu.zza(new zzbys(zzbowVar, zzbbi.zzedy), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzfnr.get());
    }
}
