package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagk extends zzafo {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zzddu;

    public zzagk(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zzddu = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zza(zzafw zzafwVar) {
        this.zzddu.onUnifiedNativeAdLoaded(new zzafx(zzafwVar));
    }
}
