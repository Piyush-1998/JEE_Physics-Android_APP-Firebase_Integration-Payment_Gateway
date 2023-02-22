package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgr implements zzelo<String> {
    private final zzdgo zzgws;

    public zzdgr(zzdgo zzdgoVar) {
        this.zzgws = zzdgoVar;
    }

    public static String zzc(zzdgo zzdgoVar) {
        return (String) zzelu.zza(zzdgoVar.zzarn(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzc(this.zzgws);
    }
}
