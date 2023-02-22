package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbbq<T> implements zzdvt<T> {
    private final zzdwe<T> zzeee = zzdwe.zzaxn();

    public final boolean set(T t) {
        return zzas(this.zzeee.set(t));
    }

    public final boolean setException(Throwable th) {
        return zzas(this.zzeee.setException(th));
    }

    private static boolean zzas(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzp.zzkt().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzdvt
    public void addListener(Runnable runnable, Executor executor) {
        this.zzeee.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zzeee.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.zzeee.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.zzeee.isDone();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.zzeee.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzeee.get(j, timeUnit);
    }
}
