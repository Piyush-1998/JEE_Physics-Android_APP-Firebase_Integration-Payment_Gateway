package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbbi {
    public static final zzdvw zzedu = zza(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), zzfh("Default")));
    public static final zzdvw zzedv;
    public static final zzdvw zzedw;
    public static final ScheduledExecutorService zzedx;
    public static final zzdvw zzedy;
    public static final zzdvw zzedz;

    private static ThreadFactory zzfh(String str) {
        return new zzbbl(str);
    }

    private static zzdvw zza(Executor executor) {
        return new zzbbn(executor, null);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzfh("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzedv = zza(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzfh("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        zzedw = zza(threadPoolExecutor2);
        zzedx = new ScheduledThreadPoolExecutor(3, zzfh("Schedule"));
        zzedy = zza(new zzbbk());
        zzedz = zza(zzdvv.zzaxm());
    }
}
