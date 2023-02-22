package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbfa implements zzahf<zzbde> {
    private static Integer zzb(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = map.get(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
                sb.append("Precache invalid numeric parameter '");
                sb.append(str);
                sb.append("': ");
                sb.append(str2);
                zzaxy.zzfe(sb.toString());
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbde zzbdeVar, Map map) {
        zzbev zzbevVar;
        zzbde zzbdeVar2 = zzbdeVar;
        if (zzaxy.isLoggable(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            zzaxy.zzef(sb.toString());
        }
        com.google.android.gms.ads.internal.zzp.zzll();
        if (map.containsKey("abort")) {
            if (zzbes.zzc(zzbdeVar2)) {
                return;
            }
            zzaxy.zzfe("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    String valueOf2 = String.valueOf(str2);
                    zzaxy.zzfe(valueOf2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(valueOf2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (zzbes.zzd(zzbdeVar2) != null) {
                zzaxy.zzfe("Precache task is already running.");
                return;
            } else if (zzbdeVar2.zzzr() == null) {
                zzaxy.zzfe("Precache requires a dependency provider.");
                return;
            } else {
                zzbdf zzbdfVar = new zzbdf((String) map.get("flags"));
                Integer zzb = zzb(map, "player");
                if (zzb == null) {
                    zzb = 0;
                }
                zzbevVar = zzbdeVar2.zzzr().zzboe.zza(zzbdeVar2, zzb.intValue(), null, zzbdfVar);
                new zzbeq(zzbdeVar2, zzbevVar, str, strArr).zzwv();
            }
        } else {
            zzbeq zzd = zzbes.zzd(zzbdeVar2);
            if (zzd != null) {
                zzbevVar = zzd.zzekp;
            } else {
                zzaxy.zzfe("Precache must specify a source.");
                return;
            }
        }
        Integer zzb2 = zzb(map, "minBufferMs");
        if (zzb2 != null) {
            zzbevVar.zzdl(zzb2.intValue());
        }
        Integer zzb3 = zzb(map, "maxBufferMs");
        if (zzb3 != null) {
            zzbevVar.zzdm(zzb3.intValue());
        }
        Integer zzb4 = zzb(map, "bufferForPlaybackMs");
        if (zzb4 != null) {
            zzbevVar.zzdn(zzb4.intValue());
        }
        Integer zzb5 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb5 != null) {
            zzbevVar.zzdo(zzb5.intValue());
        }
    }
}
