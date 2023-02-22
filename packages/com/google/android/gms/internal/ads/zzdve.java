package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdve<V> extends zzdvc<V> {
    private final zzdvt<V> zzhps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdve(zzdvt<V> zzdvtVar) {
        this.zzhps = (zzdvt) zzdsv.checkNotNull(zzdvtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdui, com.google.android.gms.internal.ads.zzdvt
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzhps.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdui, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zzhps.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzdui, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzhps.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzdui, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzhps.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdui, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.zzhps.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdui, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzhps.get(j, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.zzdui
    public final String toString() {
        return this.zzhps.toString();
    }
}
