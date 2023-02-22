package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbiy implements zzelo<zzatd> {
    private final zzelx<Context> zzert;

    public zzbiy(zzelx<Context> zzelxVar) {
        this.zzert = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        Context context = this.zzert.get();
        return (zzatd) zzelu.zza(new zzatb(context, new zzate(context).zzvd()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
