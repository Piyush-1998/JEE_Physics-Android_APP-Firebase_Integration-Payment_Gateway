package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
abstract class zzdvs<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable zzhpx = new zzdvu();
    private static final Runnable zzhpy = new zzdvu();
    private static final Runnable zzhpz = new zzdvu();

    abstract boolean isDone();

    abstract T zzaxi() throws Exception;

    abstract String zzaxj();

    abstract void zzb(@NullableDecl T t, @NullableDecl Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        T zzaxi;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            boolean z = !isDone();
            if (z) {
                try {
                    zzaxi = zzaxi();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zzhpx)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (runnable != zzhpy && runnable != zzhpz) {
                                break;
                            }
                            i++;
                            if (i > 1000) {
                                Runnable runnable2 = zzhpz;
                                if (runnable == runnable2 || compareAndSet(zzhpy, runnable2)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            currentThread.interrupt();
                        }
                    }
                    if (z) {
                        zzb(null, th);
                        return;
                    }
                    return;
                }
            } else {
                zzaxi = null;
            }
            if (!compareAndSet(currentThread, zzhpx)) {
                Runnable runnable3 = get();
                boolean z3 = false;
                int i2 = 0;
                while (true) {
                    if (runnable3 != zzhpy && runnable3 != zzhpz) {
                        break;
                    }
                    i2++;
                    if (i2 > 1000) {
                        Runnable runnable4 = zzhpz;
                        if (runnable3 == runnable4 || compareAndSet(zzhpy, runnable4)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable3 = get();
                }
                if (z3) {
                    currentThread.interrupt();
                }
            }
            if (z) {
                zzb(zzaxi, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void interruptTask() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, zzhpy)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (getAndSet(zzhpx) == zzhpz) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == zzhpx) {
            str = "running=[DONE]";
        } else if (runnable == zzhpy) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzaxj = zzaxj();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(zzaxj).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzaxj);
        return sb2.toString();
    }
}
