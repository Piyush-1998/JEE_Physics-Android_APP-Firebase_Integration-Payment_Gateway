package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxw {
    public static void zzao(Context context) {
        if (zzbax.zzbs(context) && !zzbax.zzyq()) {
            zzdvt<?> zzwv = new zzaxz(context).zzwv();
            zzaxy.zzfd("Updating ad debug logging enablement.");
            zzbbm.zza(zzwv, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
