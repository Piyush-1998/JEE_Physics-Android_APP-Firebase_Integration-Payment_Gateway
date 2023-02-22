package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public interface zzdvw extends ExecutorService {
    <T> zzdvt<T> zze(Callable<T> callable);

    zzdvt<?> zzf(Runnable runnable);
}
