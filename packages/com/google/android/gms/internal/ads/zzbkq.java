package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbkq implements zzelo<zzdqm> {
    private final zzelx<Context> zzert;

    public zzbkq(zzelx<Context> zzelxVar) {
        this.zzert = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzdqm) zzelu.zza(new zzdqm(this.zzert.get(), com.google.android.gms.ads.internal.zzp.zzld().zzyf()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
