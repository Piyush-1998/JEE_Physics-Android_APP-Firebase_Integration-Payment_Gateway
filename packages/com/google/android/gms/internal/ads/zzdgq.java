package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgq implements zzelo<ApplicationInfo> {
    private final zzdgo zzgws;

    public zzdgq(zzdgo zzdgoVar) {
        this.zzgws = zzdgoVar;
    }

    public static ApplicationInfo zzb(zzdgo zzdgoVar) {
        return (ApplicationInfo) zzelu.zza(zzdgoVar.zzars(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzgws);
    }
}
