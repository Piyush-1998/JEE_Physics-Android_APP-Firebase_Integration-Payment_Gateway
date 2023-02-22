package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzapm implements MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> {
    private final /* synthetic */ zzana zzdlp;
    private final /* synthetic */ zzapf zzdlq;
    private final /* synthetic */ zzaov zzdlv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapm(zzapf zzapfVar, zzaov zzaovVar, zzana zzanaVar) {
        this.zzdlq = zzapfVar;
        this.zzdlv = zzaovVar;
        this.zzdlp = zzanaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationRewardedAdCallback onSuccess(MediationRewardedAd mediationRewardedAd) {
        if (mediationRewardedAd == null) {
            zzbbd.zzfe("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdlv.zzdq("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdlq.zzdkr = mediationRewardedAd;
            this.zzdlv.zzuh();
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
        }
        return new zzapl(this.zzdlp);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdlv.zzdq(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
