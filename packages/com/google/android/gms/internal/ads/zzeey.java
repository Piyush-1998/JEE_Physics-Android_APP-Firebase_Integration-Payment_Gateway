package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzeey {
    private static final Class<?> zziau = zzht("libcore.io.Memory");
    private static final boolean zziav;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbdd() {
        return (zziau == null || zziav) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> zzbde() {
        return zziau;
    }

    private static <T> Class<T> zzht(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        zziav = zzht("org.robolectric.Robolectric") != null;
    }
}
