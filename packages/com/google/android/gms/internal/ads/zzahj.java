package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import java.net.URISyntaxException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzahj<T extends zzbgt & zzbgs & zzbgw & zzbhb & zzbhd> implements zzahf<T> {
    private final com.google.android.gms.ads.internal.zza zzder;
    private final zzapw zzdes;

    public zzahj(com.google.android.gms.ads.internal.zza zzaVar, zzapw zzapwVar) {
        this.zzder = zzaVar;
        this.zzdes = zzapwVar;
    }

    private static boolean zzc(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int zzd(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                com.google.android.gms.ads.internal.zzp.zzkr();
                return 7;
            } else if ("l".equalsIgnoreCase(str)) {
                com.google.android.gms.ads.internal.zzp.zzkr();
                return 6;
            } else if ("c".equalsIgnoreCase(str)) {
                return com.google.android.gms.ads.internal.zzp.zzkr().zzxs();
            } else {
                return -1;
            }
        }
        return -1;
    }

    private final void zzab(boolean z) {
        zzapw zzapwVar = this.zzdes;
        if (zzapwVar != null) {
            zzapwVar.zzac(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zza(Context context, zzeg zzegVar, Uri uri, View view, Activity activity) {
        if (zzegVar == null) {
            return uri;
        }
        try {
            return zzegVar.zzc(uri) ? zzegVar.zza(uri, context, view, activity) : uri;
        } catch (zzef unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            zzaxy.zzc(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e);
        }
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzbgt zzbgtVar = (zzbgt) obj;
        String zzc = zzawq.zzc((String) map.get("u"), zzbgtVar.getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzaxy.zzfe("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zza zzaVar = this.zzder;
        if (zzaVar != null && !zzaVar.zzjx()) {
            this.zzder.zzbo(zzc);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzbgs) zzbgtVar).zzabj()) {
                zzaxy.zzfe("Cannot expand WebView that is already expanded.");
                return;
            }
            zzab(false);
            ((zzbgw) zzbgtVar).zzc(zzc(map), zzd(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            zzab(false);
            if (zzc != null) {
                ((zzbgw) zzbgtVar).zza(zzc(map), zzd(map), zzc);
            } else {
                ((zzbgw) zzbgtVar).zza(zzc(map), zzd(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzab(true);
            if (TextUtils.isEmpty(zzc)) {
                zzaxy.zzfe("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzbgw) zzbgtVar).zza(new com.google.android.gms.ads.internal.overlay.zzd(new zzahm(zzbgtVar.getContext(), ((zzbhb) zzbgtVar).zzabh(), ((zzbhd) zzbgtVar).getView()).zze(map)));
            } catch (ActivityNotFoundException e) {
                zzaxy.zzfe(e.getMessage());
            }
        } else if ("open_app".equalsIgnoreCase(str)) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxw)).booleanValue()) {
                zzab(true);
                String str2 = (String) map.get("p");
                if (str2 == null) {
                    zzaxy.zzfe("Package name missing from open app action.");
                    return;
                }
                PackageManager packageManager = zzbgtVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzaxy.zzfe("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str2);
                if (launchIntentForPackage != null) {
                    ((zzbgw) zzbgtVar).zza(new com.google.android.gms.ads.internal.overlay.zzd(launchIntentForPackage));
                }
            }
        } else {
            zzab(true);
            String str3 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str3)) {
                try {
                    intent = Intent.parseUri(str3, 0);
                } catch (URISyntaxException e2) {
                    String valueOf = String.valueOf(str3);
                    zzaxy.zzc(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e2);
                }
            }
            if (intent != null && intent.getData() != null) {
                Uri data = intent.getData();
                if (!Uri.EMPTY.equals(data)) {
                    intent.setData(zze(zza(zzbgtVar.getContext(), ((zzbhb) zzbgtVar).zzabh(), data, ((zzbhd) zzbgtVar).getView(), zzbgtVar.zzzq())));
                }
            }
            if (intent != null) {
                ((zzbgw) zzbgtVar).zza(new com.google.android.gms.ads.internal.overlay.zzd(intent));
                return;
            }
            if (!TextUtils.isEmpty(zzc)) {
                zzc = zze(zza(zzbgtVar.getContext(), ((zzbhb) zzbgtVar).zzabh(), Uri.parse(zzc), ((zzbhd) zzbgtVar).getView(), zzbgtVar.zzzq())).toString();
            }
            ((zzbgw) zzbgtVar).zza(new com.google.android.gms.ads.internal.overlay.zzd((String) map.get("i"), zzc, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
