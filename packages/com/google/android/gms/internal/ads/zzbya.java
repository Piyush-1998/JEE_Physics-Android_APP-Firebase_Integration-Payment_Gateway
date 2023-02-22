package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbya implements zzelo<zzbxj> {
    private final zzbxj zzfug;

    private zzbya(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbya zzx(zzbxj zzbxjVar) {
        return new zzbya(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        zzbxj zzbxjVar = this.zzfug;
        if (zzbxjVar != null) {
            return (zzbxj) zzelu.zza(zzbxjVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
