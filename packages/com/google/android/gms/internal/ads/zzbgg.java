package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zztq;
import com.google.android.gms.internal.ads.zztw;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzbgg extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbfq {
    private int maxHeight;
    private int maxWidth;
    private String zzacx;
    private final zzbbg zzbpa;
    private final WindowManager zzbrf;
    private int zzdng;
    private int zzdnh;
    private boolean zzdot;
    private String zzdqg;
    private Boolean zzdya;
    private zzabi zzeif;
    private final zzto zzelx;
    private final zzbhg zzenm;
    private final zzeg zzenn;
    private final zzabt zzeno;
    private final com.google.android.gms.ads.internal.zzk zzenp;
    private final com.google.android.gms.ads.internal.zzb zzenq;
    private final float zzenr;
    private final zzsq zzens;
    private final boolean zzent;
    private boolean zzenu;
    private boolean zzenv;
    private zzbft zzenw;
    private com.google.android.gms.ads.internal.overlay.zzc zzenx;
    private IObjectWrapper zzeny;
    private zzbhj zzenz;
    private boolean zzeoa;
    private boolean zzeob;
    private boolean zzeoc;
    private int zzeod;
    private boolean zzeoe;
    private boolean zzeof;
    private zzbgk zzeog;
    private boolean zzeoh;
    private boolean zzeoi;
    private zzadk zzeoj;
    private zzadf zzeok;
    private zzsc zzeol;
    private int zzeom;
    private int zzeon;
    private zzabi zzeoo;
    private zzabi zzeop;
    private zzabh zzeoq;
    private WeakReference<View.OnClickListener> zzeor;
    private com.google.android.gms.ads.internal.overlay.zzc zzeos;
    private boolean zzeot;
    private zzbaq zzeou;
    private Map<String, zzbev> zzeov;
    private final DisplayMetrics zzxd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbgg zzb(Context context, zzbhj zzbhjVar, String str, boolean z, boolean z2, zzeg zzegVar, zzabt zzabtVar, zzbbg zzbbgVar, zzabk zzabkVar, com.google.android.gms.ads.internal.zzk zzkVar, com.google.android.gms.ads.internal.zzb zzbVar, zzto zztoVar, zzsq zzsqVar, boolean z3) {
        return new zzbgg(new zzbhg(context), zzbhjVar, str, z, z2, zzegVar, zzabtVar, zzbbgVar, zzabkVar, zzkVar, zzbVar, zztoVar, zzsqVar, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbhd
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzabt() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final zzbcx zzzn() {
        return null;
    }

    private zzbgg(zzbhg zzbhgVar, zzbhj zzbhjVar, String str, boolean z, boolean z2, zzeg zzegVar, zzabt zzabtVar, zzbbg zzbbgVar, zzabk zzabkVar, com.google.android.gms.ads.internal.zzk zzkVar, com.google.android.gms.ads.internal.zzb zzbVar, zzto zztoVar, zzsq zzsqVar, boolean z3) {
        super(zzbhgVar);
        this.zzenu = false;
        this.zzenv = false;
        this.zzeoe = true;
        this.zzeof = false;
        this.zzdqg = "";
        this.zzdnh = -1;
        this.zzdng = -1;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.zzenm = zzbhgVar;
        this.zzenz = zzbhjVar;
        this.zzacx = str;
        this.zzeob = z;
        this.zzeod = -1;
        this.zzenn = zzegVar;
        this.zzeno = zzabtVar;
        this.zzbpa = zzbbgVar;
        this.zzenp = zzkVar;
        this.zzenq = zzbVar;
        this.zzbrf = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzp.zzkp();
        DisplayMetrics zza = zzayh.zza(this.zzbrf);
        this.zzxd = zza;
        this.zzenr = zza.density;
        this.zzelx = zztoVar;
        this.zzens = zzsqVar;
        this.zzent = z3;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzaxy.zzc("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.zzp.zzkp().zza(zzbhgVar, zzbbgVar.zzbra, settings);
        com.google.android.gms.ads.internal.zzp.zzkr().zza(getContext(), settings);
        setDownloadListener(this);
        zzacn();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzbgp.zzc(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.zzeou = new zzbaq(this.zzenm.zzzq(), this, this, null);
        zzacr();
        zzabh zzabhVar = new zzabh(new zzabk(true, "make_wv", this.zzacx));
        this.zzeoq = zzabhVar;
        zzabhVar.zzrm().zzc(zzabkVar);
        zzabi zzb = zzabb.zzb(this.zzeoq.zzrm());
        this.zzeif = zzb;
        this.zzeoq.zza("native:view_create", zzb);
        this.zzeop = null;
        this.zzeoo = null;
        com.google.android.gms.ads.internal.zzp.zzkr().zzbf(zzbhgVar);
        com.google.android.gms.ads.internal.zzp.zzkt().zzwg();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbft) {
            this.zzenw = (zzbft) webViewClient;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final com.google.android.gms.ads.internal.zzb zzzr() {
        return this.zzenq;
    }

    private final boolean zzack() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzenw.zzabx() || this.zzenw.zzaby()) {
            zzwe.zzpq();
            DisplayMetrics displayMetrics = this.zzxd;
            int zzb = zzbat.zzb(displayMetrics, displayMetrics.widthPixels);
            zzwe.zzpq();
            DisplayMetrics displayMetrics2 = this.zzxd;
            int zzb2 = zzbat.zzb(displayMetrics2, displayMetrics2.heightPixels);
            Activity zzzq = this.zzenm.zzzq();
            if (zzzq == null || zzzq.getWindow() == null) {
                i = zzb;
                i2 = zzb2;
            } else {
                com.google.android.gms.ads.internal.zzp.zzkp();
                int[] zzd = zzayh.zzd(zzzq);
                zzwe.zzpq();
                int zzb3 = zzbat.zzb(this.zzxd, zzd[0]);
                zzwe.zzpq();
                i2 = zzbat.zzb(this.zzxd, zzd[1]);
                i = zzb3;
            }
            if (this.zzdng == zzb && this.zzdnh == zzb2 && this.maxWidth == i && this.maxHeight == i2) {
                return false;
            }
            z = (this.zzdng == zzb && this.zzdnh == zzb2) ? true : true;
            this.zzdng = zzb;
            this.zzdnh = zzb2;
            this.maxWidth = i;
            this.maxHeight = i2;
            new zzaqg(this).zza(zzb, zzb2, i, i2, this.zzxd.density, this.zzbrf.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final void zza(String str, Map<String, ?> map) {
        try {
            zzb(str, com.google.android.gms.ads.internal.zzp.zzkp().zzj(map));
        } catch (JSONException unused) {
            zzaxy.zzfe("Could not convert parameters to JSON.");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            zzaxy.zzfg("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    private final synchronized void zzfr(String str) {
        if (!isDestroyed()) {
            loadUrl(str);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public final synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AdWebViewImpl.loadUrl");
                zzaxy.zzd("Could not call loadUrl. ", e);
                return;
            }
        }
        zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
    }

    private final synchronized void zzfs(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzaxy.zzd("Could not call loadUrl. ", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzb(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, zzbgz.zzf(str2, zzbgz.zzact()), "text/html", "UTF-8", str3);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void zza(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            evaluateJavascript(str, null);
        } else {
            zzaxy.zzfe("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final void zzft(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzwe() == null) {
                zzacl();
            }
            if (zzwe().booleanValue()) {
                zza(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            zzfr(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        zzfr(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zzdc(String str) {
        zzft(str);
    }

    private final synchronized void zzacl() {
        Boolean zzwe = com.google.android.gms.ads.internal.zzp.zzkt().zzwe();
        this.zzdya = zzwe;
        if (zzwe == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zza((Boolean) true);
            } catch (IllegalStateException unused) {
                zza((Boolean) false);
            }
        }
    }

    private final void zza(Boolean bool) {
        synchronized (this) {
            this.zzdya = bool;
        }
        com.google.android.gms.ads.internal.zzp.zzkt().zza(bool);
    }

    private final synchronized Boolean zzwe() {
        return this.zzdya;
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        zzft(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzaxy.zzef(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzft(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzaax() {
        zzacm();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbpa.zzbra);
        zza("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzdu(int i) {
        if (i == 0) {
            zzabb.zza(this.zzeoq.zzrm(), this.zzeif, "aebb2");
        }
        zzacm();
        if (this.zzeoq.zzrm() != null) {
            this.zzeoq.zzrm().zzh("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzbpa.zzbra);
        zza("onhide", hashMap);
    }

    private final void zzacm() {
        zzabb.zza(this.zzeoq.zzrm(), this.zzeif, "aeh2");
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzuv() {
        if (this.zzeoo == null) {
            zzabb.zza(this.zzeoq.zzrm(), this.zzeif, "aes2");
            zzabi zzb = zzabb.zzb(this.zzeoq.zzrm());
            this.zzeoo = zzb;
            this.zzeoq.zza("native:view_show", zzb);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbpa.zzbra);
        zza("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzaay() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzp.zzku().zzqe()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzp.zzku().zzqd()));
        hashMap.put("device_volume", String.valueOf(zzayz.zzbh(getContext())));
        zza("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zza("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized com.google.android.gms.ads.internal.overlay.zzc zzaba() {
        return this.zzenx;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized IObjectWrapper zzabi() {
        return this.zzeny;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized com.google.android.gms.ads.internal.overlay.zzc zzabb() {
        return this.zzeos;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbgy
    public final synchronized zzbhj zzabc() {
        return this.zzenz;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized String zzabd() {
        return this.zzacx;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final WebViewClient zzabf() {
        return this.zzenw;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized boolean zzabg() {
        return this.zzdot;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbhb
    public final zzeg zzabh() {
        return this.zzenn;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde, com.google.android.gms.internal.ads.zzbha
    public final zzbbg zzzt() {
        return this.zzbpa;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbgs
    public final synchronized boolean zzabj() {
        return this.zzeob;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzp.zzkp();
            zzayh.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzaxy.zzef(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzenw.zzaby() && !this.zzenw.zzabz()) {
            synchronized (this) {
                if (this.zzeoj != null) {
                    this.zzeoj.zzc(motionEvent);
                }
            }
        } else {
            zzeg zzegVar = this.zzenn;
            if (zzegVar != null) {
                zzegVar.zza(motionEvent);
            }
            zzabt zzabtVar = this.zzeno;
            if (zzabtVar != null) {
                zzabtVar.zza(motionEvent);
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6 A[Catch: all -> 0x01fe, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ce, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0151, B:96:0x016b, B:98:0x01c0, B:99:0x01c4, B:101:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:113:0x01f9), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141 A[Catch: all -> 0x01fe, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ce, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0151, B:96:0x016b, B:98:0x01c0, B:99:0x01c4, B:101:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:113:0x01f9), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016b A[Catch: all -> 0x01fe, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ce, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0151, B:96:0x016b, B:98:0x01c0, B:99:0x01c4, B:101:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:113:0x01f9), top: B:119:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgg.onMeasure(int, int):void");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzack = zzack();
        com.google.android.gms.ads.internal.overlay.zzc zzaba = zzaba();
        if (zzaba == null || !zzack) {
            return;
        }
        zzaba.zzuu();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzenx = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzap(IObjectWrapper iObjectWrapper) {
        this.zzeny = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzeos = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zza(zzbhj zzbhjVar) {
        this.zzenz = zzbhjVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzax(boolean z) {
        boolean z2 = z != this.zzeob;
        this.zzeob = z;
        zzacn();
        if (z2) {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcmr)).booleanValue() || !this.zzenz.zzacx()) {
                new zzaqg(this).zzdz(z ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabn() {
        this.zzeou.zzyi();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzeou.onAttachedToWindow();
        }
        boolean z = this.zzeoh;
        if (this.zzenw != null && this.zzenw.zzaby()) {
            if (!this.zzeoi) {
                this.zzenw.zzaca();
                this.zzenw.zzacb();
                this.zzeoi = true;
            }
            zzack();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzeou.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzeoi && this.zzenw != null && this.zzenw.zzaby() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzenw.zzaca();
                this.zzenw.zzacb();
                this.zzeoi = false;
            }
        }
        zzbd(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzbv(Context context) {
        this.zzenm.setBaseContext(context);
        this.zzeou.zzh(this.zzenm.zzzq());
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzal(boolean z) {
        if (this.zzenx != null) {
            this.zzenx.zza(this.zzenw.zzabx(), z);
        } else {
            this.zzdot = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void setRequestedOrientation(int i) {
        this.zzeod = i;
        if (this.zzenx != null) {
            this.zzenx.setRequestedOrientation(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde, com.google.android.gms.internal.ads.zzbgt
    public final Activity zzzq() {
        return this.zzenm.zzzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final Context zzaaz() {
        return this.zzenm.zzaaz();
    }

    private final synchronized void zzacn() {
        if (!this.zzeob && !this.zzenz.zzacx()) {
            if (Build.VERSION.SDK_INT < 18) {
                zzaxy.zzef("Disabling hardware acceleration on an AdView.");
                zzaco();
                return;
            }
            zzaxy.zzef("Enabling hardware acceleration on an AdView.");
            zzacp();
            return;
        }
        zzaxy.zzef("Enabling hardware acceleration on an overlay.");
        zzacp();
    }

    private final synchronized void zzaco() {
        if (!this.zzeoc) {
            com.google.android.gms.ads.internal.zzp.zzkr();
            setLayerType(1, null);
        }
        this.zzeoc = true;
    }

    private final synchronized void zzacp() {
        if (this.zzeoc) {
            com.google.android.gms.ads.internal.zzp.zzkr();
            setLayerType(0, null);
        }
        this.zzeoc = false;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public final synchronized void destroy() {
        zzacr();
        this.zzeou.zzyj();
        if (this.zzenx != null) {
            this.zzenx.close();
            this.zzenx.onDestroy();
            this.zzenx = null;
        }
        this.zzeny = null;
        this.zzenw.reset();
        if (this.zzeoa) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzll();
        zzbes.zzc(this);
        zzacq();
        this.zzeoa = true;
        zzaxy.zzei("Initiating WebView self destruct sequence in 3...");
        zzaxy.zzei("Loading blank page in WebView, 2...");
        zzfs("about:blank");
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzeoa) {
                    this.zzenw.reset();
                    com.google.android.gms.ads.internal.zzp.zzll();
                    zzbes.zzc(this);
                    zzacq();
                    zzwh();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzabk() {
        zzaxy.zzei("Destroying WebView!");
        zzwh();
        zzayh.zzeaj.post(new zzbgl(this));
    }

    private final synchronized void zzwh() {
        if (!this.zzeot) {
            this.zzeot = true;
            com.google.android.gms.ads.internal.zzp.zzkt().zzwh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized boolean isDestroyed() {
        return this.zzeoa;
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        zzbft zzbftVar = this.zzenw;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabo() {
        if (this.zzeop == null) {
            zzabi zzb = zzabb.zzb(this.zzeoq.zzrm());
            this.zzeop = zzb;
            this.zzeoq.zza("native:view_load", zzb);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public final void onPause() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzaxy.zzc("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbfq
    public final void onResume() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzaxy.zzc("Could not resume webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabr() {
        zzaxy.zzei("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzba(boolean z) {
        this.zzenw.zzba(z);
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzaxy.zzc("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzay(boolean z) {
        this.zzeoe = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized boolean zzabl() {
        return this.zzeoe;
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final synchronized void zzkl() {
        this.zzeof = true;
        if (this.zzenp != null) {
            this.zzenp.zzkl();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final synchronized void zzkm() {
        this.zzeof = false;
        if (this.zzenp != null) {
            this.zzenp.zzkm();
        }
    }

    private final synchronized void zzacq() {
        if (this.zzeov != null) {
            for (zzbev zzbevVar : this.zzeov.values()) {
                zzbevVar.release();
            }
        }
        this.zzeov = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final synchronized void zza(String str, zzbev zzbevVar) {
        if (this.zzeov == null) {
            this.zzeov = new HashMap();
        }
        this.zzeov.put(str, zzbevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final synchronized zzbev zzfj(String str) {
        if (this.zzeov == null) {
            return null;
        }
        return this.zzeov.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final synchronized String getRequestId() {
        return this.zzdqg;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final synchronized void zzzw() {
        if (this.zzeok != null) {
            this.zzeok.zzsc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zza(zzadf zzadfVar) {
        this.zzeok = zzadfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zza(zzsc zzscVar) {
        this.zzeol = zzscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized zzsc zzabs() {
        return this.zzeol;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final zzabi zzzp() {
        return this.zzeif;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final zzabh zzzs() {
        return this.zzeoq;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbfq
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzeor = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zza(zzadk zzadkVar) {
        this.zzeoj = zzadkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized zzadk zzabp() {
        return this.zzeoj;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final synchronized zzbgk zzzo() {
        return this.zzeog;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final synchronized void zza(zzbgk zzbgkVar) {
        if (this.zzeog != null) {
            zzaxy.zzfc("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzeog = zzbgkVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized boolean zzabm() {
        return this.zzeom > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final synchronized void zzaz(boolean z) {
        int i = this.zzeom + (z ? 1 : -1);
        this.zzeom = i;
        if (i <= 0 && this.zzenx != null) {
            this.zzenx.zzux();
        }
    }

    private final void zzacr() {
        zzabk zzrm;
        zzabh zzabhVar = this.zzeoq;
        if (zzabhVar == null || (zzrm = zzabhVar.zzrm()) == null || com.google.android.gms.ads.internal.zzp.zzkt().zzwd() == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzkt().zzwd().zza(zzrm);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabq() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzav(boolean z) {
        this.zzenw.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzuw() {
        com.google.android.gms.ads.internal.overlay.zzc zzaba = zzaba();
        if (zzaba != null) {
            zzaba.zzuw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final int zzzu() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final int zzzv() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzenw.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzc(boolean z, int i) {
        this.zzenw.zzc(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zza(boolean z, int i, String str) {
        this.zzenw.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzenw.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzqu
    public final void zza(zzqr zzqrVar) {
        synchronized (this) {
            this.zzeoh = zzqrVar.zzbrk;
        }
        zzbd(zzqrVar.zzbrk);
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(String str, zzahf<? super zzbfq> zzahfVar) {
        zzbft zzbftVar = this.zzenw;
        if (zzbftVar != null) {
            zzbftVar.zza(str, zzahfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzb(String str, zzahf<? super zzbfq> zzahfVar) {
        zzbft zzbftVar = this.zzenw;
        if (zzbftVar != null) {
            zzbftVar.zzb(str, zzahfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        zzbft zzbftVar = this.zzenw;
        if (zzbftVar != null) {
            zzbftVar.zza(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzb(final boolean z, final int i) {
        destroy();
        this.zzelx.zza(new zztn(z, i) { // from class: com.google.android.gms.internal.ads.zzbgj
            private final int zzeax;
            private final boolean zzeoy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeoy = z;
                this.zzeax = i;
            }

            @Override // com.google.android.gms.internal.ads.zztn
            public final void zza(zztw.zzi.zza zzaVar) {
                zzbgg.zza(this.zzeoy, this.zzeax, zzaVar);
            }
        });
        this.zzelx.zza(zztq.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!zzabv()) {
            zzaxy.zzei("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        zzaxy.zzei("Initializing ArWebView object.");
        this.zzens.zza(activity, this);
        this.zzens.zzc(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.zzens.getView());
        } else {
            zzaxy.zzfc("The FrameLayout object cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzsq zzabu() {
        return this.zzens;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzabv() {
        return ((Boolean) zzwe.zzpu().zzd(zzaat.zzcwc)).booleanValue() && this.zzens != null && this.zzent;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final /* synthetic */ zzbhc zzabe() {
        return this.zzenw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(boolean z, int i, zztw.zzi.zza zzaVar) {
        zztw.zzae.zza zzpd = zztw.zzae.zzpd();
        if (zzpd.zzpc() != z) {
            zzpd.zzx(z);
        }
        zzaVar.zza((zztw.zzae) ((zzegp) zzpd.zzcy(i).zzbfx()));
    }
}
