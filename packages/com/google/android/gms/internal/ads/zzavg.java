package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzavg extends zzaup {
    private FullScreenContentCallback zzdvl;
    private OnUserEarnedRewardListener zzdvm;

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void onRewardedAdFailedToShow(int i) {
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzdvl = fullScreenContentCallback;
    }

    public final void zza(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzdvm = onUserEarnedRewardListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void onRewardedAdOpened() {
        FullScreenContentCallback fullScreenContentCallback = this.zzdvl;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void onRewardedAdClosed() {
        FullScreenContentCallback fullScreenContentCallback = this.zzdvl;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void zzd(zzuw zzuwVar) {
        FullScreenContentCallback fullScreenContentCallback = this.zzdvl;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzuwVar.zzpf());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    public final void zza(zzaug zzaugVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.zzdvm;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new zzauz(zzaugVar));
        }
    }
}
