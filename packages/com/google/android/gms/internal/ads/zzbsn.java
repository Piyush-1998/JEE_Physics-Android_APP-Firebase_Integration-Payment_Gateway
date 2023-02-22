package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsn implements zzelo<zzdln> {
    private final zzbsg zzfsm;

    private zzbsn(zzbsg zzbsgVar) {
        this.zzfsm = zzbsgVar;
    }

    public static zzbsn zzm(zzbsg zzbsgVar) {
        return new zzbsn(zzbsgVar);
    }

    public static zzdln zzn(zzbsg zzbsgVar) {
        return (zzdln) zzelu.zza(zzbsgVar.zzajf(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzn(this.zzfsm);
    }
}
