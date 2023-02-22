package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcon implements zzelo<zzcol> {
    private final zzelx<Context> zzert;

    public zzcon(zzelx<Context> zzelxVar) {
        this.zzert = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcol(this.zzert.get());
    }
}
