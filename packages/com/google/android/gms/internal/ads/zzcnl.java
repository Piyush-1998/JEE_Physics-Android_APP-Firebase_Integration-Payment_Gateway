package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcnl implements zzelo<zzcoh> {
    private final zzelx<Context> zzert;

    private zzcnl(zzelx<Context> zzelxVar) {
        this.zzert = zzelxVar;
    }

    public static zzcnl zzad(zzelx<Context> zzelxVar) {
        return new zzcnl(zzelxVar);
    }

    public static zzcoh zzcf(Context context) {
        return (zzcoh) zzelu.zza(new zzcoh(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzcf(this.zzert.get());
    }
}
