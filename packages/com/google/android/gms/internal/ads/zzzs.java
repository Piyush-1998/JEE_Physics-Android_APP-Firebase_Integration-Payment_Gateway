package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzs extends zzatp {
    private zzatt zzckq;

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void destroy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void pause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void resume() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void setAppPackageName(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void setCustomData(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void setUserId(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void show() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zza(zzatk zzatkVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zza(zzxb zzxbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final zzyf zzkg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final boolean zzqx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zza(zzatz zzatzVar) throws RemoteException {
        zzbbd.zzfc("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbat.zzaah.post(new zzzr(this));
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final void zza(zzatt zzattVar) throws RemoteException {
        this.zzckq = zzattVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatm
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }
}
