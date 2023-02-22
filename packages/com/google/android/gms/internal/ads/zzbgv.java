package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbgv extends zzbgu {
    public zzbgv(zzbfq zzbfqVar, zzto zztoVar, boolean z) {
        super(zzbfqVar, zztoVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbft, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, (Map<String, String>) null);
    }
}
