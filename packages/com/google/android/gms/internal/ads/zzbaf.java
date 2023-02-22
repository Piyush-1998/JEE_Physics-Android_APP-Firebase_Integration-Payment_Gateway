package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbaf {
    private HandlerThread zzeci = null;
    private Handler handler = null;
    private int zzecj = 0;
    private final Object lock = new Object();

    public final Looper zzyf() {
        Looper looper;
        synchronized (this.lock) {
            if (this.zzecj == 0) {
                if (this.zzeci == null) {
                    zzaxy.zzei("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.zzeci = handlerThread;
                    handlerThread.start();
                    this.handler = new zzdsf(this.zzeci.getLooper());
                    zzaxy.zzei("Looper thread started.");
                } else {
                    zzaxy.zzei("Resuming the looper thread");
                    this.lock.notifyAll();
                }
            } else {
                Preconditions.checkNotNull(this.zzeci, "Invalid state: mHandlerThread should already been initialized.");
            }
            this.zzecj++;
            looper = this.zzeci.getLooper();
        }
        return looper;
    }

    public final Handler getHandler() {
        return this.handler;
    }
}
