package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zza extends AdMetadataListener {
    private final /* synthetic */ AbstractAdViewAdapter zzmp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzmp = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        InterstitialAd interstitialAd;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        InterstitialAd interstitialAd2;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener2;
        interstitialAd = this.zzmp.zzmm;
        if (interstitialAd != null) {
            mediationRewardedVideoAdListener = this.zzmp.zzmn;
            if (mediationRewardedVideoAdListener != null) {
                interstitialAd2 = this.zzmp.zzmm;
                Bundle adMetadata = interstitialAd2.getAdMetadata();
                mediationRewardedVideoAdListener2 = this.zzmp.zzmn;
                mediationRewardedVideoAdListener2.zzb(adMetadata);
            }
        }
    }
}
