package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdlb implements zzbac {
    public final String zzdos;
    public final String zzdou;
    public final JSONObject zzfvr;
    private final JSONObject zzhbg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdlb(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = zzbab.zzc(jsonReader);
        this.zzhbg = zzc;
        this.zzdou = zzc.optString("ad_html", null);
        this.zzdos = this.zzhbg.optString("ad_base_url", null);
        this.zzfvr = this.zzhbg.optJSONObject("ad_json");
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final void zza(JsonWriter jsonWriter) throws IOException {
        zzbab.zza(jsonWriter, this.zzhbg);
    }
}
