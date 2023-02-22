package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzace;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzvc;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzq {
    private final String zzbqq;
    private final Map<String, String> zzbqr = new TreeMap();
    private String zzbqs;
    private String zzbqt;
    private final Context zzvr;

    public zzq(Context context, String str) {
        this.zzvr = context.getApplicationContext();
        this.zzbqq = str;
    }

    public final String zzlo() {
        return this.zzbqt;
    }

    public final String getQuery() {
        return this.zzbqs;
    }

    public final String zzlp() {
        return this.zzbqq;
    }

    public final Map<String, String> zzlq() {
        return this.zzbqr;
    }

    public final void zza(zzvc zzvcVar, zzbbg zzbbgVar) {
        this.zzbqs = zzvcVar.zzcha.zzbqs;
        Bundle bundle = zzvcVar.zzchc != null ? zzvcVar.zzchc.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle == null) {
            return;
        }
        String str = zzace.zzczl.get();
        for (String str2 : bundle.keySet()) {
            if (str.equals(str2)) {
                this.zzbqt = bundle.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.zzbqr.put(str2.substring(4), bundle.getString(str2));
            }
        }
        this.zzbqr.put("SDKVersion", zzbbgVar.zzbra);
        if (zzace.zzczj.get().booleanValue()) {
            try {
                Bundle zza = zzdee.zza(this.zzvr, new JSONArray(zzace.zzczk.get()));
                for (String str3 : zza.keySet()) {
                    this.zzbqr.put(str3, zza.get(str3).toString());
                }
            } catch (JSONException e) {
                zzaxy.zzc("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
            }
        }
    }
}
