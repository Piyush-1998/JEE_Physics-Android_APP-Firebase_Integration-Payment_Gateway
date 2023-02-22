package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdpp implements zzelo<zzalu> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfsr;
    private final zzdpq zzhid;

    public zzdpp(zzdpq zzdpqVar, zzelx<Context> zzelxVar, zzelx<zzbbg> zzelxVar2) {
        this.zzhid = zzdpqVar;
        this.zzert = zzelxVar;
        this.zzfsr = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzalu) zzelu.zza(new zzall().zzb(this.zzert.get(), this.zzfsr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
