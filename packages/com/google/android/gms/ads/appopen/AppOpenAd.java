package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzsj;
import com.google.android.gms.internal.ads.zzsn;
import com.google.android.gms.internal.ads.zzwu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static abstract class AppOpenAdLoadCallback {
        @Deprecated
        public void onAppOpenAdFailedToLoad(int i) {
        }

        public void onAppOpenAdFailedToLoad(LoadAdError loadAdError) {
        }

        public void onAppOpenAdLoaded(AppOpenAd appOpenAd) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public @interface AppOpenAdOrientation {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zza(zzsj zzsjVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzwu zzdu();

    public static void load(Context context, String str, AdRequest adRequest, int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        new zzsn(context, str, adRequest.zzdp(), i, appOpenAdLoadCallback).zzms();
    }

    public static void load(Context context, String str, PublisherAdRequest publisherAdRequest, int i, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(publisherAdRequest, "PublisherAdRequest cannot be null.");
        new zzsn(context, str, publisherAdRequest.zzdp(), i, appOpenAdLoadCallback).zzms();
    }
}
