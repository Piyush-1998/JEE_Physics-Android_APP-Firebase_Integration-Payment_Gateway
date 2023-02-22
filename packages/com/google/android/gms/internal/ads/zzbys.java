package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbys<T> {
    public Executor executor;
    public T zzfum;

    public static <T> zzbys<T> zzb(T t, Executor executor) {
        return new zzbys<>(t, executor);
    }

    public zzbys(T t, Executor executor) {
        this.zzfum = t;
        this.executor = executor;
    }
}
