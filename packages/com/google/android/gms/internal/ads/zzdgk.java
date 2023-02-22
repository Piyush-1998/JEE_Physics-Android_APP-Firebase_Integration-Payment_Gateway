package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgk implements zzdek<JSONObject> {
    private Bundle zzgwp;

    public zzdgk(Bundle bundle) {
        this.zzgwp = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.zzgwp != null) {
            try {
                zzbab.zzb(zzbab.zzb(jSONObject2, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.zzp.zzkp().zzd(this.zzgwp));
            } catch (JSONException unused) {
                zzaxy.zzei("Failed putting parental controls bundle.");
            }
        }
    }
}
