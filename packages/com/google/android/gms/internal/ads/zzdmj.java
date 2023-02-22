package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmj implements zzelo<zzdmk> {
    private final zzelx<Context> zzert;
    private final zzelx<zzaxv> zzeyd;

    private zzdmj(zzelx<Context> zzelxVar, zzelx<zzaxv> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzeyd = zzelxVar2;
    }

    public static zzdmj zzbj(zzelx<Context> zzelxVar, zzelx<zzaxv> zzelxVar2) {
        return new zzdmj(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdmk(this.zzert.get(), this.zzeyd.get());
    }
}
