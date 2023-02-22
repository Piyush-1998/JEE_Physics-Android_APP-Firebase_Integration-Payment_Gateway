package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdey implements zzdek<JSONObject> {
    private final AdvertisingIdClient.Info zzgvs;
    private final String zzgvt;

    public zzdey(AdvertisingIdClient.Info info, String str) {
        this.zzgvs = info;
        this.zzgvt = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzbab.zzb(jSONObject, "pii");
            if (this.zzgvs != null && !TextUtils.isEmpty(this.zzgvs.getId())) {
                zzb.put("rdid", this.zzgvs.getId());
                zzb.put("is_lat", this.zzgvs.isLimitAdTrackingEnabled());
                zzb.put("idtype", "adid");
                return;
            }
            zzb.put("pdid", this.zzgvt);
            zzb.put("pdidtype", "ssaid");
        } catch (JSONException e) {
            zzaxy.zza("Failed putting Ad ID.", e);
        }
    }
}
