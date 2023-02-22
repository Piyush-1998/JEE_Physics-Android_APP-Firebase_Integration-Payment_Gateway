package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.File;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbhi extends zzbhv implements zzbhc {
    private volatile boolean zzbrb;
    private zzut zzcgq;
    private zzagl zzddv;
    private zzagn zzddw;
    private com.google.android.gms.ads.internal.zza zzder;
    private zzapw zzdes;
    private com.google.android.gms.ads.internal.overlay.zzo zzdor;
    private com.google.android.gms.ads.internal.overlay.zzt zzdov;
    private boolean zzdsu;
    protected zzbfq zzelw;
    private zzbhf zzelz;
    private zzbhe zzema;
    private zzbhh zzemb;
    private boolean zzemd;
    private boolean zzeme;
    private boolean zzemf;
    private zzaqd zzemg;
    private zzavu zzemh;
    private boolean zzemi;
    private boolean zzemj;
    private int zzemk;
    private View.OnAttachStateChangeListener zzeml;
    private final Object lock = new Object();
    private boolean zzemc = false;
    private final zzajw<zzbfq> zzepp = new zzajw<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbfq zzbfqVar, boolean z) {
        zzaqd zzaqdVar = new zzaqd(zzbfqVar, zzbfqVar.zzaaz(), new zzaae(zzbfqVar.getContext()));
        this.zzelw = zzbfqVar;
        this.zzbrb = z;
        this.zzemg = zzaqdVar;
        this.zzdes = null;
        this.zzepp.zzg((zzajw<zzbfq>) zzbfqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zza(int i, int i2, boolean z) {
        this.zzemg.zzj(i, i2);
        zzapw zzapwVar = this.zzdes;
        if (zzapwVar != null) {
            zzapwVar.zza(i, i2, false);
        }
    }

    public final void zza(String str, zzahf<? super zzbfq> zzahfVar) {
        this.zzepp.zza(str, zzahfVar);
    }

    public final void zzb(String str, zzahf<? super zzbfq> zzahfVar) {
        this.zzepp.zzb(str, zzahfVar);
    }

    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        this.zzepp.zza(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zza(zzut zzutVar, zzagl zzaglVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagn zzagnVar, com.google.android.gms.ads.internal.overlay.zzt zztVar, boolean z, zzahi zzahiVar, com.google.android.gms.ads.internal.zza zzaVar, zzaqf zzaqfVar, zzavu zzavuVar) {
        if (zzaVar == null) {
            zzaVar = new com.google.android.gms.ads.internal.zza(this.zzelw.getContext(), zzavuVar, null);
        }
        this.zzdes = new zzapw(this.zzelw, zzaqfVar);
        this.zzemh = zzavuVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcoc)).booleanValue()) {
            zza("/adMetadata", new zzagm(zzaglVar));
        }
        zza("/appEvent", new zzago(zzagnVar));
        zza("/backButton", zzagp.zzdeh);
        zza("/refresh", zzagp.zzdei);
        zza("/canOpenApp", zzagp.zzddy);
        zza("/canOpenURLs", zzagp.zzddx);
        zza("/canOpenIntents", zzagp.zzddz);
        zza("/click", zzagp.zzdea);
        zza("/close", zzagp.zzdeb);
        zza("/customClose", zzagp.zzdec);
        zza("/instrument", zzagp.zzdel);
        zza("/delayPageLoaded", zzagp.zzden);
        zza("/delayPageClosed", zzagp.zzdeo);
        zza("/getLocationInfo", zzagp.zzdep);
        zza("/httpTrack", zzagp.zzded);
        zza("/log", zzagp.zzdee);
        zza("/mraid", new zzahk(zzaVar, this.zzdes, zzaqfVar));
        zza("/mraidLoaded", this.zzemg);
        zza("/open", new zzahj(zzaVar, this.zzdes));
        zza("/precache", new zzbfa());
        zza("/touch", zzagp.zzdeg);
        zza("/video", zzagp.zzdej);
        zza("/videoMeta", zzagp.zzdek);
        if (com.google.android.gms.ads.internal.zzp.zzln().zzac(this.zzelw.getContext())) {
            zza("/logScionEvent", new zzahh(this.zzelw.getContext()));
        }
        this.zzcgq = zzutVar;
        this.zzdor = zzoVar;
        this.zzddv = zzaglVar;
        this.zzddw = zzagnVar;
        this.zzdov = zztVar;
        this.zzder = zzaVar;
        this.zzemc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final com.google.android.gms.ads.internal.zza zzabw() {
        return this.zzder;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final boolean zzabx() {
        return this.zzbrb;
    }

    public final boolean zzaby() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzemd;
        }
        return z;
    }

    public final boolean zzabz() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeme;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzaca() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzacb() {
        synchronized (this.lock) {
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzsq zzabu = this.zzelw.zzabu();
        if (zzabu != null && webView == zzabu.getWebView()) {
            zzabu.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zza(zzbhu zzbhuVar) {
        this.zzemi = true;
        zzbhe zzbheVar = this.zzema;
        if (zzbheVar != null) {
            zzbheVar.zztf();
            this.zzema = null;
        }
        zzach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view, zzavu zzavuVar, int i) {
        if (!zzavuVar.zzvo() || i <= 0) {
            return;
        }
        zzavuVar.zzl(view);
        if (zzavuVar.zzvo()) {
            zzayh.zzeaj.postDelayed(new zzbhk(this, view, zzavuVar, i), 100L);
        }
    }

    private final void zzacc() {
        if (this.zzeml == null) {
            return;
        }
        this.zzelw.getView().removeOnAttachStateChangeListener(this.zzeml);
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzacd() {
        zzavu zzavuVar = this.zzemh;
        if (zzavuVar != null) {
            WebView webView = this.zzelw.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza(webView, zzavuVar, 10);
                return;
            }
            zzacc();
            this.zzeml = new zzbhn(this, zzavuVar);
            this.zzelw.getView().addOnAttachStateChangeListener(this.zzeml);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzace() {
        synchronized (this.lock) {
            this.zzemf = true;
        }
        this.zzemk++;
        zzach();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzacf() {
        this.zzemk--;
        zzach();
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzacg() {
        this.zzemj = true;
        zzach();
    }

    private final void zzach() {
        if (this.zzelz != null && ((this.zzemi && this.zzemk <= 0) || this.zzemj)) {
            this.zzelz.zzak(!this.zzemj);
            this.zzelz = null;
        }
        this.zzelw.zzabo();
    }

    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        boolean zzabj = this.zzelw.zzabj();
        zza(new AdOverlayInfoParcel(zzdVar, (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null, zzabj ? null : this.zzdor, this.zzdov, this.zzelw.zzzt()));
    }

    public final void zzc(boolean z, int i) {
        zzut zzutVar = (!this.zzelw.zzabj() || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzdor;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdov;
        zzbfq zzbfqVar = this.zzelw;
        zza(new AdOverlayInfoParcel(zzutVar, zzoVar, zztVar, zzbfqVar, z, i, zzbfqVar.zzzt()));
    }

    public final void zza(boolean z, int i, String str) {
        boolean zzabj = this.zzelw.zzabj();
        zzut zzutVar = (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        zzbhm zzbhmVar = zzabj ? null : new zzbhm(this.zzelw, this.zzdor);
        zzagl zzaglVar = this.zzddv;
        zzagn zzagnVar = this.zzddw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdov;
        zzbfq zzbfqVar = this.zzelw;
        zza(new AdOverlayInfoParcel(zzutVar, zzbhmVar, zzaglVar, zzagnVar, zztVar, zzbfqVar, z, i, str, zzbfqVar.zzzt()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzabj = this.zzelw.zzabj();
        zzut zzutVar = (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        zzbhm zzbhmVar = zzabj ? null : new zzbhm(this.zzelw, this.zzdor);
        zzagl zzaglVar = this.zzddv;
        zzagn zzagnVar = this.zzddw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdov;
        zzbfq zzbfqVar = this.zzelw;
        zza(new AdOverlayInfoParcel(zzutVar, zzbhmVar, zzaglVar, zzagnVar, zztVar, zzbfqVar, z, i, str, str2, zzbfqVar.zzzt()));
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzapw zzapwVar = this.zzdes;
        boolean zzuk = zzapwVar != null ? zzapwVar.zzuk() : false;
        com.google.android.gms.ads.internal.zzp.zzko();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzelw.getContext(), adOverlayInfoParcel, !zzuk);
        if (this.zzemh != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdoq != null) {
                str = adOverlayInfoParcel.zzdoq.url;
            }
            this.zzemh.zzea(str);
        }
    }

    public final void destroy() {
        zzavu zzavuVar = this.zzemh;
        if (zzavuVar != null) {
            zzavuVar.zzvq();
            this.zzemh = null;
        }
        zzacc();
        this.zzepp.reset();
        this.zzepp.zzg((zzajw<zzbfq>) null);
        synchronized (this.lock) {
            this.zzcgq = null;
            this.zzdor = null;
            this.zzelz = null;
            this.zzema = null;
            this.zzddv = null;
            this.zzddw = null;
            this.zzdov = null;
            this.zzemb = null;
            if (this.zzdes != null) {
                this.zzdes.zzac(true);
                this.zzdes = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zza(zzbhf zzbhfVar) {
        this.zzelz = zzbhfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zza(zzbhe zzbheVar) {
        this.zzema = zzbheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzb(zzbhu zzbhuVar) {
        this.zzepp.zzg(zzbhuVar.uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzc(zzbhu zzbhuVar) {
        String valueOf = String.valueOf(zzbhuVar.url);
        zzaxy.zzei(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzbhuVar.uri;
        if (this.zzepp.zzg(uri)) {
            return true;
        }
        if (this.zzemc) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zzut zzutVar = this.zzcgq;
                if (zzutVar != null) {
                    zzutVar.onAdClicked();
                    zzavu zzavuVar = this.zzemh;
                    if (zzavuVar != null) {
                        zzavuVar.zzea(zzbhuVar.url);
                    }
                    this.zzcgq = null;
                }
                return false;
            }
        }
        if (!this.zzelw.getWebView().willNotDraw()) {
            try {
                zzeg zzabh = this.zzelw.zzabh();
                if (zzabh != null && zzabh.zzb(uri)) {
                    uri = zzabh.zza(uri, this.zzelw.getContext(), this.zzelw.getView(), this.zzelw.zzzq());
                }
            } catch (zzef unused) {
                String valueOf2 = String.valueOf(zzbhuVar.url);
                zzaxy.zzfe(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            com.google.android.gms.ads.internal.zza zzaVar = this.zzder;
            if (zzaVar == null || zzaVar.zzjx()) {
                zza(new com.google.android.gms.ads.internal.overlay.zzd("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.zzder.zzbo(zzbhuVar.url);
            }
        } else {
            String valueOf3 = String.valueOf(zzbhuVar.url);
            zzaxy.zzfe(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final WebResourceResponse zzd(zzbhu zzbhuVar) {
        String str;
        WebResourceResponse zzd;
        zzsv zza;
        zzavu zzavuVar = this.zzemh;
        if (zzavuVar != null) {
            zzavuVar.zza(zzbhuVar.url, zzbhuVar.zzam, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(zzbhuVar.url).getName())) {
            zzur();
            if (this.zzelw.zzabc().zzacx()) {
                str = (String) zzwe.zzpu().zzd(zzaat.zzcmp);
            } else if (this.zzelw.zzabj()) {
                str = (String) zzwe.zzpu().zzd(zzaat.zzcmo);
            } else {
                str = (String) zzwe.zzpu().zzd(zzaat.zzcmn);
            }
            com.google.android.gms.ads.internal.zzp.zzkp();
            zzd = zzayh.zzd(this.zzelw.getContext(), this.zzelw.zzzt().zzbra, str);
        } else {
            zzd = null;
        }
        if (zzd != null) {
            return zzd;
        }
        try {
            if (!zzawq.zzc(zzbhuVar.url, this.zzelw.getContext(), this.zzdsu).equals(zzbhuVar.url)) {
                return zze(zzbhuVar);
            }
            zzta zzbw = zzta.zzbw(zzbhuVar.url);
            if (zzbw != null && (zza = com.google.android.gms.ads.internal.zzp.zzkv().zza(zzbw)) != null && zza.zzmu()) {
                return new WebResourceResponse("", "", zza.zzmv());
            }
            if (zzbax.isEnabled() && zzacj.zzdad.get().booleanValue()) {
                return zze(zzbhuVar);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AdWebViewClient.interceptRequest");
            return zzaci();
        }
    }

    private static WebResourceResponse zzaci() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnr)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
        com.google.android.gms.ads.internal.zzp.zzkp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
        return com.google.android.gms.internal.ads.zzayh.zzd(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse zze(com.google.android.gms.internal.ads.zzbhu r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhi.zze(com.google.android.gms.internal.ads.zzbhu):android.webkit.WebResourceResponse");
    }

    public final void zzav(boolean z) {
        this.zzemc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final zzavu zzacj() {
        return this.zzemh;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzur() {
        synchronized (this.lock) {
            this.zzemc = false;
            this.zzbrb = true;
            zzbbi.zzedy.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbhl
                private final zzbhi zzepr;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzepr = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbhi zzbhiVar = this.zzepr;
                    zzbhiVar.zzelw.zzabn();
                    com.google.android.gms.ads.internal.overlay.zzc zzaba = zzbhiVar.zzelw.zzaba();
                    if (zzaba != null) {
                        zzaba.zzur();
                    }
                }
            });
        }
    }

    public final void zzba(boolean z) {
        this.zzdsu = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzi(int i, int i2) {
        zzapw zzapwVar = this.zzdes;
        if (zzapwVar != null) {
            zzapwVar.zzi(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzbb(boolean z) {
        synchronized (this.lock) {
            this.zzemd = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzbc(boolean z) {
        synchronized (this.lock) {
            this.zzeme = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzh(Uri uri) {
        this.zzepp.zzh(uri);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzelw.zzb(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
