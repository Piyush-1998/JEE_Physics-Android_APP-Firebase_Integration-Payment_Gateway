package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbra implements zzelo<com.google.android.gms.ads.internal.zza> {
    private final zzelx<Context> zzert;
    private final zzbqx zzfrg;
    private final zzelx<zzavu> zzfrh;

    private zzbra(zzbqx zzbqxVar, zzelx<Context> zzelxVar, zzelx<zzavu> zzelxVar2) {
        this.zzfrg = zzbqxVar;
        this.zzert = zzelxVar;
        this.zzfrh = zzelxVar2;
    }

    public static zzbra zza(zzbqx zzbqxVar, zzelx<Context> zzelxVar, zzelx<zzavu> zzelxVar2) {
        return new zzbra(zzbqxVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zza) zzelu.zza(new com.google.android.gms.ads.internal.zza(this.zzert.get(), this.zzfrh.get(), null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
