package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfi implements zzdek<JSONObject> {
    private final JSONObject zzgvy;

    public zzdfi(JSONObject jSONObject) {
        this.zzgvy = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzbab.zzb(jSONObject, "content_info");
            JSONObject jSONObject2 = this.zzgvy;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzb.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            zzaxy.zzei("Failed putting app indexing json.");
        }
    }
}
