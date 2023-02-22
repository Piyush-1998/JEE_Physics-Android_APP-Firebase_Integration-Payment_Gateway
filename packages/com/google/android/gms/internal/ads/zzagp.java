package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagp {
    public static final zzahf<zzbfq> zzddx = zzags.zzdeq;
    public static final zzahf<zzbfq> zzddy = zzagr.zzdeq;
    public static final zzahf<zzbfq> zzddz = zzagu.zzdeq;
    public static final zzahf<zzbfq> zzdea = zzagt.zzdeq;
    public static final zzahf<zzbfq> zzdeb = new zzagy();
    public static final zzahf<zzbfq> zzdec = new zzagx();
    public static final zzahf<zzbfq> zzded = zzagw.zzdeq;
    public static final zzahf<Object> zzdee = new zzaha();
    public static final zzahf<zzbfq> zzdef = new zzagz();
    public static final zzahf<zzbfq> zzdeg = zzagv.zzdeq;
    public static final zzahf<zzbfq> zzdeh = new zzahc();
    public static final zzahf<zzbfq> zzdei = new zzahb();
    public static final zzahf<zzbde> zzdej = new zzbeo();
    public static final zzahf<zzbde> zzdek = new zzber();
    public static final zzahf<zzbfq> zzdel = new zzagq();
    public static final zzahl zzdem = new zzahl();
    public static final zzahf<zzbfq> zzden = new zzahe();
    public static final zzahf<zzbfq> zzdeo = new zzahd();
    public static final zzahf<zzbfq> zzdep = new zzahg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzbhb zzbhbVar, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzeg zzabh = zzbhbVar.zzabh();
            if (zzabh != null) {
                zzabh.zzca().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzaxy.zzfe("Could not parse touch parameters from gmsg.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzbgt zzbgtVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzaxy.zzfe("URL missing from httpTrack GMSG.");
        } else {
            new zzbag(zzbgtVar.getContext(), ((zzbha) zzbgtVar).zzzt().zzbra, str).zzwv();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzajk zzajkVar, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzaxy.zzfe("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzeg zzabh = ((zzbhb) zzajkVar).zzabh();
            if (zzabh != null && zzabh.zzb(parse)) {
                parse = zzabh.zza(parse, ((zzbgt) zzajkVar).getContext(), ((zzbhd) zzajkVar).getView(), ((zzbgt) zzajkVar).zzzq());
            }
        } catch (zzef unused) {
            String valueOf = String.valueOf(str);
            zzaxy.zzfe(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        zzbgt zzbgtVar = (zzbgt) zzajkVar;
        new zzbag(zzbgtVar.getContext(), ((zzbha) zzajkVar).zzzt().zzbra, zzawq.zzb(parse, zzbgtVar.getContext())).zzwv();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzb(zzbgt zzbgtVar, Map map) {
        PackageManager packageManager = zzbgtVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                String valueOf = String.valueOf(optString7);
                                zzaxy.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e);
                            }
                        }
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        try {
                            jSONObject.put(optString, packageManager.resolveActivity(intent, 65536) != null);
                        } catch (JSONException e2) {
                            zzaxy.zzc("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        zzaxy.zzc("Error parsing the intent data.", e3);
                    }
                }
                ((zzajk) zzbgtVar).zzb("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzajk) zzbgtVar).zzb("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzajk) zzbgtVar).zzb("openableIntents", new JSONObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzc(zzbgt zzbgtVar, Map map) {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxw)).booleanValue()) {
            zzaxy.zzfe("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzaxy.zzfe("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, Boolean.valueOf(zzbgtVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null));
        ((zzajk) zzbgtVar).zza("openableApp", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzd(zzbgt zzbgtVar, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzaxy.zzfe("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbgtVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzajk) zzbgtVar).zza("openableURLs", hashMap);
    }
}
