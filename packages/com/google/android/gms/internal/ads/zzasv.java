package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzasv {
    private final int errorCode;
    private final String type;
    private String url;
    private final String zzdqg;
    private final String zzdst;
    private final boolean zzdsu;
    private final String zzdth;
    private final List<String> zzduj;
    private final String zzduk;
    private final String zzdul;
    private final boolean zzdum;
    private final String zzdun;
    private final boolean zzduo;
    private final JSONObject zzdup;

    public zzasv(JSONObject jSONObject) {
        this.url = jSONObject.optString(ImagesContract.URL);
        this.zzduk = jSONObject.optString("base_uri");
        this.zzdul = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        this.zzdum = optString != null && (optString.equals("1") || optString.equals("true"));
        this.zzdqg = jSONObject.optString("request_id");
        this.type = jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        this.zzduj = optString2 == null ? null : Arrays.asList(optString2.split(","));
        this.errorCode = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.zzdun = jSONObject.optString("fetched_ad");
        this.zzduo = jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.zzdup = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.zzdst = jSONObject.optString("analytics_query_ad_event_id");
        this.zzdsu = jSONObject.optBoolean("is_analytics_logging_enabled");
        this.zzdth = jSONObject.optString("pool_key");
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final List<String> zzve() {
        return this.zzduj;
    }

    public final String zzvf() {
        return this.zzduk;
    }

    public final String zzvg() {
        return this.zzdul;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean zzvh() {
        return this.zzdum;
    }

    public final JSONObject zzvi() {
        return this.zzdup;
    }

    public final String zzvj() {
        return this.zzdth;
    }
}
