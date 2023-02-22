package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzauw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class RewardedAd {
    private final zzauw zzhim;

    public RewardedAd(Context context, String str) {
        Preconditions.checkNotNull(context, "context cannot be null");
        Preconditions.checkNotNull(str, "adUnitID cannot be null");
        this.zzhim = new zzauw(context, str);
    }

    public final void loadAd(AdRequest adRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzhim.zza(adRequest.zzdp(), rewardedAdLoadCallback);
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest, RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzhim.zza(publisherAdRequest.zzdp(), rewardedAdLoadCallback);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzhim.getMediationAdapterClassName();
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        this.zzhim.setServerSideVerificationOptions(serverSideVerificationOptions);
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzhim.setOnAdMetadataChangedListener(onAdMetadataChangedListener);
    }

    public final Bundle getAdMetadata() {
        return this.zzhim.getAdMetadata();
    }

    public final boolean isLoaded() {
        return this.zzhim.isLoaded();
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback) {
        this.zzhim.show(activity, rewardedAdCallback);
    }

    public final void show(Activity activity, RewardedAdCallback rewardedAdCallback, boolean z) {
        this.zzhim.show(activity, rewardedAdCallback, z);
    }

    public final RewardItem getRewardItem() {
        return this.zzhim.getRewardItem();
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzhim.getResponseInfo();
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzhim.setOnPaidEventListener(onPaidEventListener);
    }
}
