package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdvh<V> extends zzdtd implements Future<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdtd
    /* renamed from: zzaxl */
    public abstract Future<? extends V> zzawm();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zzawm().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return zzawm().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return zzawm().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return zzawm().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzawm().get(j, timeUnit);
    }
}
