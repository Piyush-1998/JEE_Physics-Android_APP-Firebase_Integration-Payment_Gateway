package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxm implements zzbsu, zzbsz, zzbtm, zzbuj, zzut {
    private zzwl zzgqn;

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zzb(zzatj zzatjVar, String str, String str2) {
    }

    public final synchronized void zzc(zzwl zzwlVar) {
        this.zzgqn = zzwlVar;
    }

    public final synchronized zzwl zzaqc() {
        return this.zzgqn;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final synchronized void onAdClosed() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdClosed();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdClosed.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final synchronized void zzg(zzuw zzuwVar) {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdFailedToLoad(zzuwVar.errorCode);
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdFailedToLoad.", e);
            }
            try {
                this.zzgqn.zzb(zzuwVar);
            } catch (RemoteException e2) {
                zzaxy.zzd("Remote Exception at onAdFailedToLoadWithAdError.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final synchronized void onAdLeftApplication() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdLeftApplication();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final synchronized void onAdLoaded() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdLoaded();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final synchronized void onAdOpened() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdOpened();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdOpened.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final synchronized void onAdClicked() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdClicked();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final synchronized void onAdImpression() {
        if (this.zzgqn != null) {
            try {
                this.zzgqn.onAdImpression();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdImpression.", e);
            }
        }
    }
}
