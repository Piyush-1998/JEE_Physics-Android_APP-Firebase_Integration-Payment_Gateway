package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzdvc<V> extends zzdvp<V> {
    public static <V> zzdvc<V> zzg(zzdvt<V> zzdvtVar) {
        if (zzdvtVar instanceof zzdvc) {
            return (zzdvc) zzdvtVar;
        }
        return new zzdve(zzdvtVar);
    }

    public final <X extends Throwable> zzdvc<V> zza(Class<X> cls, zzdsl<? super X, ? extends V> zzdslVar, Executor executor) {
        zzduj zzdujVar = new zzduj(this, cls, zzdslVar);
        addListener(zzdujVar, zzdvv.zza(executor, zzdujVar));
        return zzdujVar;
    }

    public final <X extends Throwable> zzdvc<V> zza(Class<X> cls, zzduv<? super X, ? extends V> zzduvVar, Executor executor) {
        zzdug zzdugVar = new zzdug(this, cls, zzduvVar);
        addListener(zzdugVar, zzdvv.zza(executor, zzdugVar));
        return zzdugVar;
    }

    public final zzdvc<V> zza(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (zzdvc) zzdvl.zza(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> zzdvc<T> zzb(zzduv<? super V, T> zzduvVar, Executor executor) {
        zzdsv.checkNotNull(executor);
        zzdun zzdunVar = new zzdun(this, zzduvVar);
        addListener(zzdunVar, zzdvv.zza(executor, zzdunVar));
        return zzdunVar;
    }

    public final <T> zzdvc<T> zza(zzdsl<? super V, T> zzdslVar, Executor executor) {
        zzdsv.checkNotNull(zzdslVar);
        zzdum zzdumVar = new zzdum(this, zzdslVar);
        addListener(zzdumVar, zzdvv.zza(executor, zzdumVar));
        return zzdumVar;
    }
}
