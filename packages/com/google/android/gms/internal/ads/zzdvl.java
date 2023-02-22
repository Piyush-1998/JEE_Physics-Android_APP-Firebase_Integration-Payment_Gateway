package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdvq;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdvl extends zzdvo {
    public static <V> zzdvt<V> zzaf(@NullableDecl V v) {
        if (v == null) {
            return (zzdvt<V>) zzdvq.zzhpw;
        }
        return new zzdvq(v);
    }

    public static <V> zzdvt<V> immediateFailedFuture(Throwable th) {
        zzdsv.checkNotNull(th);
        return new zzdvq.zza(th);
    }

    public static <O> zzdvt<O> zza(zzdut<O> zzdutVar, Executor executor) {
        zzdwh zzdwhVar = new zzdwh(zzdutVar);
        executor.execute(zzdwhVar);
        return zzdwhVar;
    }

    public static <V, X extends Throwable> zzdvt<V> zzb(zzdvt<? extends V> zzdvtVar, Class<X> cls, zzduv<? super X, ? extends V> zzduvVar, Executor executor) {
        return zzduh.zza(zzdvtVar, cls, zzduvVar, executor);
    }

    public static <V> zzdvt<V> zza(zzdvt<V> zzdvtVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzdvtVar.isDone() ? zzdvtVar : zzdwd.zzb(zzdvtVar, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> zzdvt<O> zzb(zzdvt<I> zzdvtVar, zzduv<? super I, ? extends O> zzduvVar, Executor executor) {
        return zzduk.zza(zzdvtVar, zzduvVar, executor);
    }

    public static <I, O> zzdvt<O> zzb(zzdvt<I> zzdvtVar, zzdsl<? super I, ? extends O> zzdslVar, Executor executor) {
        return zzduk.zza(zzdvtVar, zzdslVar, executor);
    }

    public static <V> zzdvt<List<V>> zzi(Iterable<? extends zzdvt<? extends V>> iterable) {
        return new zzdux(zzdtg.zzh(iterable), true);
    }

    @SafeVarargs
    public static <V> zzdvm<V> zza(zzdvt<? extends V>... zzdvtVarArr) {
        return new zzdvm<>(false, zzdtg.zzb(zzdvtVarArr), null);
    }

    public static <V> zzdvm<V> zzj(Iterable<? extends zzdvt<? extends V>> iterable) {
        return new zzdvm<>(false, zzdtg.zzh(iterable), null);
    }

    @SafeVarargs
    public static <V> zzdvm<V> zzb(zzdvt<? extends V>... zzdvtVarArr) {
        return new zzdvm<>(true, zzdtg.zzb(zzdvtVarArr), null);
    }

    public static <V> zzdvm<V> zzk(Iterable<? extends zzdvt<? extends V>> iterable) {
        return new zzdvm<>(true, zzdtg.zzh(iterable), null);
    }

    public static <V> void zza(zzdvt<V> zzdvtVar, zzdvi<? super V> zzdviVar, Executor executor) {
        zzdsv.checkNotNull(zzdviVar);
        zzdvtVar.addListener(new zzdvn(zzdvtVar, zzdviVar), executor);
    }

    public static <V> V zza(Future<V> future) throws ExecutionException {
        if (!future.isDone()) {
            throw new IllegalStateException(zzdsw.zzb("Future was expected to be done: %s", future));
        }
        return (V) zzdwl.getUninterruptibly(future);
    }

    public static <V> V zzb(Future<V> future) {
        zzdsv.checkNotNull(future);
        try {
            return (V) zzdwl.getUninterruptibly(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzdvd((Error) cause);
            }
            throw new zzdwm(cause);
        }
    }
}
