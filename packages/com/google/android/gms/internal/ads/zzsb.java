package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsb extends zzsh {
    private final WeakReference<AppOpenAd.AppOpenAdLoadCallback> zzbul;

    public zzsb(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzbul = new WeakReference<>(appOpenAdLoadCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zza(zzsd zzsdVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zzbul.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(new zzso(zzsdVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void onAppOpenAdFailedToLoad(int i) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zzbul.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zza(zzuw zzuwVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zzbul.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(zzuwVar.zzpg());
        }
    }
}
