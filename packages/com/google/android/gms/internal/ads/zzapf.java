package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzapf extends zzaoz {
    private MediationRewardedAd zzdkr;
    private final RtbAdapter zzdll;
    private MediationInterstitialAd zzdlm;
    private String zzdln = "";

    public zzapf(RtbAdapter rtbAdapter) {
        this.zzdll = rtbAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzy(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaoo zzaooVar, zzana zzanaVar, zzvj zzvjVar) throws RemoteException {
        try {
            this.zzdll.loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvcVar), zzc(zzvcVar), zzvcVar.zznb, zzvcVar.zzadj, zzvcVar.zzadk, zza(str2, zzvcVar), com.google.android.gms.ads.zzb.zza(zzvjVar.width, zzvjVar.height, zzvjVar.zzacx), this.zzdln), new zzapi(this, zzaooVar, zzanaVar));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzana zzanaVar) throws RemoteException {
        try {
            this.zzdll.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvcVar), zzc(zzvcVar), zzvcVar.zznb, zzvcVar.zzadj, zzvcVar.zzadk, zza(str2, zzvcVar), this.zzdln), new zzaph(this, zzaopVar, zzanaVar));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaov zzaovVar, zzana zzanaVar) throws RemoteException {
        try {
            this.zzdll.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvcVar), zzc(zzvcVar), zzvcVar.zznb, zzvcVar.zzadj, zzvcVar.zzadk, zza(str2, zzvcVar), this.zzdln), zza(zzaovVar, zzanaVar));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzb(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaov zzaovVar, zzana zzanaVar) throws RemoteException {
        try {
            this.zzdll.loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvcVar), zzc(zzvcVar), zzvcVar.zznb, zzvcVar.zzadj, zzvcVar.zzadk, zza(str2, zzvcVar), this.zzdln), zza(zzaovVar, zzanaVar));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaou zzaouVar, zzana zzanaVar) throws RemoteException {
        try {
            this.zzdll.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzdt(str2), zzd(zzvcVar), zzc(zzvcVar), zzvcVar.zznb, zzvcVar.zzadj, zzvcVar.zzadk, zza(str2, zzvcVar), this.zzdln), new zzapk(this, zzaouVar, zzanaVar));
        } catch (Throwable th) {
            zzbbd.zzc("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzdlm;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzdkr;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzyg getVideoController() {
        RtbAdapter rtbAdapter = this.zzdll;
        if (rtbAdapter instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvj zzvjVar, zzapb zzapbVar) throws RemoteException {
        AdFormat adFormat;
        try {
            zzapj zzapjVar = new zzapj(this, zzapbVar);
            RtbAdapter rtbAdapter = this.zzdll;
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c == 3) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zza(zzvjVar.width, zzvjVar.height, zzvjVar.zzacx)), zzapjVar);
        } catch (Throwable th) {
            zzbbd.zzc("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzapo zztw() throws RemoteException {
        return zzapo.zza(this.zzdll.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzapo zztx() throws RemoteException {
        return zzapo.zza(this.zzdll.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzdr(String str) {
        this.zzdln = str;
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzaov zzaovVar, zzana zzanaVar) {
        return new zzapm(this, zzaovVar, zzanaVar);
    }

    private static Bundle zzdt(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbbd.zzfe(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            zzbbd.zzc("", e);
            throw new RemoteException();
        }
    }

    private static boolean zzc(zzvc zzvcVar) {
        if (zzvcVar.zzcgy) {
            return true;
        }
        zzwe.zzpq();
        return zzbat.zzym();
    }

    private static String zza(String str, zzvc zzvcVar) {
        String str2 = zzvcVar.zzadl;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private final Bundle zzd(zzvc zzvcVar) {
        Bundle bundle;
        return (zzvcVar.zzchc == null || (bundle = zzvcVar.zzchc.getBundle(this.zzdll.getClass().getName())) == null) ? new Bundle() : bundle;
    }
}
