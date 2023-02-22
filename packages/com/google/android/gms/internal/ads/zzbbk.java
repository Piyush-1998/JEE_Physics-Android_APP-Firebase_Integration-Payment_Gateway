package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbbk implements Executor {
    private final Handler zzeea = new zzayb(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzp.zzkp();
                zzayh.zza(com.google.android.gms.ads.internal.zzp.zzkt().getApplicationContext(), th);
                throw th;
            }
        }
        this.zzeea.post(runnable);
    }
}
