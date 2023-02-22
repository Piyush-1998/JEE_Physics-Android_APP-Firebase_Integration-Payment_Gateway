package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.query.QueryInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzb {
    private final String zzbqs;
    private final Bundle zzckg;

    public zzzb(String str, Bundle bundle) {
        this.zzbqs = str;
        this.zzckg = bundle;
    }

    public final String getQuery() {
        return this.zzbqs;
    }

    public static String zza(QueryInfo queryInfo) {
        String str = zzwe.zzpy().get(queryInfo);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final Bundle getQueryBundle() {
        return this.zzckg;
    }
}
