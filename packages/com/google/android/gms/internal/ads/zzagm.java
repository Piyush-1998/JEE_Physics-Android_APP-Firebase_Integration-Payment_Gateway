package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagm implements zzahf<Object> {
    private final zzagl zzddv;

    public zzagm(zzagl zzaglVar) {
        this.zzddv = zzaglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzddv == null) {
            return;
        }
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzaxy.zzfd("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = zzbab.zzh(new JSONObject(map.get("info")));
            } catch (JSONException e) {
                zzaxy.zzc("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            zzaxy.zzfc("Failed to convert ad metadata to Bundle.");
        } else {
            this.zzddv.zza(str, bundle);
        }
    }
}
