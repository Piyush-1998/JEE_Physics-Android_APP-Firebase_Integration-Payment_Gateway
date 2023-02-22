package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbn implements zzelo<zzdkv> {
    private final zzelx<Clock> zzfms;

    public zzdbn(zzelx<Clock> zzelxVar) {
        this.zzfms = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzdkv) zzelu.zza(new zzdkv(this.zzfms.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
