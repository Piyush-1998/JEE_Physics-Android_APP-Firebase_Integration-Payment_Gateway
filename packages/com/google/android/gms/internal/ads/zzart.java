package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzart implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzaro zzdps;
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdpu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzart(zzaro zzaroVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdps = zzaroVar;
        this.zzdpu = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzdps.zza(thread, th);
            } catch (Throwable unused) {
                zzbbd.zzfc("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzdpu;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzdpu;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
