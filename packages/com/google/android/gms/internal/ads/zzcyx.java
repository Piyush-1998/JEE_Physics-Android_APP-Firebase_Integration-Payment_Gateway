package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztw;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzcyx {
    private String zzgrv;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zza {
        private String zzgrv;

        public final zza zzgs(String str) {
            this.zzgrv = str;
            return this;
        }
    }

    private zzcyx(zza zzaVar) {
        this.zzgrv = zzaVar.zzgrv;
    }

    public final Set<String> zzaqp() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zzgrv.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzaqq() {
        return this.zzgrv.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final zztw.zza.EnumC0020zza zzaqr() {
        char c;
        String str = this.zzgrv;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        return zztw.zza.EnumC0020zza.REWARD_BASED_VIDEO_AD;
                    }
                    return zztw.zza.EnumC0020zza.AD_INITIATER_UNSPECIFIED;
                }
                return zztw.zza.EnumC0020zza.AD_LOADER;
            }
            return zztw.zza.EnumC0020zza.INTERSTITIAL;
        }
        return zztw.zza.EnumC0020zza.BANNER;
    }
}
