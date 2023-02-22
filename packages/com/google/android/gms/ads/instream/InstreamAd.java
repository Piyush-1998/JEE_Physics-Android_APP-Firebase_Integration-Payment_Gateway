package com.google.android.gms.ads.instream;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzajd;
import com.google.android.gms.internal.ads.zzaji;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class InstreamAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static abstract class InstreamAdLoadCallback {
        @Deprecated
        public void onInstreamAdFailedToLoad(int i) {
        }

        public void onInstreamAdFailedToLoad(LoadAdError loadAdError) {
        }

        public void onInstreamAdLoaded(InstreamAd instreamAd) {
        }
    }

    public abstract void destroy();

    @Deprecated
    public abstract float getAspectRatio();

    public abstract MediaContent getMediaContent();

    @Deprecated
    public abstract VideoController getVideoController();

    @Deprecated
    public abstract float getVideoCurrentTime();

    @Deprecated
    public abstract float getVideoDuration();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zza(InstreamAdView instreamAdView);

    public static void load(Context context, String str, AdRequest adRequest, int i, InstreamAdLoadCallback instreamAdLoadCallback) {
        Preconditions.checkArgument(i == 2 || i == 3, "Instream ads only support Landscape and Portrait media aspect ratios");
        new zzaji(context, str).zza(instreamAdLoadCallback).zza(new zzajd(i)).zztc().loadAd(adRequest);
    }

    public static void load(Context context, String str, InstreamAdLoadCallback instreamAdLoadCallback) {
        new zzaji(context, "").zza(instreamAdLoadCallback).zza(new zzajd(str)).zztc().loadAd(new PublisherAdRequest.Builder().build());
    }
}
