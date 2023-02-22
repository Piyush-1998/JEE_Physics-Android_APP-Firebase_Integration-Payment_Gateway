package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfy implements zzelo<zzdfw> {
    private final zzelx<Context> zzfrj;

    public zzdfy(zzelx<Context> zzelxVar) {
        this.zzfrj = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdfw(this.zzfrj.get());
    }
}
