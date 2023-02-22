package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdwc<V> extends zzdvj<V> implements zzdvt<V>, ScheduledFuture<V> {
    private final ScheduledFuture<?> zzhqi;

    public zzdwc(zzdvt<V> zzdvtVar, ScheduledFuture<?> scheduledFuture) {
        super(zzdvtVar);
        this.zzhqi = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzdvh, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.zzhqi.cancel(z);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zzhqi.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return this.zzhqi.compareTo(delayed);
    }
}
