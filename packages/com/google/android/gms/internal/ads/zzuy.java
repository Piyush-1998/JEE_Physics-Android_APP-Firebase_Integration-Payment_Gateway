package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzuy extends zzwk {
    private final AdListener zzcgu;

    public zzuy(AdListener adListener) {
        this.zzcgu = adListener;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void onAdClosed() {
        this.zzcgu.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void onAdFailedToLoad(int i) {
        this.zzcgu.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzb(zzuw zzuwVar) {
        this.zzcgu.onAdFailedToLoad(zzuwVar.zzpg());
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void onAdLeftApplication() {
        this.zzcgu.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void onAdLoaded() {
        this.zzcgu.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void onAdOpened() {
        this.zzcgu.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void onAdClicked() {
        this.zzcgu.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void onAdImpression() {
        this.zzcgu.onAdImpression();
    }

    public final AdListener getAdListener() {
        return this.zzcgu;
    }
}
