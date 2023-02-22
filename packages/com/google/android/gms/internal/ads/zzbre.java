package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbre implements zzelo<zzbys<zzbsy>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzckw> zzfmx;

    private zzbre(zzelx<zzckw> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzfmx = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzbre zzn(zzelx<zzckw> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzbre(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfmx.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
