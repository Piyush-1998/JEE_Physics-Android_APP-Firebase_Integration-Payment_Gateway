package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzanq extends zzamy {
    private final Object zzdkn;
    private zzanr zzdko;
    private zzaua zzdkp;
    private IObjectWrapper zzdkq;
    private MediationRewardedAd zzdkr;

    public zzanq(MediationAdapter mediationAdapter) {
        this.zzdkn = mediationAdapter;
    }

    public zzanq(Adapter adapter) {
        this.zzdkn = adapter;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final IObjectWrapper zzto() throws RemoteException {
        Object obj = this.zzdkn;
        if (!(obj instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) obj).getBannerView());
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        zza(iObjectWrapper, zzvjVar, zzvcVar, str, null, zzanaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, zzvc zzvcVar, String str, String str2, zzana zzanaVar) throws RemoteException {
        AdSize zza;
        if (!(this.zzdkn instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdkn;
            zzann zzannVar = new zzann(zzvcVar.zzcgv == -1 ? null : new Date(zzvcVar.zzcgv), zzvcVar.zzcgw, zzvcVar.zzcgx != null ? new HashSet(zzvcVar.zzcgx) : null, zzvcVar.zznb, zzc(zzvcVar), zzvcVar.zzadj, zzvcVar.zzchh, zzvcVar.zzadk, zza(str, zzvcVar));
            Bundle bundle = zzvcVar.zzchc != null ? zzvcVar.zzchc.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            if (zzvjVar.zzchu) {
                zza = com.google.android.gms.ads.zzb.zza(zzvjVar.width, zzvjVar.height);
            } else {
                zza = com.google.android.gms.ads.zzb.zza(zzvjVar.width, zzvjVar.height, zzvjVar.zzacx);
            }
            mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzanr(zzanaVar), zza(str, zzvcVar, str2), zza, zzannVar, bundle);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle zztr() {
        Object obj = this.zzdkn;
        if (!(obj instanceof zzbig)) {
            String canonicalName = zzbig.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            return new Bundle();
        }
        return ((zzbig) obj).zztr();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        zza(iObjectWrapper, zzvcVar, str, (String) null, zzanaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar) throws RemoteException {
        if (!(this.zzdkn instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzdkn;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzanr(zzanaVar), zza(str, zzvcVar, str2), new zzann(zzvcVar.zzcgv == -1 ? null : new Date(zzvcVar.zzcgv), zzvcVar.zzcgw, zzvcVar.zzcgx != null ? new HashSet(zzvcVar.zzcgx) : null, zzvcVar.zznb, zzc(zzvcVar), zzvcVar.zzadj, zzvcVar.zzchh, zzvcVar.zzadk, zza(str, zzvcVar)), zzvcVar.zzchc != null ? zzvcVar.zzchc.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.zzdkn;
        if (!(obj instanceof zzbif)) {
            String canonicalName = zzbif.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            return new Bundle();
        }
        return ((zzbif) obj).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar, zzadm zzadmVar, List<String> list) throws RemoteException {
        Object obj = this.zzdkn;
        if (!(obj instanceof MediationNativeAdapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
            zzanv zzanvVar = new zzanv(zzvcVar.zzcgv == -1 ? null : new Date(zzvcVar.zzcgv), zzvcVar.zzcgw, zzvcVar.zzcgx != null ? new HashSet(zzvcVar.zzcgx) : null, zzvcVar.zznb, zzc(zzvcVar), zzvcVar.zzadj, zzadmVar, list, zzvcVar.zzchh, zzvcVar.zzadk, zza(str, zzvcVar));
            Bundle bundle = zzvcVar.zzchc != null ? zzvcVar.zzchc.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.zzdko = new zzanr(zzanaVar);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.unwrap(iObjectWrapper), this.zzdko, zza(str, zzvcVar, str2), zzanvVar, bundle);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle zzts() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzand zztp() {
        NativeAdMapper zzuc = this.zzdko.zzuc();
        if (zzuc instanceof NativeAppInstallAdMapper) {
            return new zzant((NativeAppInstallAdMapper) zzuc);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzanj zztv() {
        UnifiedNativeAdMapper zzud = this.zzdko.zzud();
        if (zzud != null) {
            return new zzaol(zzud);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzani zztq() {
        NativeAdMapper zzuc = this.zzdko.zzuc();
        if (zzuc instanceof NativeContentAdMapper) {
            return new zzanw((NativeContentAdMapper) zzuc);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzaes zztu() {
        NativeCustomTemplateAd zzue = this.zzdko.zzue();
        if (zzue instanceof zzaet) {
            return ((zzaet) zzue).zzsp();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final boolean zztt() {
        return this.zzdkn instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzaua zzauaVar, String str2) throws RemoteException {
        zzann zzannVar;
        Bundle bundle;
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdkn;
                Bundle zza = zza(str2, zzvcVar, (String) null);
                if (zzvcVar != null) {
                    zzann zzannVar2 = new zzann(zzvcVar.zzcgv == -1 ? null : new Date(zzvcVar.zzcgv), zzvcVar.zzcgw, zzvcVar.zzcgx != null ? new HashSet(zzvcVar.zzcgx) : null, zzvcVar.zznb, zzc(zzvcVar), zzvcVar.zzadj, zzvcVar.zzchh, zzvcVar.zzadk, zza(str2, zzvcVar));
                    bundle = zzvcVar.zzchc != null ? zzvcVar.zzchc.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzannVar = zzannVar2;
                } else {
                    zzannVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzannVar, str, new zzauf(zzauaVar), zza, bundle);
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        } else {
            this.zzdkq = iObjectWrapper;
            this.zzdkp = zzauaVar;
            zzauaVar.zzaf(ObjectWrapper.wrap(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzaua zzauaVar, List<String> list) throws RemoteException {
        if (!(this.zzdkn instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        zzbbd.zzef("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzdkn;
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(zza(str, (zzvc) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), new zzauf(zzauaVar), arrayList);
        } catch (Throwable th) {
            zzbbd.zzd("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(zzvc zzvcVar, String str) throws RemoteException {
        zza(zzvcVar, str, (String) null);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(zzvc zzvcVar, String str, String str2) throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzdkn;
                mediationRewardedVideoAdAdapter.loadAd(new zzann(zzvcVar.zzcgv == -1 ? null : new Date(zzvcVar.zzcgv), zzvcVar.zzcgw, zzvcVar.zzcgx != null ? new HashSet(zzvcVar.zzcgx) : null, zzvcVar.zznb, zzc(zzvcVar), zzvcVar.zzadj, zzvcVar.zzchh, zzvcVar.zzadk, zza(str, zzvcVar)), zza(str, zzvcVar, str2), zzvcVar.zzchc != null ? zzvcVar.zzchc.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        } else {
            zzb(this.zzdkq, zzvcVar, str, new zzanu((Adapter) this.zzdkn, this.zzdkp));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void showVideo() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.zzdkn).showVideo();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (!(obj instanceof Adapter)) {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        } else {
            MediationRewardedAd mediationRewardedAd = this.zzdkr;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(this.zzdkq));
            } else {
                zzbbd.zzfc("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final boolean isInitialized() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbbd.zzef("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.zzdkn).isInitialized();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return this.zzdkp != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        if (!(this.zzdkn instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting rewarded ad from adapter.");
        try {
            ((Adapter) this.zzdkn).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza(str, zzvcVar, (String) null), zzd(zzvcVar), zzc(zzvcVar), zzvcVar.zznb, zzvcVar.zzadj, zzvcVar.zzadk, zza(str, zzvcVar), ""), zza(zzanaVar));
        } catch (Exception e) {
            zzbbd.zzc("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzc(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        if (!(this.zzdkn instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting rewarded interstitial ad from adapter.");
        try {
            ((Adapter) this.zzdkn).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), "", zza(str, zzvcVar, (String) null), zzd(zzvcVar), zzc(zzvcVar), zzvcVar.zznb, zzvcVar.zzadj, zzvcVar.zzadk, zza(str, zzvcVar), ""), zza(zzanaVar));
        } catch (Exception e) {
            zzbbd.zzc("", e);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (!(this.zzdkn instanceof Adapter)) {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        zzbbd.zzef("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.zzdkr;
        if (mediationRewardedAd != null) {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
        } else {
            zzbbd.zzfc("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.zzdkn;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzef(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzyg getVideoController() {
        Object obj = this.zzdkn;
        if (obj instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) obj).getVideoController();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void showInterstitial() throws RemoteException {
        if (!(this.zzdkn instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.zzdkn.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbbd.zzfe(sb.toString());
            throw new RemoteException();
        }
        zzbbd.zzef("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdkn).showInterstitial();
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void destroy() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void pause() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void resume() throws RemoteException {
        Object obj = this.zzdkn;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzbbd.zzc("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        Object obj = this.zzdkn;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzaih zzaihVar, List<zzaip> list) throws RemoteException {
        AdFormat adFormat;
        if (!(this.zzdkn instanceof Adapter)) {
            throw new RemoteException();
        }
        zzanp zzanpVar = new zzanp(this, zzaihVar);
        ArrayList arrayList = new ArrayList();
        for (zzaip zzaipVar : list) {
            String str = zzaipVar.zzdfi;
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
                throw new RemoteException();
            }
            arrayList.add(new MediationConfiguration(adFormat, zzaipVar.extras));
        }
        ((Adapter) this.zzdkn).initialize((Context) ObjectWrapper.unwrap(iObjectWrapper), zzanpVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzapo zztw() {
        Object obj = this.zzdkn;
        if (obj instanceof Adapter) {
            return zzapo.zza(((Adapter) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzapo zztx() {
        Object obj = this.zzdkn;
        if (obj instanceof Adapter) {
            return zzapo.zza(((Adapter) obj).getSDKVersionInfo());
        }
        return null;
    }

    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> zza(zzana zzanaVar) {
        return new zzans(this, zzanaVar);
    }

    private final Bundle zza(String str, zzvc zzvcVar, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbbd.zzef(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
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
                bundle = bundle2;
            }
            if (this.zzdkn instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzvcVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzvcVar.zzadj);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbbd.zzc("", th);
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
        return (zzvcVar.zzchc == null || (bundle = zzvcVar.zzchc.getBundle(this.zzdkn.getClass().getName())) == null) ? new Bundle() : bundle;
    }
}
