package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfe implements zzdek<JSONObject> {
    private final String zzgvw;

    public zzdfe(String str) {
        this.zzgvw = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.zzgvw);
        } catch (JSONException e) {
            zzaxy.zza("Failed putting Ad ID.", e);
        }
    }
}
