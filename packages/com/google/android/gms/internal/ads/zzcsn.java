package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsn extends zzaud implements zzbuc {
    private zzaua zzgmb;
    private zzbuf zzgmc;
    private zzbzf zzgmd;

    public final synchronized void zza(zzaua zzauaVar) {
        this.zzgmb = zzauaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final synchronized void zza(zzbuf zzbufVar) {
        this.zzgmc = zzbufVar;
    }

    public final synchronized void zza(zzbzf zzbzfVar) {
        this.zzgmd = zzbzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzaf(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzaf(iObjectWrapper);
        }
        if (this.zzgmd != null) {
            this.zzgmd.onInitializationSucceeded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzd(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzd(iObjectWrapper, i);
        }
        if (this.zzgmd != null) {
            this.zzgmd.zzdx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzai(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzai(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zza(IObjectWrapper iObjectWrapper, zzaue zzaueVar) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zza(iObjectWrapper, zzaueVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzak(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzak(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzaj(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzaj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zze(iObjectWrapper, i);
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdFailedToLoad(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzal(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzal(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzam(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzam(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzah(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzah(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzag(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzag(iObjectWrapper);
        }
        if (this.zzgmc != null) {
            this.zzgmc.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.zzgmb != null) {
            this.zzgmb.zzb(bundle);
        }
    }
}
