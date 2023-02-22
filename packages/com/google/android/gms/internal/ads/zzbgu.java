package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzbgu extends zzbft {
    public zzbgu(zzbfq zzbfqVar, zzto zztoVar, boolean z) {
        super(zzbfqVar, zztoVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zza(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbfq)) {
            zzaxy.zzfe("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbfq zzbfqVar = (zzbfq) webView;
        if (this.zzemh != null) {
            this.zzemh.zza(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzd(str, map);
        }
        if (zzbfqVar.zzabe() != null) {
            zzbfqVar.zzabe().zzur();
        }
        if (zzbfqVar.zzabc().zzacx()) {
            str2 = (String) zzwe.zzpu().zzd(zzaat.zzcmp);
        } else if (zzbfqVar.zzabj()) {
            str2 = (String) zzwe.zzpu().zzd(zzaat.zzcmo);
        } else {
            str2 = (String) zzwe.zzpu().zzd(zzaat.zzcmn);
        }
        com.google.android.gms.ads.internal.zzp.zzkp();
        return zzayh.zzd(zzbfqVar.getContext(), zzbfqVar.zzzt().zzbra, str2);
    }
}
