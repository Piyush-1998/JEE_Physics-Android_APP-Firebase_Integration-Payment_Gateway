package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxu {
    private zzyf zzadq;
    private boolean zzaey = false;
    private final String zzbuo;
    private final zzcxy<zzbpd> zzgqv;

    public zzcxu(zzcxy<zzbpd> zzcxyVar, String str) {
        this.zzgqv = zzcxyVar;
        this.zzbuo = str;
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgqv.isLoading();
    }

    public final synchronized void zza(zzvc zzvcVar, int i) throws RemoteException {
        this.zzadq = null;
        this.zzaey = this.zzgqv.zza(zzvcVar, this.zzbuo, new zzcxz(i), new zzcxt(this));
    }

    public final synchronized String getMediationAdapterClassName() {
        try {
            if (this.zzadq != null) {
                return this.zzadq.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized String zzkf() {
        try {
            if (this.zzadq != null) {
                return this.zzadq.getMediationAdapterClassName();
            }
            return null;
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
