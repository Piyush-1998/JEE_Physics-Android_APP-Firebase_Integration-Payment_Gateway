package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcbx implements zzahf<Object> {
    private WeakReference<zzcbv> zzfwm;

    private zzcbx(zzcbv zzcbvVar) {
        this.zzfwm = new WeakReference<>(zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zza(Object obj, Map<String, String> map) {
        zzcbv zzcbvVar = this.zzfwm.get();
        if (zzcbvVar != null && "_ac".equals(map.get("eventName"))) {
            zzcbv.zzb(zzcbvVar).onAdClicked();
        }
    }
}
