package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzut;
import com.google.android.gms.internal.ads.zzyq;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class BaseAdView extends ViewGroup {
    protected final zzyq zzade;

    public BaseAdView(Context context, int i) {
        super(context);
        this.zzade = new zzyq(this, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zzade = new zzyq(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zzade = new zzyq(this, attributeSet, false, i2);
    }

    public void destroy() {
        this.zzade.destroy();
    }

    public AdListener getAdListener() {
        return this.zzade.getAdListener();
    }

    public AdSize getAdSize() {
        return this.zzade.getAdSize();
    }

    public String getAdUnitId() {
        return this.zzade.getAdUnitId();
    }

    public void loadAd(AdRequest adRequest) {
        this.zzade.zza(adRequest.zzdp());
    }

    public void pause() {
        this.zzade.pause();
    }

    public void resume() {
        this.zzade.resume();
    }

    public boolean isLoading() {
        return this.zzade.isLoading();
    }

    public void setAdListener(AdListener adListener) {
        this.zzade.setAdListener(adListener);
        if (adListener == null) {
            this.zzade.zza((zzut) null);
            this.zzade.setAppEventListener(null);
            return;
        }
        if (adListener instanceof zzut) {
            this.zzade.zza((zzut) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zzade.setAppEventListener((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zzade.setAdSizes(adSize);
    }

    public void setAdUnitId(String str) {
        this.zzade.setAdUnitId(str);
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        return this.zzade.getMediationAdapterClassName();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        } else {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzbbd.zzc("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public ResponseInfo getResponseInfo() {
        return this.zzade.getResponseInfo();
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzade.setOnPaidEventListener(onPaidEventListener);
    }
}
