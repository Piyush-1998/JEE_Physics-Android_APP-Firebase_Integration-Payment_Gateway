package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczg {
    public final String zzgsb;
    public String zzgsc;
    public Bundle zzgsd = new Bundle();

    public zzczg(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        Map<String, String> hashMap = new HashMap<>();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c = 1;
                }
            } else if (nextName.equals("params")) {
                c = 0;
            }
            if (c == 0) {
                str = jsonReader.nextString();
            } else if (c == 1) {
                hashMap = zzbab.zzb(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        this.zzgsb = str;
        jsonReader.endObject();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzgsd.putString(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzczg zzo(Bundle bundle) {
        try {
            this.zzgsc = com.google.android.gms.ads.internal.zzp.zzkp().zzd(bundle).toString();
        } catch (JSONException unused) {
            this.zzgsc = "{}";
        }
        return this;
    }
}