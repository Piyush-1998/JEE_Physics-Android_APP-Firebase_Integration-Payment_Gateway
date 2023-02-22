package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcqa implements zzaln<zzcpx> {
    @Override // com.google.android.gms.internal.ads.zzaln
    public final /* synthetic */ JSONObject zzj(zzcpx zzcpxVar) throws JSONException {
        zzcpx zzcpxVar2 = zzcpxVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcpxVar2.zzgji.zzvf());
        jSONObject2.put("signals", zzcpxVar2.zzgjh);
        jSONObject3.put("body", zzcpxVar2.zzgjg.zzdrq);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.zzp.zzkp().zzj(zzcpxVar2.zzgjg.zzam));
        jSONObject3.put("response_code", zzcpxVar2.zzgjg.zzgjq);
        jSONObject3.put("latency", zzcpxVar2.zzgjg.zzgjr);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcpxVar2.zzgji.zzvi());
        return jSONObject;
    }
}
