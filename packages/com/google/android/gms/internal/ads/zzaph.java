package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzaph implements MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> {
    private final /* synthetic */ zzaop zzdlo;
    private final /* synthetic */ zzana zzdlp;
    private final /* synthetic */ zzapf zzdlq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaph(zzapf zzapfVar, zzaop zzaopVar, zzana zzanaVar) {
        this.zzdlq = zzapfVar;
        this.zzdlo = zzaopVar;
        this.zzdlp = zzanaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationInterstitialAdCallback onSuccess(MediationInterstitialAd mediationInterstitialAd) {
        if (mediationInterstitialAd == null) {
            zzbbd.zzfe("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdlo.zzdq("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdlq.zzdlm = mediationInterstitialAd;
            this.zzdlo.zzuh();
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
        }
        return new zzapl(this.zzdlp);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdlo.zzdq(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
