package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzyq {
    private final zzvh zzacs;
    private VideoOptions zzbnn;
    private boolean zzbnu;
    private AppEventListener zzbnw;
    private zzwu zzbun;
    private String zzbuo;
    private final zzamr zzbuq;
    private zzut zzcgq;
    private AdListener zzcgu;
    private AdSize[] zzchv;
    private final AtomicBoolean zzcji;
    private final VideoController zzcjj;
    private final zzwh zzcjk;
    private OnCustomRenderedAdLoadedListener zzcjl;
    private ViewGroup zzcjm;
    private int zzcjn;
    private OnPaidEventListener zzcjo;

    private static boolean zzcz(int i) {
        return i == 1;
    }

    public zzyq(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzvh.zzchm, 0);
    }

    public zzyq(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzvh.zzchm, i);
    }

    public zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzvh.zzchm, 0);
    }

    public zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, false, zzvh.zzchm, i);
    }

    private zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvh zzvhVar, zzwu zzwuVar, int i) {
        zzvj zzvjVar;
        this.zzbuq = new zzamr();
        this.zzcjj = new VideoController();
        this.zzcjk = new zzyt(this);
        this.zzcjm = viewGroup;
        this.zzacs = zzvhVar;
        this.zzbun = null;
        this.zzcji = new AtomicBoolean(false);
        this.zzcjn = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzvo zzvoVar = new zzvo(context, attributeSet);
                this.zzchv = zzvoVar.zzy(z);
                this.zzbuo = zzvoVar.getAdUnitId();
                if (viewGroup.isInEditMode()) {
                    zzbat zzpq = zzwe.zzpq();
                    AdSize adSize = this.zzchv[0];
                    int i2 = this.zzcjn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzvjVar = zzvj.zzpl();
                    } else {
                        zzvj zzvjVar2 = new zzvj(context, adSize);
                        zzvjVar2.zzchq = zzcz(i2);
                        zzvjVar = zzvjVar2;
                    }
                    zzpq.zza(viewGroup, zzvjVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzwe.zzpq().zza(viewGroup, new zzvj(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    private zzyq(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzvh zzvhVar, int i) {
        this(viewGroup, attributeSet, z, zzvhVar, null, i);
    }

    public final void destroy() {
        try {
            if (this.zzbun != null) {
                this.zzbun.destroy();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final AdListener getAdListener() {
        return this.zzcgu;
    }

    public final AdSize getAdSize() {
        zzvj zzke;
        try {
            if (this.zzbun != null && (zzke = this.zzbun.zzke()) != null) {
                return zzke.zzpm();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzchv;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] getAdSizes() {
        return this.zzchv;
    }

    public final String getAdUnitId() {
        zzwu zzwuVar;
        if (this.zzbuo == null && (zzwuVar = this.zzbun) != null) {
            try {
                this.zzbuo = zzwuVar.getAdUnitId();
            } catch (RemoteException e) {
                zzbbd.zze("#007 Could not call remote method.", e);
            }
        }
        return this.zzbuo;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbnw;
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzcjl;
    }

    public final void zza(zzyo zzyoVar) {
        zzwu zzd;
        try {
            if (this.zzbun == null) {
                if ((this.zzchv == null || this.zzbuo == null) && this.zzbun == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzcjm.getContext();
                zzvj zza = zza(context, this.zzchv, this.zzcjn);
                if ("search_v2".equals(zza.zzacx)) {
                    zzd = new zzvw(zzwe.zzpr(), context, zza, this.zzbuo).zzd(context, false);
                } else {
                    zzd = new zzvq(zzwe.zzpr(), context, zza, this.zzbuo, this.zzbuq).zzd(context, false);
                }
                this.zzbun = zzd;
                zzd.zza(new zzuy(this.zzcjk));
                if (this.zzcgq != null) {
                    this.zzbun.zza(new zzuv(this.zzcgq));
                }
                if (this.zzbnw != null) {
                    this.zzbun.zza(new zzvn(this.zzbnw));
                }
                if (this.zzcjl != null) {
                    this.zzbun.zza(new zzabr(this.zzcjl));
                }
                if (this.zzbnn != null) {
                    this.zzbun.zza(new zzaac(this.zzbnn));
                }
                this.zzbun.zza(new zzzt(this.zzcjo));
                this.zzbun.setManualImpressionsEnabled(this.zzbnu);
                try {
                    IObjectWrapper zzkc = this.zzbun.zzkc();
                    if (zzkc != null) {
                        this.zzcjm.addView((View) ObjectWrapper.unwrap(zzkc));
                    }
                } catch (RemoteException e) {
                    zzbbd.zze("#007 Could not call remote method.", e);
                }
            }
            if (this.zzbun.zza(zzvh.zza(this.zzcjm.getContext(), zzyoVar))) {
                this.zzbuq.zzf(zzyoVar.zzqn());
            }
        } catch (RemoteException e2) {
            zzbbd.zze("#007 Could not call remote method.", e2);
        }
    }

    public final void pause() {
        try {
            if (this.zzbun != null) {
                this.zzbun.pause();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void recordManualImpression() {
        if (this.zzcji.getAndSet(true)) {
            return;
        }
        try {
            if (this.zzbun != null) {
                this.zzbun.zzkd();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void resume() {
        try {
            if (this.zzbun != null) {
                this.zzbun.resume();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdListener(AdListener adListener) {
        this.zzcgu = adListener;
        this.zzcjk.zza(adListener);
    }

    public final void zza(zzut zzutVar) {
        try {
            this.zzcgq = zzutVar;
            if (this.zzbun != null) {
                this.zzbun.zza(zzutVar != null ? new zzuv(zzutVar) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (this.zzchv != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zza(adSizeArr);
    }

    public final void zza(AdSize... adSizeArr) {
        this.zzchv = adSizeArr;
        try {
            if (this.zzbun != null) {
                this.zzbun.zza(zza(this.zzcjm.getContext(), this.zzchv, this.zzcjn));
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        this.zzcjm.requestLayout();
    }

    public final void setAdUnitId(String str) {
        if (this.zzbuo != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzbuo = str;
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzbnw = appEventListener;
            if (this.zzbun != null) {
                this.zzbun.zza(appEventListener != null ? new zzvn(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcjl = onCustomRenderedAdLoadedListener;
        try {
            if (this.zzbun != null) {
                this.zzbun.zza(onCustomRenderedAdLoadedListener != null ? new zzabr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzbnu = z;
        try {
            if (this.zzbun != null) {
                this.zzbun.setManualImpressionsEnabled(z);
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final String getMediationAdapterClassName() {
        try {
            if (this.zzbun != null) {
                return this.zzbun.zzkf();
            }
            return null;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean isLoading() {
        try {
            if (this.zzbun != null) {
                return this.zzbun.isLoading();
            }
            return false;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzyf zzyfVar = null;
        try {
            if (this.zzbun != null) {
                zzyfVar = this.zzbun.zzkg();
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzyfVar);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzcjo = onPaidEventListener;
            if (this.zzbun != null) {
                this.zzbun.zza(new zzzt(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzbbd.zze("#008 Must be called on the main UI thread.", e);
        }
    }

    public final VideoController getVideoController() {
        return this.zzcjj;
    }

    public final zzyg zzdt() {
        zzwu zzwuVar = this.zzbun;
        if (zzwuVar == null) {
            return null;
        }
        try {
            return zzwuVar.getVideoController();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzbnn = videoOptions;
        try {
            if (this.zzbun != null) {
                this.zzbun.zza(videoOptions == null ? null : new zzaac(videoOptions));
            }
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions getVideoOptions() {
        return this.zzbnn;
    }

    public final boolean zza(zzwu zzwuVar) {
        if (zzwuVar == null) {
            return false;
        }
        try {
            IObjectWrapper zzkc = zzwuVar.zzkc();
            if (zzkc != null && ((View) ObjectWrapper.unwrap(zzkc)).getParent() == null) {
                this.zzcjm.addView((View) ObjectWrapper.unwrap(zzkc));
                this.zzbun = zzwuVar;
                return true;
            }
            return false;
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return false;
        }
    }

    private static zzvj zza(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzvj.zzpl();
            }
        }
        zzvj zzvjVar = new zzvj(context, adSizeArr);
        zzvjVar.zzchq = zzcz(i);
        return zzvjVar;
    }
}
