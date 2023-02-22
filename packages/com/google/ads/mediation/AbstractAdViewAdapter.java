package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.internal.ads.zzbat;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzut;
import com.google.android.gms.internal.ads.zzwe;
import com.google.android.gms.internal.ads.zzyg;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, com.google.android.gms.ads.mediation.zza, MediationRewardedVideoAdAdapter, zzbif {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzmi;
    private InterstitialAd zzmj;
    private AdLoader zzmk;
    private Context zzml;
    private InterstitialAd zzmm;
    private MediationRewardedVideoAdListener zzmn;
    private final RewardedVideoAdListener zzmo = new com.google.ads.mediation.zzb(this);

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);

    private final AdRequest zza(Context context, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String str : keywords) {
                builder.addKeyword(str);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzwe.zzpq();
            builder.addTestDevice(zzbat.zzbm(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.tagForChildDirectedTreatment(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zzc extends AdListener implements AppEventListener, zzut {
        private final AbstractAdViewAdapter zzms;
        private final com.google.android.gms.ads.mediation.MediationBannerListener zzmt;

        public zzc(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener) {
            this.zzms = abstractAdViewAdapter;
            this.zzmt = mediationBannerListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.zzmt.onAdLoaded(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzmt.onAdFailedToLoad(this.zzms, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzmt.onAdOpened(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzmt.onAdClosed(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzmt.onAdLeftApplication(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzut
        public final void onAdClicked() {
            this.zzmt.onAdClicked(this.zzms);
        }

        @Override // com.google.android.gms.ads.doubleclick.AppEventListener
        public final void onAppEvent(String str, String str2) {
            this.zzmt.zza(this.zzms, str, str2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zzf extends AdListener implements zzut {
        private final AbstractAdViewAdapter zzms;
        private final com.google.android.gms.ads.mediation.MediationInterstitialListener zzmw;

        public zzf(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener) {
            this.zzms = abstractAdViewAdapter;
            this.zzmw = mediationInterstitialListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            this.zzmw.onAdLoaded(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzmw.onAdFailedToLoad(this.zzms, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzmw.onAdOpened(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzmw.onAdClosed(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzmw.onAdLeftApplication(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzut
        public final void onAdClicked() {
            this.zzmw.onAdClicked(this.zzms);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zze extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {
        private final AbstractAdViewAdapter zzms;
        private final MediationNativeListener zzmv;

        public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.zzms = abstractAdViewAdapter;
            this.zzmv = mediationNativeListener;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(int i) {
            this.zzmv.onAdFailedToLoad(this.zzms, i);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            this.zzmv.onAdOpened(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
            this.zzmv.onAdClosed(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLeftApplication() {
            this.zzmv.onAdLeftApplication(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.internal.ads.zzut
        public final void onAdClicked() {
            this.zzmv.onAdClicked(this.zzms);
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdImpression() {
            this.zzmv.onAdImpression(this.zzms);
        }

        @Override // com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.zzmv.onAdLoaded(this.zzms, new zzb(nativeAppInstallAd));
        }

        @Override // com.google.android.gms.ads.formats.UnifiedNativeAd.OnUnifiedNativeAdLoadedListener
        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.zzmv.onAdLoaded(this.zzms, new zzd(unifiedNativeAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.zzmv.onAdLoaded(this.zzms, new zza(nativeContentAd));
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener
        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.zzmv.zza(this.zzms, nativeCustomTemplateAd);
        }

        @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.OnCustomClickListener
        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.zzmv.zza(this.zzms, nativeCustomTemplateAd, str);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static class zza extends NativeContentAdMapper {
        private final NativeContentAd zzmq;

        public zza(NativeContentAd nativeContentAd) {
            this.zzmq = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzmq);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnq.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzmq);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static class zzd extends UnifiedNativeAdMapper {
        private final UnifiedNativeAd zzmu;

        public zzd(UnifiedNativeAd unifiedNativeAd) {
            this.zzmu = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzn(unifiedNativeAd.zzjv());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.zzmu);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnq.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzmu);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static class zzb extends NativeAppInstallAdMapper {
        private final NativeAppInstallAd zzmr;

        public zzb(NativeAppInstallAd nativeAppInstallAd) {
            this.zzmr = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        @Override // com.google.android.gms.ads.mediation.NativeAdMapper
        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.zzmr);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbnq.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.zzmr);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.destroy();
            this.zzmi = null;
        }
        if (this.zzmj != null) {
            this.zzmj = null;
        }
        if (this.zzmk != null) {
            this.zzmk = null;
        }
        if (this.zzmm != null) {
            this.zzmm = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.resume();
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzmi = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzmi.setAdUnitId(getAdUnitId(bundle));
        this.zzmi.setAdListener(new zzc(this, mediationBannerListener));
        this.zzmi.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzmi;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.MediationInterstitialListener mediationInterstitialListener, Bundle bundle, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzmj = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzmj.setAdListener(new zzf(this, mediationInterstitialListener));
        this.zzmj.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzmj;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzmm;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.zza
    public zzyg getVideoController() {
        VideoController videoController;
        AdView adView = this.zzmi;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdt();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzmj.show();
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdv(1).zzadc();
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        zze zzeVar = new zze(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(zzeVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(zzeVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(zzeVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(zzeVar);
        }
        if (nativeMediationAdRequest.zzuf()) {
            for (String str : nativeMediationAdRequest.zzug().keySet()) {
                withAdListener.forCustomTemplateAd(str, zzeVar, nativeMediationAdRequest.zzug().get(str).booleanValue() ? zzeVar : null);
            }
        }
        AdLoader build = withAdListener.build();
        this.zzmk = build;
        build.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzml = context.getApplicationContext();
        this.zzmn = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.zzml == null || this.zzmn == null) {
            zzbbd.zzfc("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(this.zzml);
        this.zzmm = interstitialAd;
        interstitialAd.zzd(true);
        this.zzmm.setAdUnitId(getAdUnitId(bundle));
        this.zzmm.setRewardedVideoAdListener(this.zzmo);
        this.zzmm.setAdMetadataListener(new com.google.ads.mediation.zza(this));
        this.zzmm.loadAd(zza(this.zzml, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzmm.show();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzmn != null;
    }
}
