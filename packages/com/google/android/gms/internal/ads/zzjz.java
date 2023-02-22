package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzmc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzjz {
    private static final zzmk zzaot = new zzkc();
    private static final Pattern zzaou = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zzahl = -1;
    public int zzahm = -1;

    public final boolean zzb(zzmc zzmcVar) {
        for (int i = 0; i < zzmcVar.length(); i++) {
            zzmc.zza zzba = zzmcVar.zzba(i);
            if (zzba instanceof zzmi) {
                zzmi zzmiVar = (zzmi) zzba;
                if (zzb(zzmiVar.description, zzmiVar.text)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean zzb(String str, String str2) {
        if ("iTunSMPB".equals(str)) {
            Matcher matcher = zzaou.matcher(str2);
            if (matcher.find()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1), 16);
                    int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                    if (parseInt > 0 || parseInt2 > 0) {
                        this.zzahl = parseInt;
                        this.zzahm = parseInt2;
                        return true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        return false;
    }

    public final boolean zzgq() {
        return (this.zzahl == -1 || this.zzahm == -1) ? false : true;
    }
}
