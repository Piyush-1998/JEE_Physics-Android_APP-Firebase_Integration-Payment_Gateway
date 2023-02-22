package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzdvl;
import com.google.android.gms.internal.ads.zzdvt;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzd implements zzduv {
    static final zzduv zzbok = new zzd();

    private zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final zzdvt zzf(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzp.zzkt().zzwj().zzel(jSONObject.getString("appSettingsJson"));
        }
        return zzdvl.zzaf(null);
    }
}
