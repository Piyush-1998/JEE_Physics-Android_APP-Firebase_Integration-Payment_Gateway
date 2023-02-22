package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdlt {
    private final Pattern zzhch;

    public zzdlt() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzwe.zzpu().zzd(zzaat.zzcxb));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.zzhch = pattern;
    }

    public final String zzgu(String str) {
        Pattern pattern = this.zzhch;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
