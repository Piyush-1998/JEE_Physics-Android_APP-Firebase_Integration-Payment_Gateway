package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzawq {
    public static String zzc(String str, Context context, boolean z) {
        String zzah;
        if ((!((Boolean) zzwe.zzpu().zzd(zzaat.zzcnm)).booleanValue() || z) && com.google.android.gms.ads.internal.zzp.zzln().zzac(context) && !TextUtils.isEmpty(str) && (zzah = com.google.android.gms.ads.internal.zzp.zzln().zzah(context)) != null) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcne)).booleanValue()) {
                String str2 = (String) zzwe.zzpu().zzd(zzaat.zzcnf);
                if (str.contains(str2)) {
                    if (com.google.android.gms.ads.internal.zzp.zzkp().zzep(str)) {
                        com.google.android.gms.ads.internal.zzp.zzln().zzi(context, zzah);
                        return zzb(str, context).replace(str2, zzah);
                    } else if (com.google.android.gms.ads.internal.zzp.zzkp().zzeq(str)) {
                        com.google.android.gms.ads.internal.zzp.zzln().zzj(context, zzah);
                        return zzb(str, context).replace(str2, zzah);
                    } else {
                        return str;
                    }
                }
                return str;
            } else if (str.contains("fbs_aeid")) {
                return str;
            } else {
                if (com.google.android.gms.ads.internal.zzp.zzkp().zzep(str)) {
                    com.google.android.gms.ads.internal.zzp.zzln().zzi(context, zzah);
                    return zza(zzb(str, context), "fbs_aeid", zzah).toString();
                } else if (com.google.android.gms.ads.internal.zzp.zzkp().zzeq(str)) {
                    com.google.android.gms.ads.internal.zzp.zzln().zzj(context, zzah);
                    return zza(zzb(str, context), "fbs_aeid", zzah).toString();
                } else {
                    return str;
                }
            }
        }
        return str;
    }

    private static String zzb(String str, Context context) {
        String zzaf = com.google.android.gms.ads.internal.zzp.zzln().zzaf(context);
        String zzag = com.google.android.gms.ads.internal.zzp.zzln().zzag(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(zzaf)) {
            str = zza(str, "gmp_app_id", zzaf).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(zzag)) ? str : zza(str, "fbs_aiid", zzag).toString();
    }

    public static String zzb(Uri uri, Context context) {
        if (!com.google.android.gms.ads.internal.zzp.zzln().zzac(context)) {
            return uri.toString();
        }
        String zzah = com.google.android.gms.ads.internal.zzp.zzln().zzah(context);
        if (zzah == null) {
            return uri.toString();
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcne)).booleanValue()) {
            String str = (String) zzwe.zzpu().zzd(zzaat.zzcnf);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                com.google.android.gms.ads.internal.zzp.zzln().zzi(context, zzah);
                return zzb(uri2, context).replace(str, zzah);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String uri3 = zza(zzb(uri.toString(), context), "fbs_aeid", zzah).toString();
            com.google.android.gms.ads.internal.zzp.zzln().zzi(context, zzah);
            return uri3;
        }
        return uri.toString();
    }

    private static Uri zza(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
        }
        return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }
}
