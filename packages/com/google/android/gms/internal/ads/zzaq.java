package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzaq {
    private static String TAG = "Volley";
    public static boolean DEBUG = Log.isLoggable("Volley", 2);
    private static final String CLASS_NAME = zzaq.class.getName();

    public static void v(String str, Object... objArr) {
        if (DEBUG) {
            Log.v(TAG, zza(str, objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zza {
        public static final boolean zzbw = zzaq.DEBUG;
        private final List<zzas> zzbx = new ArrayList();
        private boolean zzby = false;

        public final synchronized void zza(String str, long j) {
            if (this.zzby) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.zzbx.add(new zzas(str, j, SystemClock.elapsedRealtime()));
        }

        public final synchronized void zzd(String str) {
            this.zzby = true;
            long j = this.zzbx.size() == 0 ? 0L : this.zzbx.get(this.zzbx.size() - 1).time - this.zzbx.get(0).time;
            if (j <= 0) {
                return;
            }
            long j2 = this.zzbx.get(0).time;
            zzaq.d("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzas zzasVar : this.zzbx) {
                long j3 = zzasVar.time;
                zzaq.d("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzasVar.zzbz), zzasVar.name);
                j2 = j3;
            }
        }

        protected final void finalize() throws Throwable {
            if (this.zzby) {
                return;
            }
            zzd("Request on the loose");
            zzaq.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    public static void d(String str, Object... objArr) {
        Log.d(TAG, zza(str, objArr));
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, zza(str, objArr));
    }

    public static void zza(Throwable th, String str, Object... objArr) {
        Log.e(TAG, zza(str, objArr), th);
    }

    private static String zza(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(CLASS_NAME)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
