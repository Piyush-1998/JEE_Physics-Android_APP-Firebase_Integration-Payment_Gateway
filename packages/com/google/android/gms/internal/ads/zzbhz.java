package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbhz {
    private static Boolean zzeqa;

    private zzbhz() {
    }

    private static boolean zzb(WebView webView) {
        boolean booleanValue;
        synchronized (zzbhz.class) {
            if (zzeqa == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zzeqa = true;
                } catch (IllegalStateException unused) {
                    zzeqa = false;
                }
            }
            booleanValue = zzeqa.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(WebView webView, String str) {
        if (PlatformVersion.isAtLeastKitKat() && zzb(webView)) {
            webView.evaluateJavascript(str, null);
            return;
        }
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
    }
}
