package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzblx implements zzelo<zzbly> {
    private final zzelx<Context> zzert;
    private final zzelx<zzqo> zzfmd;

    private zzblx(zzelx<Context> zzelxVar, zzelx<zzqo> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzfmd = zzelxVar2;
    }

    public static zzblx zza(zzelx<Context> zzelxVar, zzelx<zzqo> zzelxVar2) {
        return new zzblx(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbly(this.zzert.get(), this.zzfmd.get());
    }
}
