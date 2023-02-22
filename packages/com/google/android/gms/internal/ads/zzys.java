package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzys {
    private final zzvh zzacs;
    private AppEventListener zzbnw;
    private boolean zzbox;
    private zzwu zzbun;
    private String zzbuo;
    private final zzamr zzbuq;
    private zzut zzcgq;
    private AdListener zzcgu;
    private AdMetadataListener zzchk;
    private OnCustomRenderedAdLoadedListener zzcjl;
    private OnPaidEventListener zzcjo;
    private RewardedVideoAdListener zzcjt;
    private boolean zzcju;
    private final Context zzvr;

    public zzys(Context context) {
        this(context, zzvh.zzchm, null);
    }

    public zzys(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzvh.zzchm, publisherInterstitialAd);
    }

    private zzys(Context context, zzvh zzvhVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.zzbuq = new zzamr();
        this.zzvr = context;
        this.zzacs = zzvhVar;
    }

    public final AdListener getAdListener() {
        return this.zzcgu;
    }

    public final String getAdUnitId() {
        return this.zzbuo;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbnw;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcjl;
    }

    public final boolean isLoaded() {
        try {
            if (this.zzbun == null) {
                return false;
            }
            return this.zzbun.isReady();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbun == null) {
                return false;
            }
            return this.zzbun.isLoading();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void zza(zzyo zzyoVar) {
        try {
            if (this.zzbun == null) {
                if (this.zzbuo == null) {
                    zzcr("loadAd");
                }
                zzvj zzpj = this.zzcju ? zzvj.zzpj() : new zzvj();
                zzvr zzpr = zzwe.zzpr();
                Context context = this.zzvr;
                zzwu zzd = new zzvz(zzpr, context, zzpj, this.zzbuo, this.zzbuq).zzd(context, false);
                this.zzbun = zzd;
                if (this.zzcgu != null) {
                    zzd.zza(new zzuy(this.zzcgu));
                }
                if (this.zzcgq != null) {
                    this.zzbun.zza(new zzuv(this.zzcgq));
                }
                if (this.zzchk != null) {
                    this.zzbun.zza(new zzvd(this.zzchk));
                }
                if (this.zzbnw != null) {
                    this.zzbun.zza(new zzvn(this.zzbnw));
                }
                if (this.zzcjl != null) {
                    this.zzbun.zza(new zzabr(this.zzcjl));
                }
                if (this.zzcjt != null) {
                    this.zzbun.zza(new zzatw(this.zzcjt));
                }
                this.zzbun.zza(new zzzt(this.zzcjo));
                this.zzbun.setImmersiveMode(this.zzbox);
            }
            if (this.zzbun.zza(zzvh.zza(this.zzvr, zzyoVar))) {
                this.zzbuq.zzf(zzyoVar.zzqn());
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        try {
            this.zzcgu = adListener;
            if (this.zzbun != null) {
                this.zzbun.zza(adListener != null ? new zzuy(adListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zza(zzut zzutVar) {
        try {
            this.zzcgq = zzutVar;
            if (this.zzbun != null) {
                this.zzbun.zza(zzutVar != null ? new zzuv(zzutVar) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdUnitId(String str) {
        if (this.zzbuo != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.zzbuo = str;
    }

    public final void setAdMetadataListener(AdMetadataListener adMetadataListener) {
        try {
            this.zzchk = adMetadataListener;
            if (this.zzbun != null) {
                this.zzbun.zza(adMetadataListener != null ? new zzvd(adMetadataListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final Bundle getAdMetadata() {
        try {
            if (this.zzbun != null) {
                return this.zzbun.getAdMetadata();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbnw = appEventListener;
            if (this.zzbun != null) {
                this.zzbun.zza(appEventListener != null ? new zzvn(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.zzcjl = onCustomRenderedAdLoadedListener;
            if (this.zzbun != null) {
                this.zzbun.zza(onCustomRenderedAdLoadedListener != null ? new zzabr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setRewardedVideoAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.zzcjt = rewardedVideoAdListener;
            if (this.zzbun != null) {
                this.zzbun.zza(rewardedVideoAdListener != null ? new zzatw(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void zzd(boolean z) {
        this.zzcju = true;
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbun != null) {
                return this.zzbun.zzkf();
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyf zzyfVar = null;
        try {
            if (this.zzbun != null) {
                zzyfVar = this.zzbun.zzkg();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzyfVar);
    }

    public final void show() {
        try {
            zzcr("show");
            this.zzbun.showInterstitial();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setImmersiveMode(boolean z) {
        try {
            this.zzbox = z;
            if (this.zzbun != null) {
                this.zzbun.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzcjo = onPaidEventListener;
            if (this.zzbun != null) {
                this.zzbun.zza(new zzzt(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    private final void zzcr(String str) {
        if (this.zzbun != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }
}
