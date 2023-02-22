package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzwu;
import com.google.android.gms.internal.ads.zzyq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class PublisherAdView extends ViewGroup {
    private final zzyq zzadw;

    public PublisherAdView(Context context) {
        super(context);
        this.zzadw = new zzyq(this);
    }

    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzadw = new zzyq(this, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzadw = new zzyq(this, attributeSet, true);
    }

    public final VideoController getVideoController() {
        return this.zzadw.getVideoController();
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzadw.setVideoOptions(videoOptions);
    }

    public final VideoOptions getVideoOptions() {
        return this.zzadw.getVideoOptions();
    }

    public final void destroy() {
        this.zzadw.destroy();
    }

    public final AdListener getAdListener() {
        return this.zzadw.getAdListener();
    }

    public final AdSize getAdSize() {
        return this.zzadw.getAdSize();
    }

    public final AdSize[] getAdSizes() {
        return this.zzadw.getAdSizes();
    }

    public final String getAdUnitId() {
        return this.zzadw.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzadw.getAppEventListener();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzadw.getOnCustomRenderedAdLoadedListener();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzadw.zza(publisherAdRequest.zzdp());
    }

    public final void pause() {
        this.zzadw.pause();
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzadw.setManualImpressionsEnabled(z);
    }

    public final void recordManualImpression() {
        this.zzadw.recordManualImpression();
    }

    public final void resume() {
        this.zzadw.resume();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadw.setAdListener(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zzadw.zza(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.zzadw.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzadw.setAppEventListener(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzadw.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadw.getMediationAdapterClassName();
    }

    public final boolean isLoading() {
        return this.zzadw.isLoading();
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzadw.getResponseInfo();
    }

    public final boolean zza(zzwu zzwuVar) {
        return this.zzadw.zza(zzwuVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    protected final void onMeasure(int i, int i2) {
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
}
