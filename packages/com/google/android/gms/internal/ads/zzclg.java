package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclg {
    private ConcurrentHashMap<String, String> zzgfd;

    public zzclg(zzcln zzclnVar) {
        this.zzgfd = zzclnVar.zzaot();
    }

    public final void zzc(zzdlj zzdljVar) {
        if (zzdljVar.zzhbq.zzhbm.size() > 0) {
            int i = zzdljVar.zzhbq.zzhbm.get(0).zzhag;
            if (i == 1) {
                this.zzgfd.put("ad_format", "banner");
            } else if (i == 2) {
                this.zzgfd.put("ad_format", "interstitial");
            } else if (i == 3) {
                this.zzgfd.put("ad_format", "native_express");
            } else if (i == 4) {
                this.zzgfd.put("ad_format", "native_advanced");
            } else if (i == 5) {
                this.zzgfd.put("ad_format", "rewarded");
            } else {
                this.zzgfd.put("ad_format", EnvironmentCompat.MEDIA_UNKNOWN);
            }
        }
        if (TextUtils.isEmpty(zzdljVar.zzhbq.zzhbn.zzdsg)) {
            return;
        }
        this.zzgfd.put("gqi", zzdljVar.zzhbq.zzhbn.zzdsg);
    }

    public final void zzj(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zzgfd.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zzgfd.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> zzrr() {
        return this.zzgfd;
    }
}
