package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzys;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class PublisherInterstitialAd {
    private final zzys zzadf;

    public PublisherInterstitialAd(Context context) {
        this.zzadf = new zzys(context, this);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public final AdListener getAdListener() {
        return this.zzadf.getAdListener();
    }

    public final String getAdUnitId() {
        return this.zzadf.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzadf.getAppEventListener();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzadf.getOnCustomRenderedAdLoadedListener();
    }

    public final boolean isLoaded() {
        return this.zzadf.isLoaded();
    }

    public final boolean isLoading() {
        return this.zzadf.isLoading();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzadf.zza(publisherAdRequest.zzdp());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzadf.setAdListener(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzadf.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzadf.setAppEventListener(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzadf.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzadf.getMediationAdapterClassName();
    }

    public final void show() {
        this.zzadf.show();
    }

    public final void setImmersiveMode(boolean z) {
        this.zzadf.setImmersiveMode(z);
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzadf.getResponseInfo();
    }
}
