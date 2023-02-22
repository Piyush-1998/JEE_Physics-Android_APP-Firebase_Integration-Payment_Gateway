package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfs implements zzdek<JSONObject> {
    private JSONObject zzgwe;

    public zzdfs(JSONObject jSONObject) {
        this.zzgwe = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.zzgwe);
        } catch (JSONException unused) {
            zzaxy.zzei("Unable to get cache_state");
        }
    }
}
