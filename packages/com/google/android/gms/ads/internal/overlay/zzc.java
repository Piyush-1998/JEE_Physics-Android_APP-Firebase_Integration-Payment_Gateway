package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzaqk;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhf;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzwe;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzc extends zzaqk implements zzy {
    private static final int zzdnn = Color.argb(0, 0, 0, 0);
    protected final Activity zzaas;
    zzbfq zzdgc;
    AdOverlayInfoParcel zzdno;
    private zzi zzdnp;
    private zzq zzdnq;
    private FrameLayout zzdns;
    private WebChromeClient.CustomViewCallback zzdnt;
    private zzj zzdnv;
    private Runnable zzdnz;
    private boolean zzdoa;
    private boolean zzdob;
    private boolean zzdnr = false;
    private boolean zzdnu = false;
    private boolean zzbor = false;
    private boolean zzdnw = false;
    int zzdnx = 0;
    private final Object zzdny = new Object();
    private boolean zzdoc = false;
    private boolean zzdod = false;
    private boolean zzdoe = true;

    public zzc(Activity activity) {
        this.zzaas = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onRestart() {
    }

    public final void close() {
        this.zzdnx = 2;
        this.zzaas.finish();
    }

    public final void zzuo() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdno;
        if (adOverlayInfoParcel != null && this.zzdnr) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdns != null) {
            this.zzaas.setContentView(this.zzdnv);
            this.zzdob = true;
            this.zzdns.removeAllViews();
            this.zzdns = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdnt;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdnt = null;
        }
        this.zzdnr = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzup() {
        this.zzdnx = 1;
        this.zzaas.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onBackPressed() {
        this.zzdnx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final boolean zzuq() {
        this.zzdnx = 0;
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar == null) {
            return true;
        }
        boolean zzabl = zzbfqVar.zzabl();
        if (!zzabl) {
            this.zzdgc.zza("onbackblocked", Collections.emptyMap());
        }
        return zzabl;
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public void onCreate(Bundle bundle) {
        this.zzaas.requestWindowFeature(1);
        this.zzdnu = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.zzaas.getIntent());
            this.zzdno = zzc;
            if (zzc == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (zzc.zzbpa.zzedr > 7500000) {
                this.zzdnx = 3;
            }
            if (this.zzaas.getIntent() != null) {
                this.zzdoe = this.zzaas.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzdno.zzdoy != null) {
                this.zzbor = this.zzdno.zzdoy.zzbor;
            } else {
                this.zzbor = false;
            }
            if (this.zzbor && this.zzdno.zzdoy.zzbow != -1) {
                new zzl(this).zzwv();
            }
            if (bundle == null) {
                if (this.zzdno.zzdor != null && this.zzdoe) {
                    this.zzdno.zzdor.zzuj();
                }
                if (this.zzdno.zzdow != 1 && this.zzdno.zzcgq != null) {
                    this.zzdno.zzcgq.onAdClicked();
                }
            }
            zzj zzjVar = new zzj(this.zzaas, this.zzdno.zzdox, this.zzdno.zzbpa.zzbra);
            this.zzdnv = zzjVar;
            zzjVar.setId(1000);
            com.google.android.gms.ads.internal.zzp.zzkr().zzg(this.zzaas);
            int i = this.zzdno.zzdow;
            if (i == 1) {
                zzaj(false);
            } else if (i == 2) {
                this.zzdnp = new zzi(this.zzdno.zzdgc);
                zzaj(false);
            } else if (i == 3) {
                zzaj(true);
            } else {
                throw new zzg("Could not determine ad overlay type.");
            }
        } catch (zzg e) {
            zzaxy.zzfe(e.getMessage());
            this.zzdnx = 3;
            this.zzaas.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onStart() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue()) {
            zzbfq zzbfqVar = this.zzdgc;
            if (zzbfqVar != null && !zzbfqVar.isDestroyed()) {
                com.google.android.gms.ads.internal.zzp.zzkr();
                zzaym.zzb(this.zzdgc);
                return;
            }
            zzaxy.zzfe("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onResume() {
        if (this.zzdno.zzdor != null) {
            this.zzdno.zzdor.onResume();
        }
        zza(this.zzaas.getResources().getConfiguration());
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue()) {
            return;
        }
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null && !zzbfqVar.isDestroyed()) {
            com.google.android.gms.ads.internal.zzp.zzkr();
            zzaym.zzb(this.zzdgc);
            return;
        }
        zzaxy.zzfe("The webview does not exist. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onPause() {
        zzuo();
        if (this.zzdno.zzdor != null) {
            this.zzdno.zzdor.onPause();
        }
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue() && this.zzdgc != null && (!this.zzaas.isFinishing() || this.zzdnp == null)) {
            com.google.android.gms.ads.internal.zzp.zzkr();
            zzaym.zza(this.zzdgc);
        }
        zzus();
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void zzad(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdnu);
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onStop() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcth)).booleanValue() && this.zzdgc != null && (!this.zzaas.isFinishing() || this.zzdnp == null)) {
            com.google.android.gms.ads.internal.zzp.zzkr();
            zzaym.zza(this.zzdgc);
        }
        zzus();
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void onDestroy() {
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            try {
                this.zzdnv.removeView(zzbfqVar.getView());
            } catch (NullPointerException unused) {
            }
        }
        zzus();
    }

    private final void zzai(boolean z) {
        int intValue = ((Integer) zzwe.zzpu().zzd(zzaat.zzctj)).intValue();
        zzp zzpVar = new zzp();
        zzpVar.size = 50;
        zzpVar.paddingLeft = z ? intValue : 0;
        zzpVar.paddingRight = z ? 0 : intValue;
        zzpVar.paddingTop = 0;
        zzpVar.paddingBottom = intValue;
        this.zzdnq = new zzq(this.zzaas, zzpVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdno.zzdot);
        this.zzdnv.addView(this.zzdnq, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzaql
    public final void zzdo() {
        this.zzdob = true;
    }

    public final void zza(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcok)).booleanValue() && (adOverlayInfoParcel2 = this.zzdno) != null && adOverlayInfoParcel2.zzdoy != null && this.zzdno.zzdoy.zzboy;
        boolean z5 = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcol)).booleanValue() && (adOverlayInfoParcel = this.zzdno) != null && adOverlayInfoParcel.zzdoy != null && this.zzdno.zzdoy.zzboz;
        if (z && z2 && z4 && !z5) {
            new zzaqg(this.zzdgc, "useCustomClose").zzdx("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzq zzqVar = this.zzdnq;
        if (zzqVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzqVar.zzal(z3);
        }
    }

    public final void zzur() {
        this.zzdnv.removeView(this.zzdnq);
        zzai(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzaas.getApplicationInfo().targetSdkVersion >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvl)).intValue()) {
            if (this.zzaas.getApplicationInfo().targetSdkVersion <= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvm)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvn)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzwe.zzpu().zzd(zzaat.zzcvo)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzaas.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzkt().zzb(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzaas);
        this.zzdns = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdns.addView(view, -1, -1);
        this.zzaas.setContentView(this.zzdns);
        this.zzdob = true;
        this.zzdnt = customViewCallback;
        this.zzdnr = true;
    }

    private final void zzaj(boolean z) throws zzg {
        if (!this.zzdob) {
            this.zzaas.requestWindowFeature(1);
        }
        Window window = this.zzaas.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        zzbhc zzabe = this.zzdno.zzdgc != null ? this.zzdno.zzdgc.zzabe() : null;
        boolean z2 = zzabe != null && zzabe.zzabx();
        this.zzdnw = false;
        if (z2) {
            int i = this.zzdno.orientation;
            com.google.android.gms.ads.internal.zzp.zzkr();
            if (i == 6) {
                this.zzdnw = this.zzaas.getResources().getConfiguration().orientation == 1;
            } else {
                int i2 = this.zzdno.orientation;
                com.google.android.gms.ads.internal.zzp.zzkr();
                if (i2 == 7) {
                    this.zzdnw = this.zzaas.getResources().getConfiguration().orientation == 2;
                }
            }
        }
        boolean z3 = this.zzdnw;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z3);
        zzaxy.zzef(sb.toString());
        setRequestedOrientation(this.zzdno.orientation);
        com.google.android.gms.ads.internal.zzp.zzkr();
        window.setFlags(16777216, 16777216);
        zzaxy.zzef("Hardware acceleration on the AdActivity window enabled.");
        if (!this.zzbor) {
            this.zzdnv.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            this.zzdnv.setBackgroundColor(zzdnn);
        }
        this.zzaas.setContentView(this.zzdnv);
        this.zzdob = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzp.zzkq();
                zzbfq zza = zzbfy.zza(this.zzaas, this.zzdno.zzdgc != null ? this.zzdno.zzdgc.zzabc() : null, this.zzdno.zzdgc != null ? this.zzdno.zzdgc.zzabd() : null, true, z2, null, null, this.zzdno.zzbpa, null, null, this.zzdno.zzdgc != null ? this.zzdno.zzdgc.zzzr() : null, zzto.zzmy(), null, false);
                this.zzdgc = zza;
                zza.zzabe().zza(null, this.zzdno.zzddv, null, this.zzdno.zzddw, this.zzdno.zzdov, true, null, this.zzdno.zzdgc != null ? this.zzdno.zzdgc.zzabe().zzabw() : null, null, null);
                this.zzdgc.zzabe().zza(new zzbhf(this) { // from class: com.google.android.gms.ads.internal.overlay.zzf
                    private final zzc zzdoj;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdoj = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbhf
                    public final void zzak(boolean z4) {
                        zzc zzcVar = this.zzdoj;
                        if (zzcVar.zzdgc != null) {
                            zzcVar.zzdgc.zzuv();
                        }
                    }
                });
                if (this.zzdno.url != null) {
                    this.zzdgc.loadUrl(this.zzdno.url);
                } else if (this.zzdno.zzdou != null) {
                    this.zzdgc.loadDataWithBaseURL(this.zzdno.zzdos, this.zzdno.zzdou, "text/html", "UTF-8", null);
                } else {
                    throw new zzg("No URL or HTML to display in ad overlay.");
                }
                if (this.zzdno.zzdgc != null) {
                    this.zzdno.zzdgc.zzb(this);
                }
            } catch (Exception e) {
                zzaxy.zzc("Error obtaining webview.", e);
                throw new zzg("Could not obtain webview for the overlay.");
            }
        } else {
            zzbfq zzbfqVar = this.zzdno.zzdgc;
            this.zzdgc = zzbfqVar;
            zzbfqVar.zzbv(this.zzaas);
        }
        this.zzdgc.zza(this);
        if (this.zzdno.zzdgc != null) {
            zzc(this.zzdno.zzdgc.zzabi(), this.zzdnv);
        }
        ViewParent parent = this.zzdgc.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.zzdgc.getView());
        }
        if (this.zzbor) {
            this.zzdgc.zzabq();
        }
        this.zzdgc.zza((ViewGroup) null, this.zzaas, this.zzdno.zzdos, this.zzdno.zzdou);
        this.zzdnv.addView(this.zzdgc.getView(), -1, -1);
        if (!z && !this.zzdnw) {
            zzuv();
        }
        zzai(z2);
        if (this.zzdgc.zzabg()) {
            zza(z2, true);
        }
    }

    private final void zzus() {
        if (!this.zzaas.isFinishing() || this.zzdoc) {
            return;
        }
        this.zzdoc = true;
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            zzbfqVar.zzdu(this.zzdnx);
            synchronized (this.zzdny) {
                if (!this.zzdoa && this.zzdgc.zzabm()) {
                    this.zzdnz = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                        private final zzc zzdoj;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdoj = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdoj.zzut();
                        }
                    };
                    zzayh.zzeaj.postDelayed(this.zzdnz, ((Long) zzwe.zzpu().zzd(zzaat.zzcoj)).longValue());
                    return;
                }
            }
        }
        zzut();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzut() {
        if (this.zzdod) {
            return;
        }
        this.zzdod = true;
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            this.zzdnv.removeView(zzbfqVar.getView());
            zzi zziVar = this.zzdnp;
            if (zziVar != null) {
                this.zzdgc.zzbv(zziVar.zzvr);
                this.zzdgc.zzax(false);
                this.zzdnp.parent.addView(this.zzdgc.getView(), this.zzdnp.index, this.zzdnp.zzdok);
                this.zzdnp = null;
            } else if (this.zzaas.getApplicationContext() != null) {
                this.zzdgc.zzbv(this.zzaas.getApplicationContext());
            }
            this.zzdgc = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdno;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzdor != null) {
            this.zzdno.zzdor.zzui();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdno;
        if (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdgc == null) {
            return;
        }
        zzc(this.zzdno.zzdgc.zzabi(), this.zzdno.zzdgc.getView());
    }

    private static void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzle().zza(iObjectWrapper, view);
    }

    public final void zzuu() {
        if (this.zzdnw) {
            this.zzdnw = false;
            zzuv();
        }
    }

    private final void zzuv() {
        this.zzdgc.zzuv();
    }

    public final void zzuw() {
        this.zzdnv.zzdom = true;
    }

    public final void zzux() {
        synchronized (this.zzdny) {
            this.zzdoa = true;
            if (this.zzdnz != null) {
                zzayh.zzeaj.removeCallbacks(this.zzdnz);
                zzayh.zzeaj.post(this.zzdnz);
            }
        }
    }

    private final void zza(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdno;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdoy == null || !this.zzdno.zzdoy.zzbos) ? false : true;
        boolean zza = com.google.android.gms.ads.internal.zzp.zzkr().zza(this.zzaas, configuration);
        if ((this.zzbor && !z3) || zza) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzdno) != null && adOverlayInfoParcel.zzdoy != null && this.zzdno.zzdoy.zzbox) {
            z2 = true;
        }
        Window window = this.zzaas.getWindow();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcom)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT < 19 || !z2) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }
}
