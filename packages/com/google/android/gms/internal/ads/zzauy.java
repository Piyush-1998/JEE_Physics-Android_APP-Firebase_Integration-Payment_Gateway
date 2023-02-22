package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzauy extends zzaup {
    private final RewardedAdCallback zzdvi;

    public zzauy(RewardedAdCallback rewardedAdCallback) {
        this.zzdvi = rewardedAdCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void onRewardedAdOpened() {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void onRewardedAdClosed() {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void zza(zzaug zzaugVar) {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzauz(zzaugVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void onRewardedAdFailedToShow(int i) {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void zzd(zzuw zzuwVar) {
        RewardedAdCallback rewardedAdCallback = this.zzdvi;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(zzuwVar.zzpf());
        }
    }
}
