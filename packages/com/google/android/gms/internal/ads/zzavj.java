package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzavj extends zzaus {
    private final RewardedInterstitialAdLoadCallback zzdvo;
    private final zzavi zzdvp;

    public zzavj(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzavi zzaviVar) {
        this.zzdvo = rewardedInterstitialAdLoadCallback;
        this.zzdvp = zzaviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final void onRewardedAdLoaded() {
        zzavi zzaviVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zzdvo;
        if (rewardedInterstitialAdLoadCallback == null || (zzaviVar = this.zzdvp) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdLoaded(zzaviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final void onRewardedAdFailedToLoad(int i) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zzdvo;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final void zze(zzuw zzuwVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zzdvo;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onRewardedInterstitialAdFailedToLoad(zzuwVar.zzpg());
        }
    }
}
