package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzavi extends RewardedInterstitialAd {
    private final Context zzaai;
    private final zzaul zzdvh;
    private final zzavg zzdvn = new zzavg();

    public zzavi(Context context, String str) {
        this.zzaai = context.getApplicationContext();
        this.zzdvh = zzwe.zzpr().zzc(context, str, new zzamr());
    }

    public final void zza(zzyo zzyoVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            this.zzdvh.zzb(zzvh.zza(this.zzaai, zzyoVar), new zzavj(rewardedInterstitialAdLoadCallback, this));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzdvn.setFullScreenContentCallback(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            this.zzdvh.zza(new zzavc(serverSideVerificationOptions));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zzdvh.zza(new zzzu(onAdMetadataChangedListener));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            return this.zzdvh.getAdMetadata();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzaug zzqw = this.zzdvh.zzqw();
            if (zzqw != null) {
                return new zzauz(zzqw);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzyf zzyfVar;
        try {
            zzyfVar = this.zzdvh.zzkg();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            zzyfVar = null;
        }
        return ResponseInfo.zza(zzyfVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzdvn.zza(onUserEarnedRewardListener);
        try {
            this.zzdvh.zza(this.zzdvn);
            this.zzdvh.zzh(ObjectWrapper.wrap(activity));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzdvh.zza(new zzzt(onPaidEventListener));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
