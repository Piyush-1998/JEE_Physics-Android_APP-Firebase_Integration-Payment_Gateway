package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagj extends zzafu {
    private final UnifiedNativeAd.UnconfirmedClickListener zzddt;

    public zzagj(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zzddt = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final void onUnconfirmedClickReceived(String str) {
        this.zzddt.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzafr
    public final void onUnconfirmedClickCancelled() {
        this.zzddt.onUnconfirmedClickCancelled();
    }
}
