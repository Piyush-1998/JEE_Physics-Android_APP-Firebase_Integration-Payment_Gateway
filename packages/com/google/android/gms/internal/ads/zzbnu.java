package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnu implements zzelo<zzbni> {
    private final zzelx<zzbnk> zzfgw;
    private final zzbnl zzfoq;

    public zzbnu(zzbnl zzbnlVar, zzelx<zzbnk> zzelxVar) {
        this.zzfoq = zzbnlVar;
        this.zzfgw = zzelxVar;
    }

    public static zzbni zza(zzbnl zzbnlVar, Object obj) {
        return (zzbni) zzelu.zza((zzbnk) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzfgw.get());
    }
}
