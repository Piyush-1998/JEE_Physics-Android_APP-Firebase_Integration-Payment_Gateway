package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdly {
    public static void zza(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        zzaxy.zzfd(sb.toString());
        zzaxy.zza(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzkt().zzb(th, str);
    }

    public static void zze(Context context, boolean z) {
        if (z) {
            zzaxy.zzfd("This request is sent from a test device.");
            return;
        }
        zzwe.zzpq();
        String zzbm = zzbat.zzbm(context);
        StringBuilder sb = new StringBuilder(String.valueOf(zzbm).length() + 101);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(zzbm);
        sb.append("\") to get test ads on this device.");
        zzaxy.zzfd(sb.toString());
    }
}
