package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbns implements zzelo<zzdkw> {
    private final zzbnl zzfoq;

    public zzbns(zzbnl zzbnlVar) {
        this.zzfoq = zzbnlVar;
    }

    public static zzdkw zzc(zzbnl zzbnlVar) {
        return (zzdkw) zzelu.zza(zzbnlVar.zzahz(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzc(this.zzfoq);
    }
}
