package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzarq implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ Thread.UncaughtExceptionHandler zzdpr;
    private final /* synthetic */ zzaro zzdps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarq(zzaro zzaroVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzdps = zzaroVar;
        this.zzdpr = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.zzdps.zza(thread, th);
            } catch (Throwable unused) {
                zzbbd.zzfc("AdMob exception reporter failed reporting the exception.");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zzdpr;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zzdpr;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
