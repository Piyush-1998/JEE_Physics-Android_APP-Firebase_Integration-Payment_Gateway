package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzrm implements Runnable {
    final /* synthetic */ zzrk zzbta;
    private ValueCallback<String> zzbto = new zzrl(this);
    final /* synthetic */ zzre zzbtp;
    final /* synthetic */ WebView zzbtq;
    final /* synthetic */ boolean zzbtr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrm(zzrk zzrkVar, zzre zzreVar, WebView webView, boolean z) {
        this.zzbta = zzrkVar;
        this.zzbtp = zzreVar;
        this.zzbtq = webView;
        this.zzbtr = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbtq.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzbtq.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzbto);
            } catch (Throwable unused) {
                this.zzbto.onReceiveValue("");
            }
        }
    }
}
