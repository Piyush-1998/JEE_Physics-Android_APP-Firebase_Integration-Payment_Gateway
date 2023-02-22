package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzapp implements com.google.android.gms.ads.internal.overlay.zzo {
    private final /* synthetic */ zzapq zzdlx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapp(zzapq zzapqVar) {
        this.zzdlx = zzapqVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzui() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbbd.zzef("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.zzdlx.zzdlz;
        mediationInterstitialListener.onAdClosed(this.zzdlx);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        zzbbd.zzef("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        zzbbd.zzef("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzuj() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbbd.zzef("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.zzdlx.zzdlz;
        mediationInterstitialListener.onAdOpened(this.zzdlx);
    }
}
