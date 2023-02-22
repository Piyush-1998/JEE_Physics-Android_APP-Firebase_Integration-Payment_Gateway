package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbir implements zzelo<zzble> {
    private final zzbih zzern;
    private final zzelx<zzbii> zzerp;

    public zzbir(zzbih zzbihVar, zzelx<zzbii> zzelxVar) {
        this.zzern = zzbihVar;
        this.zzerp = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzble) zzelu.zza(this.zzerp.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
