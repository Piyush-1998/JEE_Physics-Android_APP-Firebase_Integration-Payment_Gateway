package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnp implements zzelo<View> {
    private final zzbnl zzfoq;

    public zzbnp(zzbnl zzbnlVar) {
        this.zzfoq = zzbnlVar;
    }

    public static View zza(zzbnl zzbnlVar) {
        return (View) zzelu.zza(zzbnlVar.zzahq(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfoq);
    }
}
