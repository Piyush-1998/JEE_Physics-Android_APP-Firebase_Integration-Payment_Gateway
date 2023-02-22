package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzapk implements MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> {
    private final /* synthetic */ zzana zzdlp;
    private final /* synthetic */ zzaou zzdlt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapk(zzapf zzapfVar, zzaou zzaouVar, zzana zzanaVar) {
        this.zzdlt = zzaouVar;
        this.zzdlp = zzanaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    /* renamed from: zza */
    public final MediationNativeAdCallback onSuccess(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        if (unifiedNativeAdMapper == null) {
            zzbbd.zzfe("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zzdlt.zzdq("Adapter returned null.");
                return null;
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
                return null;
            }
        }
        try {
            this.zzdlt.zza(new zzaol(unifiedNativeAdMapper));
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
        }
        return new zzapl(this.zzdlp);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        try {
            this.zzdlt.zzdq(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
