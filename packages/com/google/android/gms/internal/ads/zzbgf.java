package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbgf extends FrameLayout implements zzbfq {
    private final zzbfq zzenj;
    private final zzbcx zzenk;
    private final AtomicBoolean zzenl;

    public zzbgf(zzbfq zzbfqVar) {
        super(zzbfqVar.getContext());
        this.zzenl = new AtomicBoolean();
        this.zzenj = zzbfqVar;
        this.zzenk = new zzbcx(zzbfqVar.zzaaz(), this, this);
        if (zzabv()) {
            return;
        }
        addView(this.zzenj.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbhd
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final zzbcx zzzn() {
        return this.zzenk;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void onPause() {
        this.zzenk.onPause();
        this.zzenj.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabk() {
        this.zzenk.onDestroy();
        this.zzenj.zzabk();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabq() {
        setBackgroundColor(0);
        this.zzenj.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final int zzzu() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final int zzzv() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzzw() {
        this.zzenj.zzzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final WebView getWebView() {
        return this.zzenj.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final void zza(String str, Map<String, ?> map) {
        this.zzenj.zza(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzajk
    public final void zzb(String str, JSONObject jSONObject) {
        this.zzenj.zzb(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(String str, zzahf<? super zzbfq> zzahfVar) {
        this.zzenj.zza(str, zzahfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzb(String str, zzahf<? super zzbfq> zzahfVar) {
        this.zzenj.zzb(str, zzahfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(String str, Predicate<zzahf<? super zzbfq>> predicate) {
        this.zzenj.zza(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzaax() {
        this.zzenj.zzaax();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzdu(int i) {
        this.zzenj.zzdu(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzuv() {
        this.zzenj.zzuv();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzaay() {
        this.zzenj.zzaay();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zza(boolean z, long j) {
        this.zzenj.zza(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zzdc(String str) {
        this.zzenj.zzdc(str);
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zza(String str, JSONObject jSONObject) {
        this.zzenj.zza(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde, com.google.android.gms.internal.ads.zzbgt
    public final Activity zzzq() {
        return this.zzenj.zzzq();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final Context zzaaz() {
        return this.zzenj.zzaaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final com.google.android.gms.ads.internal.zzb zzzr() {
        return this.zzenj.zzzr();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final com.google.android.gms.ads.internal.overlay.zzc zzaba() {
        return this.zzenj.zzaba();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final IObjectWrapper zzabi() {
        return this.zzenj.zzabi();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final com.google.android.gms.ads.internal.overlay.zzc zzabb() {
        return this.zzenj.zzabb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbgy
    public final zzbhj zzabc() {
        return this.zzenj.zzabc();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final String zzabd() {
        return this.zzenj.zzabd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzbhc zzabe() {
        return this.zzenj.zzabe();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final WebViewClient zzabf() {
        return this.zzenj.zzabf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzabg() {
        return this.zzenj.zzabg();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbhb
    public final zzeg zzabh() {
        return this.zzenj.zzabh();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde, com.google.android.gms.internal.ads.zzbha
    public final zzbbg zzzt() {
        return this.zzenj.zzzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbgs
    public final boolean zzabj() {
        return this.zzenj.zzabj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean isDestroyed() {
        return this.zzenj.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzabl() {
        return this.zzenj.zzabl();
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkm() {
        this.zzenj.zzkm();
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkl() {
        this.zzenj.zzkl();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final String getRequestId() {
        return this.zzenj.getRequestId();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final zzabi zzzp() {
        return this.zzenj.zzzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final zzabh zzzs() {
        return this.zzenj.zzzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final zzbgk zzzo() {
        return this.zzenj.zzzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzenj.zza(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zzenj.zzap(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(zzbhj zzbhjVar) {
        this.zzenj.zza(zzbhjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzax(boolean z) {
        this.zzenj.zzax(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabn() {
        this.zzenj.zzabn();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzbv(Context context) {
        this.zzenj.zzbv(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzal(boolean z) {
        this.zzenj.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void setRequestedOrientation(int i) {
        this.zzenj.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzenj.zzb(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzay(boolean z) {
        this.zzenj.zzay(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final void zza(String str, zzbev zzbevVar) {
        this.zzenj.zza(str, zzbevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final zzbev zzfj(String str) {
        return this.zzenj.zzfj(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabo() {
        this.zzenj.zzabo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void destroy() {
        final IObjectWrapper zzabi = zzabi();
        if (zzabi != null) {
            zzayh.zzeaj.post(new Runnable(zzabi) { // from class: com.google.android.gms.internal.ads.zzbge
                private final IObjectWrapper zzeni;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeni = zzabi;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzp.zzle().zzac(this.zzeni);
                }
            });
            zzayh.zzeaj.postDelayed(new zzbgh(this), ((Integer) zzwe.zzpu().zzd(zzaat.zzctr)).intValue());
            return;
        }
        this.zzenj.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void loadData(String str, String str2, String str3) {
        this.zzenj.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzenj.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void loadUrl(String str) {
        this.zzenj.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzb(String str, String str2, String str3) {
        this.zzenj.zzb(str, str2, str3);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbfq
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzenj.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbfq
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zzenj.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzenj.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzenj.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void onResume() {
        this.zzenj.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzabr() {
        TextView textView = new TextView(getContext());
        Resources resources = com.google.android.gms.ads.internal.zzp.zzkt().getResources();
        textView.setText(resources != null ? resources.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzba(boolean z) {
        this.zzenj.zzba(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(zzadf zzadfVar) {
        this.zzenj.zza(zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(zzsc zzscVar) {
        this.zzenj.zza(zzscVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzsc zzabs() {
        return this.zzenj.zzabs();
    }

    @Override // com.google.android.gms.internal.ads.zzqu
    public final void zza(zzqr zzqrVar) {
        this.zzenj.zza(zzqrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(zzadk zzadkVar) {
        this.zzenj.zza(zzadkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzadk zzabp() {
        return this.zzenj.zzabp();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq, com.google.android.gms.internal.ads.zzbde
    public final void zza(zzbgk zzbgkVar) {
        this.zzenj.zza(zzbgkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzabm() {
        return this.zzenj.zzabm();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzaz(boolean z) {
        this.zzenj.zzaz(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzav(boolean z) {
        this.zzenj.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzuw() {
        this.zzenj.zzuw();
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzenj.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zzc(boolean z, int i) {
        this.zzenj.zzc(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zza(boolean z, int i, String str) {
        this.zzenj.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgw
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzenj.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzb(boolean z, int i) {
        if (this.zzenl.compareAndSet(false, true)) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnu)).booleanValue()) {
                return false;
            }
            if (this.zzenj.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.zzenj.getParent()).removeView(this.zzenj.getView());
            }
            return this.zzenj.zzb(z, i);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzabt() {
        return this.zzenl.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.zzenj.zza(this, activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzsq zzabu() {
        return this.zzenj.zzabu();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzabv() {
        return this.zzenj.zzabv();
    }
}
