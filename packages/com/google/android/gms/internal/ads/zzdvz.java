package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdvz extends zzdwa implements zzdvw, ScheduledExecutorService {
    private final ScheduledExecutorService zzhqf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvz(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.zzhqf = (ScheduledExecutorService) zzdsv.checkNotNull(scheduledExecutorService);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdwb zzdwbVar = new zzdwb(runnable);
        return new zzdwc(zzdwbVar, this.zzhqf.scheduleWithFixedDelay(zzdwbVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdwb zzdwbVar = new zzdwb(runnable);
        return new zzdwc(zzdwbVar, this.zzhqf.scheduleAtFixedRate(zzdwbVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzdwh zzf = zzdwh.zzf(callable);
        return new zzdwc(zzf, this.zzhqf.schedule(zzf, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzdwh zza = zzdwh.zza(runnable, (Object) null);
        return new zzdwc(zza, this.zzhqf.schedule(zza, j, timeUnit));
    }
}
