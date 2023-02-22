package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnr implements zzelo<zzbpe> {
    private final zzbnl zzfoq;

    public zzbnr(zzbnl zzbnlVar) {
        this.zzfoq = zzbnlVar;
    }

    public static zzbpe zzb(zzbnl zzbnlVar) {
        return (zzbpe) zzelu.zza(zzbnlVar.zzahy(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzfoq);
    }
}
