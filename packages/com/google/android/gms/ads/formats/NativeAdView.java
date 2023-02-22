package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzwe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@Deprecated
/* loaded from: classes.dex */
public class NativeAdView extends FrameLayout {
    private final FrameLayout zzbns;
    private final zzaea zzbnt;

    public NativeAdView(Context context) {
        super(context);
        this.zzbns = zzd(context);
        this.zzbnt = zzjs();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbns = zzd(context);
        this.zzbnt = zzjs();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbns = zzd(context);
        this.zzbnt = zzjs();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbns = zzd(context);
        this.zzbnt = zzjs();
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public AdChoicesView getAdChoicesView() {
        View zzbn = zzbn(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbn instanceof AdChoicesView) {
            return (AdChoicesView) zzbn;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(String str, View view) {
        try {
            this.zzbnt.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzbbd.zzc("Unable to call setAssetView on delegate", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View zzbn(String str) {
        try {
            IObjectWrapper zzcs = this.zzbnt.zzcs(str);
            if (zzcs != null) {
                return (View) ObjectWrapper.unwrap(zzcs);
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zzc("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzbnt.zza((IObjectWrapper) nativeAd.zzjq());
        } catch (RemoteException e) {
            zzbbd.zzc("Unable to call setNativeAd on delegate", e);
        }
    }

    public void destroy() {
        try {
            this.zzbnt.destroy();
        } catch (RemoteException e) {
            zzbbd.zzc("Unable to destroy native ad view", e);
        }
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzaea zzjs() {
        Preconditions.checkNotNull(this.zzbns, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzwe.zzpr().zza(this.zzbns.getContext(), this, this.zzbns);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbns);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.zzbns == view) {
            return;
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbns);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbns;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzaea zzaeaVar = this.zzbnt;
        if (zzaeaVar != null) {
            try {
                zzaeaVar.zzc(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzaea zzaeaVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrc)).booleanValue() && (zzaeaVar = this.zzbnt) != null) {
            try {
                zzaeaVar.zzf(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
