package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcso extends zzamz implements zzbuc {
    private zzana zzdlu;
    private zzbuf zzgmc;

    public final synchronized void zzb(zzana zzanaVar) {
        this.zzdlu = zzanaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final synchronized void zza(zzbuf zzbufVar) {
        this.zzgmc = zzbufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAdClicked() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAdClosed() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdFailedToLoad(i);
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzc(int i, String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzc(i, str);
        }
        if (this.zzgmc != null) {
            this.zzgmc.zzf(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzb(zzuw zzuwVar) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzb(zzuwVar);
        }
        if (this.zzgmc != null) {
            this.zzgmc.zzg(zzuwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAdOpened() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdLoaded();
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zza(zzanb zzanbVar) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zza(zzanbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAdImpression() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onAppEvent(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zza(zzaes zzaesVar, String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zza(zzaesVar, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onVideoEnd() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onVideoEnd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzdn(String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzdn(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzty() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzty();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onVideoPlay();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzb(zzaue zzaueVar) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzb(zzaueVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void onVideoPause() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.onVideoPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzb(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zztz() throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zztz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzdd(int i) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzdd(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zzdo(String str) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zzdo(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final synchronized void zza(zzaug zzaugVar) throws RemoteException {
        if (this.zzdlu != null) {
            this.zzdlu.zza(zzaugVar);
        }
    }
}
