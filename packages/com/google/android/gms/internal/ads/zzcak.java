package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcak implements zzelo<zzbys<zzbsu>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcbf> zzfnr;
    private final zzbzw zzfva;

    private zzcak(zzbzw zzbzwVar, zzelx<zzcbf> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzfva = zzbzwVar;
        this.zzfnr = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzcak zzb(zzbzw zzbzwVar, zzelx<zzcbf> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzcak(zzbzwVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
