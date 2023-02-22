package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsl implements zzelo<String> {
    private final zzelx<zzbqq> zzeyg;
    private final zzbsg zzfsm;

    private zzbsl(zzbsg zzbsgVar, zzelx<zzbqq> zzelxVar) {
        this.zzfsm = zzbsgVar;
        this.zzeyg = zzelxVar;
    }

    public static zzbsl zzb(zzbsg zzbsgVar, zzelx<zzbqq> zzelxVar) {
        return new zzbsl(zzbsgVar, zzelxVar);
    }

    public static String zza(zzbsg zzbsgVar, zzbqq zzbqqVar) {
        return (String) zzelu.zza(zzbqqVar.zzwc(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfsm, this.zzeyg.get());
    }
}
