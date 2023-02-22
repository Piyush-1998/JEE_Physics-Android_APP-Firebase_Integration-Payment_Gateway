package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzahq implements zzahf<Object> {
    private final zzahp zzdex;

    public static void zza(zzbfq zzbfqVar, zzahp zzahpVar) {
        zzbfqVar.zza("/reward", new zzahq(zzahpVar));
    }

    private zzahq(zzahp zzahpVar) {
        this.zzdex = zzahpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzaue zzaueVar = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzaueVar = new zzaue(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                zzaxy.zzd("Unable to parse reward amount.", e);
            }
            this.zzdex.zza(zzaueVar);
        } else if ("video_start".equals(str)) {
            this.zzdex.zzsv();
        } else if ("video_complete".equals(str)) {
            this.zzdex.zzsw();
        }
    }
}
