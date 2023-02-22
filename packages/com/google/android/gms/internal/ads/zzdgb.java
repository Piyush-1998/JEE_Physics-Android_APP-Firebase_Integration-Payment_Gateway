package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgb implements zzdek<JSONObject> {
    private String zzgwl;
    private String zzgwm;

    public zzdgb(String str, String str2) {
        this.zzgwl = str;
        this.zzgwm = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzbab.zzb(jSONObject, "pii");
            zzb.put("doritos", this.zzgwl);
            zzb.put("doritos_v2", this.zzgwm);
        } catch (JSONException unused) {
            zzaxy.zzei("Failed putting doritos string.");
        }
    }
}
