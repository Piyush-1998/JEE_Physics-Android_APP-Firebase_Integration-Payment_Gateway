package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzyv {
    private static zzyv zzcjy;
    private zzxk zzcjz;
    private RewardedVideoAd zzcka;
    private InitializationStatus zzckc;
    private final Object lock = new Object();
    private boolean zzxi = false;
    private RequestConfiguration zzckb = new RequestConfiguration.Builder().build();

    private zzyv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public class zza extends zzail {
        private final OnInitializationCompleteListener zzcke;

        private zza(OnInitializationCompleteListener onInitializationCompleteListener) {
            this.zzcke = onInitializationCompleteListener;
        }

        @Override // com.google.android.gms.internal.ads.zzaim
        public final void zze(List<zzaif> list) throws RemoteException {
            OnInitializationCompleteListener onInitializationCompleteListener = this.zzcke;
            zzyv zzyvVar = zzyv.this;
            onInitializationCompleteListener.onInitializationComplete(zzyv.zzd(list));
        }

        /* synthetic */ zza(zzyv zzyvVar, OnInitializationCompleteListener onInitializationCompleteListener, zzyy zzyyVar) {
            this(onInitializationCompleteListener);
        }
    }

    public static zzyv zzqt() {
        zzyv zzyvVar;
        synchronized (zzyv.class) {
            if (zzcjy == null) {
                zzcjy = new zzyv();
            }
            zzyvVar = zzcjy;
        }
        return zzyvVar;
    }

    public final void zza(final Context context, String str, final OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.lock) {
            if (this.zzxi) {
                return;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                zzamm.zztn().zzd(context, str);
                zzg(context);
                this.zzxi = true;
                if (onInitializationCompleteListener != null) {
                    this.zzcjz.zza(new zza(this, onInitializationCompleteListener, null));
                }
                this.zzcjz.zza(new zzamr());
                this.zzcjz.initialize();
                this.zzcjz.zza(str, ObjectWrapper.wrap(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.zzyu
                    private final zzyv zzcjw;
                    private final Context zzcjx;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzcjw = this;
                        this.zzcjx = context;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzcjw.getRewardedVideoAdInstance(this.zzcjx);
                    }
                }));
                if (this.zzckb.getTagForChildDirectedTreatment() != -1 || this.zzckb.getTagForUnderAgeOfConsent() != -1) {
                    zza(this.zzckb);
                }
                zzaat.initialize(context);
                if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcud)).booleanValue() && !getVersionString().endsWith("0")) {
                    zzbbd.zzfc("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                    this.zzckc = new InitializationStatus(this) { // from class: com.google.android.gms.internal.ads.zzyw
                        private final zzyv zzcjw;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzcjw = this;
                        }

                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            zzyv zzyvVar = this.zzcjw;
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.gms.ads.MobileAds", new zzyy(zzyvVar));
                            return hashMap;
                        }
                    };
                    if (onInitializationCompleteListener != null) {
                        zzbat.zzaah.post(new Runnable(this, onInitializationCompleteListener) { // from class: com.google.android.gms.internal.ads.zzyx
                            private final zzyv zzcjw;
                            private final OnInitializationCompleteListener zzckd;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzcjw = this;
                                this.zzckd = onInitializationCompleteListener;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzcjw.zza(this.zzckd);
                            }
                        });
                    }
                }
            } catch (RemoteException e) {
                zzbbd.zzd("MobileAdsSettingManager initialization failed", e);
            }
        }
    }

    public final RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized (this.lock) {
            if (this.zzcka != null) {
                return this.zzcka;
            }
            zzaub zzaubVar = new zzaub(context, new zzwc(zzwe.zzpr(), context, new zzamr()).zzd(context, false));
            this.zzcka = zzaubVar;
            return zzaubVar;
        }
    }

    public final void setAppVolume(float f) {
        boolean z = true;
        Preconditions.checkArgument(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.lock) {
            if (this.zzcjz == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzcjz.setAppVolume(f);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to set app volume.", e);
            }
        }
    }

    public final float zzqd() {
        synchronized (this.lock) {
            float f = 1.0f;
            if (this.zzcjz == null) {
                return 1.0f;
            }
            try {
                f = this.zzcjz.zzqd();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to get app volume.", e);
            }
            return f;
        }
    }

    public final void setAppMuted(boolean z) {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzcjz.setAppMuted(z);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to set app mute state.", e);
            }
        }
    }

    public final boolean zzqe() {
        synchronized (this.lock) {
            boolean z = false;
            if (this.zzcjz == null) {
                return false;
            }
            try {
                z = this.zzcjz.zzqe();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to get app mute state.", e);
            }
            return z;
        }
    }

    public final void openDebugMenu(Context context, String str) {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzcjz.zzb(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to open debug menu.", e);
            }
        }
    }

    public final String getVersionString() {
        String zzhi;
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                zzhi = zzdsw.zzhi(this.zzcjz.getVersionString());
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to get version string.", e);
                return "";
            }
        }
        return zzhi;
    }

    public final void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        synchronized (this.lock) {
            try {
                this.zzcjz.zzci(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to register RtbAdapter", e);
            }
        }
    }

    public final InitializationStatus getInitializationStatus() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzcjz != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                if (this.zzckc != null) {
                    return this.zzckc;
                }
                return zzd(this.zzcjz.zzqf());
            } catch (RemoteException unused) {
                zzbbd.zzfc("Unable to get Initialization status.");
                return null;
            }
        }
    }

    public final void disableMediationAdapterInitialization(Context context) {
        synchronized (this.lock) {
            zzg(context);
            try {
                this.zzcjz.zzqg();
            } catch (RemoteException unused) {
                zzbbd.zzfc("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzd(List<zzaif> list) {
        HashMap hashMap = new HashMap();
        for (zzaif zzaifVar : list) {
            hashMap.put(zzaifVar.zzdfe, new zzain(zzaifVar.zzdff ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzaifVar.description, zzaifVar.zzdfg));
        }
        return new zzaiq(hashMap);
    }

    public final RequestConfiguration getRequestConfiguration() {
        return this.zzckb;
    }

    public final void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.lock) {
            RequestConfiguration requestConfiguration2 = this.zzckb;
            this.zzckb = requestConfiguration;
            if (this.zzcjz == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zza(requestConfiguration);
            }
        }
    }

    private final void zza(RequestConfiguration requestConfiguration) {
        try {
            this.zzcjz.zza(new zzzw(requestConfiguration));
        } catch (RemoteException e) {
            zzbbd.zzc("Unable to set request configuration parcel.", e);
        }
    }

    private final void zzg(Context context) {
        if (this.zzcjz == null) {
            this.zzcjz = new zzwb(zzwe.zzpr(), context).zzd(context, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(OnInitializationCompleteListener onInitializationCompleteListener) {
        onInitializationCompleteListener.onInitializationComplete(this.zzckc);
    }
}
