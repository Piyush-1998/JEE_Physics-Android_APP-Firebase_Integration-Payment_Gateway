package com.google.android.gms.ads.query;

import com.google.android.gms.internal.ads.zzbbd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class AdInfo {
    private final QueryInfo zzhii;
    private final String zzhij;

    public static String getRequestId(String str) {
        if (str == null) {
            zzbbd.zzfe("adString passed to AdInfo.getRequestId() cannot be null. Returning empty string.");
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            zzbbd.zzfe("Invalid adString passed to AdInfo.getRequestId(). Returning empty string.");
            return "";
        }
    }

    public AdInfo(QueryInfo queryInfo, String str) {
        this.zzhii = queryInfo;
        this.zzhij = str;
    }

    public QueryInfo getQueryInfo() {
        return this.zzhii;
    }

    public String getAdString() {
        return this.zzhij;
    }
}
