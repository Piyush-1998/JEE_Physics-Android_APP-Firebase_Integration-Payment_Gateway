package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcjb implements zzelo<zzbys<zzbtp>> {
    private final zzelx<zzcja> zzfnr;
    private final zzcjc zzgds;

    private zzcjb(zzcjc zzcjcVar, zzelx<zzcja> zzelxVar) {
        this.zzgds = zzcjcVar;
        this.zzfnr = zzelxVar;
    }

    public static zzcjb zza(zzcjc zzcjcVar, zzelx<zzcja> zzelxVar) {
        return new zzcjb(zzcjcVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), zzbbi.zzedy), "Cannot return null from a non-@Nullable @Provides method");
    }
}
