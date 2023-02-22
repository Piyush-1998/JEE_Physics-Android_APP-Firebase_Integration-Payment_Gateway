package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcea implements zzelo<zzcdy> {
    private final zzelx<zzchc> zzewz;
    private final zzelx<Clock> zzfms;

    public zzcea(zzelx<zzchc> zzelxVar, zzelx<Clock> zzelxVar2) {
        this.zzewz = zzelxVar;
        this.zzfms = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcdy(this.zzewz.get(), this.zzfms.get());
    }
}
