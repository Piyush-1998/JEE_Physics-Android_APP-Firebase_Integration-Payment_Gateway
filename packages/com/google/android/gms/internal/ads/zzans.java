package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzans implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzana zzdkw;
    private final /* synthetic */ zzanq zzdkx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzans(zzanq zzanqVar, zzana zzanaVar) {
        this.zzdkx = zzanqVar;
        this.zzdkw = zzanaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        try {
            this.zzdkx.zzdkr = mediationRewardedAd;
            this.zzdkw.onAdLoaded();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
        return new zzave(this.zzdkw);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzdkx.zzdkn;
            String canonicalName = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            zzbbd.zzef(sb.toString());
            this.zzdkw.zzc(0, str);
            this.zzdkw.onAdFailedToLoad(0);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
