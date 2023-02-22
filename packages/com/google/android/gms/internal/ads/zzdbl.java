package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbl implements zzelo<zzdbj<zzdba>> {
    private final zzelx<Clock> zzfms;
    private final zzelx<zzdbd> zzgtr;

    public zzdbl(zzelx<zzdbd> zzelxVar, zzelx<Clock> zzelxVar2) {
        this.zzgtr = zzelxVar;
        this.zzfms = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzdbj) zzelu.zza(new zzdbj(this.zzgtr.get(), 10000L, this.zzfms.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
