package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcft {
    private final Executor executor;
    private final zzcfj zzgaz;

    public zzcft(Executor executor, zzcfj zzcfjVar) {
        this.executor = executor;
        this.zzgaz = zzcfjVar;
    }

    public final zzdvt<List<zzcfy>> zzg(JSONObject jSONObject, String str) {
        zzdvt zzaf;
        final String optString;
        char c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzdvl.zzaf(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    c = 1;
                } else {
                    c = "image".equals(optString2) ? (char) 2 : (char) 0;
                }
                if (c == 1) {
                    zzaf = zzdvl.zzaf(new zzcfy(optString, optJSONObject.optString("string_value")));
                } else if (c == 2) {
                    zzaf = zzdvl.zzb(this.zzgaz.zzc(optJSONObject, "image_value"), new zzdsl(optString) { // from class: com.google.android.gms.internal.ads.zzcfv
                        private final String zzdgb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdgb = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdsl
                        public final Object apply(Object obj) {
                            return new zzcfy(this.zzdgb, (zzadi) obj);
                        }
                    }, this.executor);
                }
                arrayList.add(zzaf);
            }
            zzaf = zzdvl.zzaf(null);
            arrayList.add(zzaf);
        }
        return zzdvl.zzb(zzdvl.zzi(arrayList), zzcfw.zzdwg, this.executor);
    }
}
