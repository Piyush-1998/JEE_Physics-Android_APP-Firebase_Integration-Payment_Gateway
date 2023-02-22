package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbal {
    @Deprecated
    public static <T> T zza(Context context, Callable<T> callable) {
        try {
            return (T) zza(callable);
        } catch (Throwable th) {
            zzbbd.zzc("Unexpected exception.", th);
            zzaro.zzt(context).zza(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    public static <T> T zza(zzdsz<T> zzdszVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return zzdszVar.get();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static <T> T zza(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
