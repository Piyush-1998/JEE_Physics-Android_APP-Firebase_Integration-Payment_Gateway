package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcnm implements zzelo<String> {
    private final zzelx<Context> zzert;

    private zzcnm(zzelx<Context> zzelxVar) {
        this.zzert = zzelxVar;
    }

    public static zzcnm zzae(zzelx<Context> zzelxVar) {
        return new zzcnm(zzelxVar);
    }

    public static String zzcg(Context context) {
        return (String) zzelu.zza(context.getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzcg(this.zzert.get());
    }
}
