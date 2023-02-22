package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zztq;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbft extends WebViewClient implements zzbhc {
    private final Object lock;
    private boolean zzbrb;
    private zzut zzcgq;
    private zzagl zzddv;
    private zzagn zzddw;
    private com.google.android.gms.ads.internal.zza zzder;
    private zzapw zzdes;
    private com.google.android.gms.ads.internal.overlay.zzo zzdor;
    private com.google.android.gms.ads.internal.overlay.zzt zzdov;
    private boolean zzdsu;
    protected zzbfq zzelw;
    private final zzto zzelx;
    private final HashMap<String, List<zzahf<? super zzbfq>>> zzely;
    private zzbhf zzelz;
    private zzbhe zzema;
    private zzbhh zzemb;
    private boolean zzemc;
    private boolean zzemd;
    private boolean zzeme;
    private boolean zzemf;
    private final zzaqd zzemg;
    protected zzavu zzemh;
    private boolean zzemi;
    private boolean zzemj;
    private int zzemk;
    private View.OnAttachStateChangeListener zzeml;

    public zzbft(zzbfq zzbfqVar, zzto zztoVar, boolean z) {
        this(zzbfqVar, zztoVar, z, new zzaqd(zzbfqVar, zzbfqVar.zzaaz(), new zzaae(zzbfqVar.getContext())), null);
    }

    private zzbft(zzbfq zzbfqVar, zzto zztoVar, boolean z, zzaqd zzaqdVar, zzapw zzapwVar) {
        this.zzely = new HashMap<>();
        this.lock = new Object();
        this.zzemc = false;
        this.zzelx = zztoVar;
        this.zzelw = zzbfqVar;
        this.zzbrb = z;
        this.zzemg = zzaqdVar;
        this.zzdes = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zza(int i, int i2, boolean z) {
        this.zzemg.zzj(i, i2);
        zzapw zzapwVar = this.zzdes;
        if (zzapwVar != null) {
            zzapwVar.zza(i, i2, false);
        }
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
        boolean z;
        synchronized (this.lock) {
            z = this.zzbrb;
        }
        return z;
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
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzsq zzabu = this.zzelw.zzabu();
        if (zzabu != null && webView == zzabu.getWebView()) {
            zzabu.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.lock) {
            if (this.zzelw.isDestroyed()) {
                zzaxy.zzei("Blank page loaded, 1...");
                this.zzelw.zzabk();
                return;
            }
            this.zzemi = true;
            zzbhe zzbheVar = this.zzema;
            if (zzbheVar != null) {
                zzbheVar.zztf();
                this.zzema = null;
            }
            zzach();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view, zzavu zzavuVar, int i) {
        if (!zzavuVar.zzvo() || i <= 0) {
            return;
        }
        zzavuVar.zzl(view);
        if (zzavuVar.zzvo()) {
            zzayh.zzeaj.postDelayed(new zzbfu(this, view, zzavuVar, i), 100L);
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
            this.zzeml = new zzbfx(this, zzavuVar);
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
        zzto zztoVar = this.zzelx;
        if (zztoVar != null) {
            zztoVar.zza(zztq.zza.zzb.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzemj = true;
        zzach();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcuw)).booleanValue()) {
            this.zzelw.destroy();
        }
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
        zzbfz zzbfzVar = zzabj ? null : new zzbfz(this.zzelw, this.zzdor);
        zzagl zzaglVar = this.zzddv;
        zzagn zzagnVar = this.zzddw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdov;
        zzbfq zzbfqVar = this.zzelw;
        zza(new AdOverlayInfoParcel(zzutVar, zzbfzVar, zzaglVar, zzagnVar, zztVar, zzbfqVar, z, i, str, zzbfqVar.zzzt()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzabj = this.zzelw.zzabj();
        zzut zzutVar = (!zzabj || this.zzelw.zzabc().zzacx()) ? this.zzcgq : null;
        zzbfz zzbfzVar = zzabj ? null : new zzbfz(this.zzelw, this.zzdor);
        zzagl zzaglVar = this.zzddv;
        zzagn zzagnVar = this.zzddw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdov;
        zzbfq zzbfqVar = this.zzelw;
        zza(new AdOverlayInfoParcel(zzutVar, zzbfzVar, zzaglVar, zzagnVar, zztVar, zzbfqVar, z, i, str, str2, zzbfqVar.zzzt()));
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

    public final void zza(String str, zzahf<? super zzbfq> zzahfVar) {
        synchronized (this.lock) {
            List<zzahf<? super zzbfq>> list = this.zzely.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.zzely.put(str, list);
            }
            list.add(zzahfVar);
        }
    }

    public final void zzb(String str, zzahf<? super zzbfq> zzahfVar) {
        synchronized (this.lock) {
            List<zzahf<? super zzbfq>> list = this.zzely.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzahfVar);
        }
    }

    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        synchronized (this.lock) {
            List<zzahf<? super zzbfq>> list = this.zzely.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzahf<? super zzbfq> zzahfVar : list) {
                if (predicate.apply(zzahfVar)) {
                    arrayList.add(zzahfVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void reset() {
        zzavu zzavuVar = this.zzemh;
        if (zzavuVar != null) {
            zzavuVar.zzvq();
            this.zzemh = null;
        }
        zzacc();
        synchronized (this.lock) {
            this.zzely.clear();
            this.zzcgq = null;
            this.zzdor = null;
            this.zzelz = null;
            this.zzema = null;
            this.zzddv = null;
            this.zzddw = null;
            this.zzemc = false;
            this.zzbrb = false;
            this.zzemd = false;
            this.zzemf = false;
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

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaxy.zzei(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzaxy.zzei(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        } else {
            if (this.zzemc && webView == this.zzelw.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zzut zzutVar = this.zzcgq;
                    if (zzutVar != null) {
                        zzutVar.onAdClicked();
                        zzavu zzavuVar = this.zzemh;
                        if (zzavuVar != null) {
                            zzavuVar.zzea(str);
                        }
                        this.zzcgq = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzelw.getWebView().willNotDraw()) {
                try {
                    zzeg zzabh = this.zzelw.zzabh();
                    if (zzabh != null && zzabh.zzb(parse)) {
                        parse = zzabh.zza(parse, this.zzelw.getContext(), this.zzelw.getView(), this.zzelw.zzzq());
                    }
                } catch (zzef unused) {
                    String valueOf2 = String.valueOf(str);
                    zzaxy.zzfe(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zza zzaVar = this.zzder;
                if (zzaVar == null || zzaVar.zzjx()) {
                    zza(new com.google.android.gms.ads.internal.overlay.zzd("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.zzder.zzbo(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzaxy.zzfe(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzd(str, Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzd(String str, Map<String, String> map) {
        zzsv zza;
        try {
            String zzc = zzawq.zzc(str, this.zzelw.getContext(), this.zzdsu);
            if (!zzc.equals(str)) {
                return zze(zzc, map);
            }
            zzta zzbw = zzta.zzbw(str);
            if (zzbw != null && (zza = com.google.android.gms.ads.internal.zzp.zzkv().zza(zzbw)) != null && zza.zzmu()) {
                return new WebResourceResponse("", "", zza.zzmv());
            }
            if (zzbax.isEnabled() && zzacj.zzdad.get().booleanValue()) {
                return zze(str, map);
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
        com.google.android.gms.ads.internal.zzp.zzkp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
        return com.google.android.gms.internal.ads.zzayh.zzd(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.webkit.WebResourceResponse zze(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbft.zze(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
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
            zzbbi.zzedy.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbfs
                private final zzbft zzelv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzelv = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbft zzbftVar = this.zzelv;
                    zzbftVar.zzelw.zzabn();
                    com.google.android.gms.ads.internal.overlay.zzc zzaba = zzbftVar.zzelw.zzaba();
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

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzh(Uri uri) {
        final String path = uri.getPath();
        List<zzahf<? super zzbfq>> list = this.zzely.get(path);
        if (list != null) {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcus)).booleanValue()) {
                com.google.android.gms.ads.internal.zzp.zzkp();
                zza(zzayh.zzj(uri), list, path);
                return;
            }
            zzdvl.zza(com.google.android.gms.ads.internal.zzp.zzkp().zzi(uri), new zzbfw(this, list, path), zzbbi.zzedz);
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf);
        zzaxy.zzei(sb.toString());
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwx)).booleanValue() || com.google.android.gms.ads.internal.zzp.zzkt().zzwd() == null) {
            return;
        }
        zzbbi.zzedu.execute(new Runnable(path) { // from class: com.google.android.gms.internal.ads.zzbfv
            private final String zzdgb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = path;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.zzp.zzkt().zzwd().zzcv(this.zzdgb.substring(1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Map<String, String> map, List<zzahf<? super zzbfq>> list, String str) {
        if (zzaxy.isLoggable(2)) {
            String valueOf = String.valueOf(str);
            zzaxy.zzei(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzaxy.zzei(sb.toString());
            }
        }
        for (zzahf<? super zzbfq> zzahfVar : list) {
            zzahfVar.zza(this.zzelw, map);
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

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzelw.zzb(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
