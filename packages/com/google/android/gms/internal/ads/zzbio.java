package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbio implements zzelo<zzcrf<zzdlx, zzcsn>> {
    private final zzbih zzern;
    private final zzelx<zzcji> zzero;

    public zzbio(zzbih zzbihVar, zzelx<zzcji> zzelxVar) {
        this.zzern = zzbihVar;
        this.zzero = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcrf) zzelu.zza(new zzcuw(this.zzero.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
