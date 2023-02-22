package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcni implements zzelo<ApplicationInfo> {
    private final zzelx<Context> zzert;

    private zzcni(zzelx<Context> zzelxVar) {
        this.zzert = zzelxVar;
    }

    public static zzcni zzac(zzelx<Context> zzelxVar) {
        return new zzcni(zzelxVar);
    }

    public static ApplicationInfo zzce(Context context) {
        return (ApplicationInfo) zzelu.zza(context.getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzce(this.zzert.get());
    }
}
