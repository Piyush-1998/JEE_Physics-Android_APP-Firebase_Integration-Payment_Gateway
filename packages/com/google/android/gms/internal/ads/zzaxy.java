package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxy extends zzbbd {
    public static void zzei(String str) {
        if (zzww()) {
            Log.v(AdRequest.LOGTAG, str);
        }
    }

    public static void zza(String str, Throwable th) {
        if (zzww()) {
            Log.v(AdRequest.LOGTAG, str, th);
        }
    }

    public static boolean zzww() {
        return isLoggable(2) && zzacn.zzdaw.get().booleanValue();
    }
}
