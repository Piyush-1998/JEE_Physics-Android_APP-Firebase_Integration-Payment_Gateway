package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaub implements RewardedVideoAd {
    private final zzatm zzdvc;
    private String zzdve;
    private String zzdvf;
    private final Context zzvr;
    private final Object lock = new Object();
    private final zzatw zzdvd = new zzatw(null);

    public zzaub(Context context, zzatm zzatmVar) {
        this.zzdvc = zzatmVar == null ? new zzzs() : zzatmVar;
        this.zzvr = context.getApplicationContext();
    }

    private final void zza(String str, zzyo zzyoVar) {
        synchronized (this.lock) {
            if (this.zzdvc == null) {
                return;
            }
            try {
                this.zzdvc.zza(zzvh.zza(this.zzvr, zzyoVar, str));
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, AdRequest adRequest) {
        zza(str, adRequest.zzdp());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void loadAd(String str, PublisherAdRequest publisherAdRequest) {
        zza(str, publisherAdRequest.zzdp());
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void show() {
        synchronized (this.lock) {
            if (this.zzdvc == null) {
                return;
            }
            try {
                this.zzdvc.show();
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        synchronized (this.lock) {
            this.zzdvd.setRewardedVideoAdListener(rewardedVideoAdListener);
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zza(this.zzdvd);
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.zza(new zzvd(adMetadataListener));
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final Bundle getAdMetadata() {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    return this.zzdvc.getAdMetadata();
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setUserId(String str) {
        synchronized (this.lock) {
            this.zzdve = str;
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.setUserId(str);
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final boolean isLoaded() {
        synchronized (this.lock) {
            if (this.zzdvc == null) {
                return false;
            }
            try {
                return this.zzdvc.isLoaded();
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause() {
        pause(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void pause(Context context) {
        synchronized (this.lock) {
            if (this.zzdvc == null) {
                return;
            }
            try {
                this.zzdvc.zzj(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume() {
        resume(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void resume(Context context) {
        synchronized (this.lock) {
            if (this.zzdvc == null) {
                return;
            }
            try {
                this.zzdvc.zzk(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy() {
        destroy(null);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void destroy(Context context) {
        synchronized (this.lock) {
            this.zzdvd.setRewardedVideoAdListener(null);
            if (this.zzdvc == null) {
                return;
            }
            try {
                this.zzdvc.zzl(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final RewardedVideoAdListener getRewardedVideoAdListener() {
        RewardedVideoAdListener rewardedVideoAdListener;
        synchronized (this.lock) {
            rewardedVideoAdListener = this.zzdvd.getRewardedVideoAdListener();
        }
        return rewardedVideoAdListener;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getUserId() {
        String str;
        synchronized (this.lock) {
            str = this.zzdve;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getMediationAdapterClassName() {
        try {
            if (this.zzdvc != null) {
                return this.zzdvc.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setImmersiveMode(boolean z) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.setImmersiveMode(z);
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final void setCustomData(String str) {
        synchronized (this.lock) {
            if (this.zzdvc != null) {
                try {
                    this.zzdvc.setCustomData(str);
                    this.zzdvf = str;
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final String getCustomData() {
        String str;
        synchronized (this.lock) {
            str = this.zzdvf;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAd
    public final ResponseInfo getResponseInfo() {
        zzyf zzyfVar = null;
        try {
            if (this.zzdvc != null) {
                zzyfVar = this.zzdvc.zzkg();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzyfVar);
    }
}
