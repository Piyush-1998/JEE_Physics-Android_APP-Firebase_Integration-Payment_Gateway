package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzpg {
    public static boolean zzbf(String str) {
        return "audio".equals(zzbh(str));
    }

    public static boolean zzbg(String str) {
        return "video".equals(zzbh(str));
    }

    private static String zzbh(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
        }
        return str.substring(0, indexOf);
    }
}
