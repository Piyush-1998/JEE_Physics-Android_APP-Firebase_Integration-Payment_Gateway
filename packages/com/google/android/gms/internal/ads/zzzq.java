package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzq extends zzauk {
    @Override // com.google.android.gms.internal.ads.zzaul
    public final String getMediationAdapterClassName() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzaum zzaumVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzauu zzauuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzavc zzavcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzxz zzxzVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzya zzyaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final zzyf zzkg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final zzaug zzqw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zza(zzvc zzvcVar, zzaut zzautVar) throws RemoteException {
        zza(zzautVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final void zzb(zzvc zzvcVar, zzaut zzautVar) throws RemoteException {
        zza(zzautVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaul
    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    private static void zza(final zzaut zzautVar) {
        zzbbd.zzfc("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbat.zzaah.post(new Runnable(zzautVar) { // from class: com.google.android.gms.internal.ads.zzzp
            private final zzaut zzcko;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcko = zzautVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzaut zzautVar2 = this.zzcko;
                if (zzautVar2 != null) {
                    try {
                        zzautVar2.onRewardedAdFailedToLoad(1);
                    } catch (RemoteException e) {
                        zzbbd.zze("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }
}
