package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdkr extends zzatp {
    private final zzdli zzfsl;
    private boolean zzgqs = false;
    private final zzdkd zzgzu;
    private final zzdje zzgzv;
    private zzchu zzgzw;

    public zzdkr(zzdkd zzdkdVar, zzdje zzdjeVar, zzdli zzdliVar) {
        this.zzgzu = zzdkdVar;
        this.zzgzv = zzdjeVar;
        this.zzfsl = zzdliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void setAppPackageName(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void zza(zzatz zzatzVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (zzaav.zzct(zzatzVar.zzbuo)) {
            return;
        }
        if (zzaqd()) {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcui)).booleanValue()) {
                return;
            }
        }
        zzdka zzdkaVar = new zzdka(null);
        this.zzgzw = null;
        this.zzgzu.zzea(zzdlf.zzhbh);
        this.zzgzu.zza(zzatzVar.zzdpw, zzatzVar.zzbuo, zzdkaVar, new zzdkq(this));
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void destroy() throws RemoteException {
        zzl(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzgzv.zza(null);
        if (this.zzgzw != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzgzw.zzail().zzcb(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void pause() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgzw != null) {
            this.zzgzw.zzail().zzbz(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void resume() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgzw != null) {
            this.zzgzw.zzail().zzca(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void show() throws RemoteException {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Activity activity;
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzgzw == null) {
            return;
        }
        if (iObjectWrapper != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof Activity) {
                activity = (Activity) unwrap;
                this.zzgzw.zzb(this.zzgqs, activity);
            }
        }
        activity = null;
        this.zzgzw.zzb(this.zzgqs, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final boolean zzqx() {
        zzchu zzchuVar = this.zzgzw;
        return zzchuVar != null && zzchuVar.zzqx();
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized String getMediationAdapterClassName() throws RemoteException {
        if (this.zzgzw == null || this.zzgzw.zzaim() == null) {
            return null;
        }
        return this.zzgzw.zzaim().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final boolean isLoaded() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaqd();
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zza(zzatt zzattVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzgzv.zzb(zzattVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zza(zzatk zzatkVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzgzv.zzb(zzatkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zza(zzxb zzxbVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzxbVar == null) {
            this.zzgzv.zza(null);
        } else {
            this.zzgzv.zza(new zzdkt(this, zzxbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzchu zzchuVar = this.zzgzw;
        return zzchuVar != null ? zzchuVar.getAdMetadata() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void setUserId(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzfsl.zzdve = str;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void setCustomData(String str) throws RemoteException {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcod)).booleanValue()) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzfsl.zzdvf = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgqs = z;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final synchronized zzyf zzkg() throws RemoteException {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue()) {
            if (this.zzgzw != null) {
                return this.zzgzw.zzaim();
            }
            return null;
        }
        return null;
    }

    private final synchronized boolean zzaqd() {
        boolean z;
        if (this.zzgzw != null) {
            z = this.zzgzw.isClosed() ? false : true;
        }
        return z;
    }
}
