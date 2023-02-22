package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdp extends zzadz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcep {
    public static final String[] zzfyv = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private FrameLayout zzbns;
    private zzadr zzcki;
    private final int zzedr;
    private final String zzfyu;
    private FrameLayout zzfyw;
    private zzdvw zzfyx;
    private View zzfyy;
    private zzcco zzfyz;
    private zzqq zzfza;
    private boolean zzfzc;
    private Map<String, WeakReference<View>> zzdpj = new HashMap();
    private IObjectWrapper zzfzb = null;
    private boolean zzeoa = false;

    public zzcdp(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzfyw = frameLayout;
        this.zzbns = frameLayout2;
        this.zzedr = i;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzfyu = str;
        com.google.android.gms.ads.internal.zzp.zzlm();
        zzbby.zza((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzp.zzlm();
        zzbby.zza((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfyx = zzbbi.zzedy;
        this.zzfza = new zzqq(this.zzfyw.getContext(), this.zzfyw);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zza(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized void zza(String str, View view, boolean z) {
        if (this.zzeoa) {
            return;
        }
        if (view == null) {
            this.zzdpj.remove(str);
            return;
        }
        this.zzdpj.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            if (zzbah.zzdi(this.zzedr)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized IObjectWrapper zzcs(String str) {
        return ObjectWrapper.wrap(zzgf(str));
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized View zzgf(String str) {
        if (this.zzeoa) {
            return null;
        }
        WeakReference<View> weakReference = this.zzdpj.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        if (this.zzeoa) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzcco)) {
            zzaxy.zzfe("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this);
        }
        zzamn();
        zzcco zzccoVar = (zzcco) unwrap;
        this.zzfyz = zzccoVar;
        zzccoVar.zza(this);
        this.zzfyz.zzaa(this.zzfyw);
        this.zzfyz.zzab(this.zzbns);
        if (this.zzfzc) {
            this.zzfyz.zzalk().zza(this.zzcki);
        }
    }

    private final synchronized void zzamn() {
        this.zzfyx.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcds
            private final zzcdp zzfzj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfzj = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfzj.zzamv();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized void destroy() {
        if (this.zzeoa) {
            return;
        }
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this);
            this.zzfyz = null;
        }
        this.zzdpj.clear();
        this.zzfyw.removeAllViews();
        this.zzbns.removeAllViews();
        this.zzdpj = null;
        this.zzfyw = null;
        this.zzbns = null;
        this.zzfyy = null;
        this.zzfza = null;
        this.zzeoa = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized void zzc(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzfyz != null) {
            this.zzfyz.cancelUnconfirmedClick();
            this.zzfyz.zza(view, this.zzfyw, zzamo(), zzamp(), false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfyz != null) {
            this.zzfyz.zza(view, motionEvent, this.zzfyw);
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this.zzfyw, zzamo(), zzamp(), zzcco.zzz(this.zzfyw));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this.zzfyw, zzamo(), zzamp(), zzcco.zzz(this.zzfyw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized Map<String, WeakReference<View>> zzamo() {
        return this.zzdpj;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized Map<String, WeakReference<View>> zzamp() {
        return this.zzdpj;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized Map<String, WeakReference<View>> zzamq() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized String zzamr() {
        return this.zzfyu;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final FrameLayout zzams() {
        return this.zzbns;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final zzqq zzamt() {
        return this.zzfza;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        this.zzfyz.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        if (this.zzeoa) {
            return;
        }
        this.zzfzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final IObjectWrapper zzamu() {
        return this.zzfzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final void zzf(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzfyw, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final synchronized void zza(zzadr zzadrVar) {
        if (this.zzeoa) {
            return;
        }
        this.zzfzc = true;
        this.zzcki = zzadrVar;
        if (this.zzfyz != null) {
            this.zzfyz.zzalk().zza(zzadrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final /* synthetic */ View zzahq() {
        return this.zzfyw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzamv() {
        if (this.zzfyy == null) {
            View view = new View(this.zzfyw.getContext());
            this.zzfyy = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzfyw != this.zzfyy.getParent()) {
            this.zzfyw.addView(this.zzfyy);
        }
    }
}
