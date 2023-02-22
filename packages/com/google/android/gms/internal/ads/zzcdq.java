package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcdq extends zzaeg implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcep {
    private zzcco zzfyz;
    private zzqq zzfza;
    private final WeakReference<View> zzfzd;
    private final Map<String, WeakReference<View>> zzfze = new HashMap();
    private final Map<String, WeakReference<View>> zzfzf = new HashMap();
    private final Map<String, WeakReference<View>> zzfzg = new HashMap();

    public zzcdq(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzp.zzlm();
        zzbby.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzp.zzlm();
        zzbby.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfzd = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.zzfze.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.zzfzg.putAll(this.zzfze);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.zzfzf.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.zzfzg.putAll(this.zzfzf);
        this.zzfza = new zzqq(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final FrameLayout zzams() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final synchronized void unregisterNativeAd() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this);
            this.zzfyz = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzcco)) {
            zzaxy.zzfe("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.zzfyz != null) {
            this.zzfyz.zzb(this);
        }
        if (((zzcco) unwrap).zzali()) {
            zzcco zzccoVar = (zzcco) unwrap;
            this.zzfyz = zzccoVar;
            zzccoVar.zza(this);
            this.zzfyz.zzaa(zzahq());
            return;
        }
        zzaxy.zzfc("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final View zzahq() {
        return this.zzfzd.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final zzqq zzamt() {
        return this.zzfza;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized void zza(String str, View view, boolean z) {
        if (view == null) {
            this.zzfzg.remove(str);
            this.zzfze.remove(str);
            this.zzfzf.remove(str);
            return;
        }
        this.zzfzg.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            this.zzfze.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized Map<String, WeakReference<View>> zzamo() {
        return this.zzfzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized Map<String, WeakReference<View>> zzamp() {
        return this.zzfze;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized Map<String, WeakReference<View>> zzamq() {
        return this.zzfzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized View zzgf(String str) {
        WeakReference<View> weakReference = this.zzfzg.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized String zzamr() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final synchronized IObjectWrapper zzamu() {
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzfyz != null) {
            this.zzfyz.zza(view, motionEvent, zzahq());
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzfyz != null) {
            this.zzfyz.zza(view, zzahq(), zzamo(), zzamp(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(zzahq(), zzamo(), zzamp(), zzcco.zzz(zzahq()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzfyz != null) {
            this.zzfyz.zzb(zzahq(), zzamo(), zzamp(), zzcco.zzz(zzahq()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        if (this.zzfyz != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                zzaxy.zzfe("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zzfyz.setClickConfirmingView((View) unwrap);
        }
    }
}
