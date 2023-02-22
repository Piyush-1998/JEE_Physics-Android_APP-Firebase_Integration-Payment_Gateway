package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcal implements zzelo<zzbys<zzbwm>> {
    private final zzelx<Executor> zzerr;
    private final zzbzw zzfva;

    private zzcal(zzbzw zzbzwVar, zzelx<Executor> zzelxVar) {
        this.zzfva = zzbzwVar;
        this.zzerr = zzelxVar;
    }

    public static zzcal zzf(zzbzw zzbzwVar, zzelx<Executor> zzelxVar) {
        return new zzcal(zzbzwVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(this.zzfva.zzb(this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
