package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbor implements zzelo<Runnable> {
    private final zzbos zzfpd;

    public zzbor(zzbos zzbosVar) {
        this.zzfpd = zzbosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Runnable) zzelu.zza(this.zzfpd.zzaih(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
