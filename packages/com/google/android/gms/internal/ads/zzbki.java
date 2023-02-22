package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbki implements zzelo<zzamh> {
    private final zzbke zzfkj;

    public zzbki(zzbke zzbkeVar) {
        this.zzfkj = zzbkeVar;
    }

    public static zzamh zzb(zzbke zzbkeVar) {
        return (zzamh) zzelu.zza(zzbkeVar.zzaei(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzfkj);
    }
}
