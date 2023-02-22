package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqp implements zzelo<zzbqq> {
    private final zzelx<Clock> zzfms;
    private final zzelx<zzaxj> zzfrc;

    private zzbqp(zzelx<Clock> zzelxVar, zzelx<zzaxj> zzelxVar2) {
        this.zzfms = zzelxVar;
        this.zzfrc = zzelxVar2;
    }

    public static zzbqp zzd(zzelx<Clock> zzelxVar, zzelx<zzaxj> zzelxVar2) {
        return new zzbqp(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbqq(this.zzfms.get(), this.zzfrc.get());
    }
}
