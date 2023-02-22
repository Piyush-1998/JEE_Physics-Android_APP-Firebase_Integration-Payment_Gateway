package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbms implements zzelo<View> {
    private final zzbmp zzfnq;

    public zzbms(zzbmp zzbmpVar) {
        this.zzfnq = zzbmpVar;
    }

    public static View zza(zzbmp zzbmpVar) {
        return (View) zzelu.zza(zzbmpVar.zzahf(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfnq);
    }
}
