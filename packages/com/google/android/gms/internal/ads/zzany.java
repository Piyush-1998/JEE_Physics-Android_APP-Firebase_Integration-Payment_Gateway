package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzany<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzamy {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzdle;
    private final NETWORK_EXTRAS zzdlf;

    public zzany(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzdle = mediationAdapter;
        this.zzdlf = network_extras;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzyg getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzaih zzaihVar, List<zzaip> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzaua zzauaVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzaua zzauaVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar, zzadm zzadmVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(zzvc zzvcVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(zzvc zzvcVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzc(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzand zztp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzani zztq() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final boolean zztt() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzaes zztu() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzanj zztv() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzapo zztw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzapo zztx() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final IObjectWrapper zzto() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return ObjectWrapper.wrap(((MediationBannerAdapter) mediationAdapter).getBannerView());
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
        AdSize adSize;
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzdle;
            zzanx zzanxVar = new zzanx(zzanaVar);
            Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
            SERVER_PARAMETERS zzdp = zzdp(str);
            int i = 0;
            AdSize[] adSizeArr = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
            while (true) {
                if (i < 6) {
                    if (adSizeArr[i].getWidth() == zzvjVar.width && adSizeArr[i].getHeight() == zzvjVar.height) {
                        adSize = adSizeArr[i];
                        break;
                    }
                    i++;
                } else {
                    adSize = new AdSize(com.google.android.gms.ads.zzb.zza(zzvjVar.width, zzvjVar.height, zzvjVar.zzacx));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(zzanxVar, activity, zzdp, adSize, zzaoj.zza(zzvcVar, zzc(zzvcVar)), this.zzdlf);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle zztr() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        zza(iObjectWrapper, zzvcVar, str, (String) null, zzanaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar) throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzef("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdle).requestInterstitialAd(new zzanx(zzanaVar), (Activity) ObjectWrapper.unwrap(iObjectWrapper), zzdp(str), zzaoj.zza(zzvcVar, zzc(zzvcVar)), this.zzdlf);
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void showInterstitial() throws RemoteException {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzdle;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzbbd.zzfe(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzbbd.zzef("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzdle).showInterstitial();
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
    public final void destroy() throws RemoteException {
        try {
            this.zzdle.destroy();
        } catch (Throwable th) {
            zzbbd.zzc("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void resume() throws RemoteException {
        throw new RemoteException();
    }

    private final SERVER_PARAMETERS zzdp(String str) throws RemoteException {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zzdle.getServerParametersType();
            if (serverParametersType != null) {
                SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
                newInstance.load(hashMap);
                return newInstance;
            }
            return null;
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
}
