package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdmb {
    public static zzuw zza(int i, zzuw zzuwVar) {
        return ((Integer) zzwe.zzpu().zzd(zzaat.zzcxx)).intValue() > 0 ? zzuwVar : zza(i, null, zzuwVar);
    }

    public static zzuw zza(int i, String str, zzuw zzuwVar) {
        if (str == null) {
            switch (zzdme.zzhda[i - 1]) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    str = "Network error.";
                    break;
                case 3:
                    str = "No fill.";
                    break;
                case 4:
                    str = "App ID missing.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                default:
                    str = "Internal error.";
                    break;
            }
        }
        switch (zzdme.zzhda[i - 1]) {
            case 1:
                return new zzuw(1, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 2:
                return new zzuw(2, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 3:
                return new zzuw(3, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 4:
                return new zzuw(8, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 5:
                return new zzuw(1, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 6:
                return new zzuw(1, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 7:
                return new zzuw(4, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 8:
                return new zzuw(2, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 9:
                return new zzuw(1, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            case 10:
                return new zzuw(3, str, MobileAds.ERROR_DOMAIN, zzuwVar);
            default:
                return new zzuw(0, str, MobileAds.ERROR_DOMAIN, zzuwVar);
        }
    }
}
