package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdvv {
    public static Executor zzaxm() {
        return zzdva.INSTANCE;
    }

    public static zzdvw zza(ExecutorService executorService) {
        if (executorService instanceof zzdvw) {
            return (zzdvw) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new zzdvz((ScheduledExecutorService) executorService);
        }
        return new zzdwa(executorService);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zza(Executor executor, zzdui<?> zzduiVar) {
        zzdsv.checkNotNull(executor);
        zzdsv.checkNotNull(zzduiVar);
        return executor == zzdva.INSTANCE ? executor : new zzdvy(executor, zzduiVar);
    }
}
