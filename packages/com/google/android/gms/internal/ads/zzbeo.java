package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbeo implements zzahf<zzbde> {
    private boolean zzekn;

    private static int zza(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                zzwe.zzpq();
                return zzbat.zzc(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                zzaxy.zzfe(sb.toString());
                return i;
            }
        }
        return i;
    }

    private static void zza(zzbcr zzbcrVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzbcrVar.zzdl(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzaxy.zzfe(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzbcrVar.zzdm(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzbcrVar.zzdn(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzbcrVar.zzdo(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzbcrVar.zzdp(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbde zzbdeVar, Map map) {
        int i;
        String[] split;
        zzbde zzbdeVar2 = zzbdeVar;
        String str = (String) map.get("action");
        if (str == null) {
            zzaxy.zzfe("Action missing from video GMSG.");
            return;
        }
        if (zzaxy.isLoggable(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            zzaxy.zzef(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzaxy.zzfe("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                zzbdeVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzaxy.zzfe("Invalid color parameter in video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                zzaxy.zzfe("No MIME types specified for decoder properties inspection.");
                zzbcr.zza(zzbdeVar2, "missingMimeTypes");
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str4 : str3.split(",")) {
                hashMap.put(str4, zzbar.zzew(str4.trim()));
            }
            zzbcr.zza(zzbdeVar2, hashMap);
            return;
        }
        zzbcx zzzn = zzbdeVar2.zzzn();
        if (zzzn == null) {
            zzaxy.zzfe("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = zzbdeVar2.getContext();
            int zza = zza(context, map, "x", 0);
            int zza2 = zza(context, map, "y", 0);
            int zza3 = zza(context, map, "w", -1);
            int zza4 = zza(context, map, "h", -1);
            int min = Math.min(zza3, zzbdeVar2.zzzv() - zza);
            int min2 = Math.min(zza4, zzbdeVar2.zzzu() - zza2);
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused2) {
                i = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (equals && zzzn.zzzj() == null) {
                zzzn.zza(zza, zza2, min, min2, i, parseBoolean, new zzbdf((String) map.get("flags")));
                zzbcr zzzj = zzzn.zzzj();
                if (zzzj != null) {
                    zza(zzzj, (Map<String, String>) map);
                    return;
                }
                return;
            }
            zzzn.zze(zza, zza2, min, min2);
            return;
        }
        zzbgk zzzo = zzbdeVar2.zzzo();
        if (zzzo != null) {
            if ("timeupdate".equals(str)) {
                String str5 = (String) map.get("currentTime");
                if (str5 == null) {
                    zzaxy.zzfe("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzzo.zze(Float.parseFloat(str5));
                    return;
                } catch (NumberFormatException unused3) {
                    String valueOf = String.valueOf(str5);
                    zzaxy.zzfe(valueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(valueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                    return;
                }
            } else if ("skip".equals(str)) {
                zzzo.zzacs();
                return;
            }
        }
        zzbcr zzzj2 = zzzn.zzzj();
        if (zzzj2 == null) {
            zzbcr.zzb(zzbdeVar2);
        } else if ("click".equals(str)) {
            Context context2 = zzbdeVar2.getContext();
            int zza5 = zza(context2, map, "x", 0);
            int zza6 = zza(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zza5, zza6, 0);
            zzzj2.zze(obtain);
            obtain.recycle();
        } else if ("currentTime".equals(str)) {
            String str6 = (String) map.get("time");
            if (str6 == null) {
                zzaxy.zzfe("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzzj2.seekTo((int) (Float.parseFloat(str6) * 1000.0f));
            } catch (NumberFormatException unused4) {
                String valueOf2 = String.valueOf(str6);
                zzaxy.zzfe(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
            }
        } else if ("hide".equals(str)) {
            zzzj2.setVisibility(4);
        } else if ("load".equals(str)) {
            zzzj2.zzhw();
        } else if ("loadControl".equals(str)) {
            zza(zzzj2, (Map<String, String>) map);
        } else if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzzj2.zzzd();
            } else {
                zzzj2.zzze();
            }
        } else if ("pause".equals(str)) {
            zzzj2.pause();
        } else if ("play".equals(str)) {
            zzzj2.play();
        } else if ("show".equals(str)) {
            zzzj2.setVisibility(0);
        } else if ("src".equals(str)) {
            String str7 = (String) map.get("src");
            String[] strArr = {str7};
            String str8 = (String) map.get("demuxed");
            if (str8 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str8);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        strArr2[i2] = jSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } catch (JSONException unused5) {
                    String valueOf3 = String.valueOf(str8);
                    zzaxy.zzfe(valueOf3.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(valueOf3) : new String("Malformed demuxed URL list for playback: "));
                    strArr = new String[]{str7};
                }
            }
            zzzj2.zzc(str7, strArr);
        } else if ("touchMove".equals(str)) {
            Context context3 = zzbdeVar2.getContext();
            zzzj2.zza(zza(context3, map, "dx", 0), zza(context3, map, "dy", 0));
            if (this.zzekn) {
                return;
            }
            zzbdeVar2.zzuw();
            this.zzekn = true;
        } else if ("volume".equals(str)) {
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                zzaxy.zzfe("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzzj2.setVolume(Float.parseFloat(str9));
            } catch (NumberFormatException unused6) {
                String valueOf4 = String.valueOf(str9);
                zzaxy.zzfe(valueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
            }
        } else if ("watermark".equals(str)) {
            zzzj2.zzzf();
        } else {
            String valueOf5 = String.valueOf(str);
            zzaxy.zzfe(valueOf5.length() != 0 ? "Unknown video action: ".concat(valueOf5) : new String("Unknown video action: "));
        }
    }
}
