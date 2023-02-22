package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzi extends zzwp {
    final /* synthetic */ zzzg zzckk;

    private zzzi(zzzg zzzgVar) {
        this.zzckk = zzzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final String zzkf() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzb(zzvc zzvcVar) throws RemoteException {
        zza(zzvcVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zza(zzvc zzvcVar, int i) throws RemoteException {
        zzbbd.zzfc("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbat.zzaah.post(new zzzh(this));
    }
}
