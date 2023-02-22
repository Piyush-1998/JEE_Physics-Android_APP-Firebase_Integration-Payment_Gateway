package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqv implements zzelo<zzbys<zzbuj>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbln> zzfnr;

    private zzbqv(zzelx<zzbln> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzfnr = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzbqv zzi(zzelx<zzbln> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzbqv(zzelxVar, zzelxVar2);
    }

    public static zzbys<zzbuj> zza(zzbln zzblnVar, Executor executor) {
        return (zzbys) zzelu.zza(new zzbys(zzblnVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfnr.get(), this.zzerr.get());
    }
}
