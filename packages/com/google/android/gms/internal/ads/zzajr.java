package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzajr {
    public static void zza(zzajs zzajsVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzajsVar.zzj(str, jSONObject.toString());
    }

    public static void zza(zzajs zzajsVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzajsVar.zzdc(sb.toString());
    }

    public static void zzb(zzajs zzajsVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzaxy.zzef(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzajsVar.zzdc(sb.toString());
    }

    public static void zza(zzajs zzajsVar, String str, Map map) {
        try {
            zzajsVar.zzb(str, com.google.android.gms.ads.internal.zzp.zzkp().zzj(map));
        } catch (JSONException unused) {
            zzaxy.zzfe("Could not convert parameters to JSON.");
        }
    }
}
