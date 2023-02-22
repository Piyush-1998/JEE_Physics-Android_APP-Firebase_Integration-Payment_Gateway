package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbip implements zzelo<zzcrf<zzdlx, zzcso>> {
    private final zzbih zzern;
    private final zzelx<zzcji> zzero;

    public zzbip(zzbih zzbihVar, zzelx<zzcji> zzelxVar) {
        this.zzern = zzbihVar;
        this.zzero = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcrf) zzelu.zza(new zzctg(this.zzero.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
