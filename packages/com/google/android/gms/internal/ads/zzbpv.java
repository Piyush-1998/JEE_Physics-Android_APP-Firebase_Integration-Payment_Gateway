package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpv implements zzelo<String> {
    private final zzbpt zzfqi;

    private zzbpv(zzbpt zzbptVar) {
        this.zzfqi = zzbptVar;
    }

    public static zzbpv zza(zzbpt zzbptVar) {
        return new zzbpv(zzbptVar);
    }

    public static String zzb(zzbpt zzbptVar) {
        return (String) zzelu.zza(zzbptVar.zzait(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzfqi);
    }
}
