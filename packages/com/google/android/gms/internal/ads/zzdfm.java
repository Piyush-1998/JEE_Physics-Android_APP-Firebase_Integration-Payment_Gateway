package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfm implements zzdek<JSONObject> {
    private String zzgwc;

    public zzdfm(String str) {
        this.zzgwc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzbab.zzb(jSONObject, "pii");
            if (TextUtils.isEmpty(this.zzgwc)) {
                return;
            }
            zzb.put("attok", this.zzgwc);
        } catch (JSONException e) {
            zzaxy.zza("Failed putting attestation token.", e);
        }
    }
}
