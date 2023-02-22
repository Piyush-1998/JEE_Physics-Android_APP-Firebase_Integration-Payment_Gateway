package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnf implements zzelo<zzbvb> {
    private final zzelx<Clock> zzfms;
    private final zzelx<ScheduledExecutorService> zzfnz;

    public zzbnf(zzelx<ScheduledExecutorService> zzelxVar, zzelx<Clock> zzelxVar2) {
        this.zzfnz = zzelxVar;
        this.zzfms = zzelxVar2;
    }

    public static zzbvb zza(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return (zzbvb) zzelu.zza(new zzbvb(scheduledExecutorService, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfnz.get(), this.zzfms.get());
    }
}
