package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbhx extends zzbhs implements zzbhy {
    private boolean zzeoa;
    private boolean zzeot;
    private final zzbhv zzepz;

    public zzbhx(Context context, zzbhv zzbhvVar) {
        super(context);
        com.google.android.gms.ads.internal.zzp.zzkt().zzwg();
        this.zzepz = zzbhvVar;
        super.setWebViewClient(zzbhvVar);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    protected void zzbe(boolean z) {
    }

    public final synchronized boolean isDestroyed() {
        return this.zzeoa;
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.zzeoa) {
            return;
        }
        this.zzeoa = true;
        this.zzepz.zza(this);
        zzbe(false);
        zzaxy.zzei("Initiating WebView self destruct sequence in 3...");
        zzaxy.zzei("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhy
    public final synchronized void zza(zzbhu zzbhuVar) {
        zzaxy.zzei("Blank page loaded, 1...");
        zzabk();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void zzabk() {
        zzaxy.zzei("Destroying WebView!");
        zzwh();
        zzbbi.zzedy.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbhw
            private final zzbhx zzepy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepy = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzepy.zzadb();
            }
        });
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    zzbe(true);
                }
                zzwh();
            }
        } finally {
            super.finalize();
        }
    }

    private final synchronized void zzwh() {
        if (!this.zzeot) {
            this.zzeot = true;
            com.google.android.gms.ads.internal.zzp.zzkt().zzwh();
        }
    }

    @Override // android.webkit.WebView
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzbhs, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public void onPause() {
        if (isDestroyed()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public void onResume() {
        if (isDestroyed()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        super.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzbhs, android.webkit.WebView
    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbhs, com.google.android.gms.internal.ads.zzajs, com.google.android.gms.internal.ads.zzakh
    public /* bridge */ /* synthetic */ void zzdc(String str) {
        super.zzdc(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzadb() {
        super.destroy();
    }
}
