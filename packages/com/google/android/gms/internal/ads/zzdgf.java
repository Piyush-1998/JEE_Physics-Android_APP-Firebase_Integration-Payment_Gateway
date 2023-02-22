package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgf implements zzdek<JSONObject> {
    private List<String> zzdqh;

    public zzdgf(List<String> list) {
        this.zzdqh = list;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.zzdqh));
        } catch (JSONException unused) {
            zzaxy.zzei("Failed putting experiment ids.");
        }
    }
}
