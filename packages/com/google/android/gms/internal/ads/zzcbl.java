package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbl implements zzelo<zzcbj> {
    private final zzcbj zzfvo;

    private zzcbl(zzcbj zzcbjVar) {
        this.zzfvo = zzcbjVar;
    }

    public static zzcbl zzc(zzcbj zzcbjVar) {
        return new zzcbl(zzcbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        zzcbj zzcbjVar = this.zzfvo;
        if (zzcbjVar != null) {
            return (zzcbj) zzelu.zza(zzcbjVar, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw null;
    }
}
