package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzse extends zzsm {
    private final AppOpenAdPresentationCallback zzbum;

    public zzse(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.zzbum = appOpenAdPresentationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void onAppOpenAdClosed() {
        this.zzbum.onAppOpenAdClosed();
    }
}
