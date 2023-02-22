package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccf implements zzelo<zzchc> {
    private final zzccc zzfwr;

    public zzccf(zzccc zzcccVar) {
        this.zzfwr = zzcccVar;
    }

    public static zzchc zza(zzccc zzcccVar) {
        return (zzchc) zzelu.zza(zzcccVar.zzalg(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfwr);
    }
}
