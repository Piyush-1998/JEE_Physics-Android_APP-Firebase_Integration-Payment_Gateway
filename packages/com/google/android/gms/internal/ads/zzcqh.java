package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqh implements zzelo<zzcqi> {
    private final zzelx<Context> zzert;

    private zzcqh(zzelx<Context> zzelxVar) {
        this.zzert = zzelxVar;
    }

    public static zzcqh zzaf(zzelx<Context> zzelxVar) {
        return new zzcqh(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcqi(this.zzert.get());
    }
}
