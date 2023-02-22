package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwz extends zzwx {
    private final ViewGroup zzfnx;
    private final zzdln zzfqn;
    private final zzwl zzfvl;
    private final zzbni zzgpm;
    private final Context zzvr;

    public zzcwz(Context context, zzwl zzwlVar, zzdln zzdlnVar, zzbni zzbniVar) {
        this.zzvr = context;
        this.zzfvl = zzwlVar;
        this.zzfqn = zzdlnVar;
        this.zzgpm = zzbniVar;
        FrameLayout frameLayout = new FrameLayout(this.zzvr);
        frameLayout.removeAllViews();
        frameLayout.addView(this.zzgpm.zzahq(), com.google.android.gms.ads.internal.zzp.zzkr().zzxt());
        frameLayout.setMinimumHeight(zzke().heightPixels);
        frameLayout.setMinimumWidth(zzke().widthPixels);
        this.zzfnx = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean isReady() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void showInterstitial() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void stopLoading() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzaqv zzaqvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzarb zzarbVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzatt zzattVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzsi zzsiVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvm zzvmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzym zzymVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzbp(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final IObjectWrapper zzkc() throws RemoteException {
        return ObjectWrapper.wrap(this.zzfnx);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgpm.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean zza(zzvc zzvcVar) throws RemoteException {
        zzaxy.zzfd("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void pause() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgpm.zzail().zzbz(null);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void resume() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzgpm.zzail().zzca(null);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzkd() throws RemoteException {
        this.zzgpm.zzkd();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzvj zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzdls.zzb(this.zzvr, Collections.singletonList(this.zzgpm.zzahp()));
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgpm.zzaim() != null) {
            return this.zzgpm.zzaim().getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzyg getVideoController() throws RemoteException {
        return this.zzgpm.getVideoController();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String getAdUnitId() throws RemoteException {
        return this.zzfqn.zzhbv;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzxc zzkh() throws RemoteException {
        return this.zzfqn.zzhca;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzwl zzki() throws RemoteException {
        return this.zzfvl;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String zzkf() throws RemoteException {
        if (this.zzgpm.zzaim() != null) {
            return this.zzgpm.zzaim().getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzyf zzkg() {
        return this.zzgpm.zzaim();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzaac zzaacVar) throws RemoteException {
        zzaxy.zzfd("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvj zzvjVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzbni zzbniVar = this.zzgpm;
        if (zzbniVar != null) {
            zzbniVar.zza(this.zzfnx, zzvjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzabq zzabqVar) throws RemoteException {
        zzaxy.zzfd("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwg zzwgVar) throws RemoteException {
        zzaxy.zzfd("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxi zzxiVar) throws RemoteException {
        zzaxy.zzfd("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        zzaxy.zzfd("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwl zzwlVar) throws RemoteException {
        zzaxy.zzfd("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxc zzxcVar) throws RemoteException {
        zzaxy.zzfd("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxb zzxbVar) throws RemoteException {
        zzaxy.zzfd("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final Bundle getAdMetadata() throws RemoteException {
        zzaxy.zzfd("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzya zzyaVar) {
        zzaxy.zzfd("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }
}
