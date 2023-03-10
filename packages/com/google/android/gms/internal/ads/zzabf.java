package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzabf extends zzabe {
    @Override // com.google.android.gms.internal.ads.zzabe
    public final String zzg(String str, String str2) {
        String zzcw = zzcw(str);
        String zzcw2 = zzcw(str2);
        if (TextUtils.isEmpty(zzcw)) {
            return zzcw2;
        }
        if (TextUtils.isEmpty(zzcw2)) {
            return zzcw;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(zzcw).length() + 1 + String.valueOf(zzcw2).length());
        sb.append(zzcw);
        sb.append(",");
        sb.append(zzcw2);
        return sb.toString();
    }

    private static String zzcw(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }
}
