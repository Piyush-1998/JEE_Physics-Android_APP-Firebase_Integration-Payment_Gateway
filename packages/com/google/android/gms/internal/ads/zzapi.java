package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzapi implements MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> {
    private final /* synthetic */ zzana zzdlp;
    private final /* synthetic */ zzaoo zzdlr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapi(zzapf zzapfVar, zzaoo zzaooVar, zzana zzanaVar) {
        this.zzdlr = zzaooVar;
        this.zzdlp = zzanaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationBannerAdCallback onSuccess(MediationBannerAd mediationBannerAd) {
        if (mediationBannerAd == null) {
            zzbbd.zzfe("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdlr.zzdq("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdlr.zzx(ObjectWrapper.wrap(mediationBannerAd.getView()));
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
        }
        return new zzapl(this.zzdlp);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdlr.zzdq(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
