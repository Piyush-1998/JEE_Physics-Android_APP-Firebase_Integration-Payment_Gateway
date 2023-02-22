package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqw implements zzelo<zzbys<zzbtm>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbln> zzfnr;

    private zzbqw(zzelx<zzbln> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzfnr = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzbqw zzj(zzelx<zzbln> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzbqw(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbys) zzelu.zza(new zzbys(this.zzfnr.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
