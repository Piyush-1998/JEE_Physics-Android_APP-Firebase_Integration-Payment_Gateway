package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpw implements zzelo<zzdkx> {
    private final zzbpt zzfqi;

    private zzbpw(zzbpt zzbptVar) {
        this.zzfqi = zzbptVar;
    }

    public static zzbpw zzc(zzbpt zzbptVar) {
        return new zzbpw(zzbptVar);
    }

    public static zzdkx zzd(zzbpt zzbptVar) {
        return (zzdkx) zzelu.zza(zzbptVar.zzais(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzd(this.zzfqi);
    }
}
