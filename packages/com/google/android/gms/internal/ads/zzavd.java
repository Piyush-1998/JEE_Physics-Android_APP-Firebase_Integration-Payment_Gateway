package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzavd extends zzaus {
    private final RewardedAdLoadCallback zzdvk;

    public zzavd(RewardedAdLoadCallback rewardedAdLoadCallback) {
        this.zzdvk = rewardedAdLoadCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final void onRewardedAdLoaded() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdvk;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final void onRewardedAdFailedToLoad(int i) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdvk;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final void zze(zzuw zzuwVar) {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.zzdvk;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onRewardedAdFailedToLoad(zzuwVar.zzpg());
        }
    }
}
