package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpy implements zzelo<zzdlj> {
    private final zzbpt zzfqi;

    private zzbpy(zzbpt zzbptVar) {
        this.zzfqi = zzbptVar;
    }

    public static zzbpy zze(zzbpt zzbptVar) {
        return new zzbpy(zzbptVar);
    }

    public static zzdlj zzf(zzbpt zzbptVar) {
        return (zzdlj) zzelu.zza(zzbptVar.zzair(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzf(this.zzfqi);
    }
}
