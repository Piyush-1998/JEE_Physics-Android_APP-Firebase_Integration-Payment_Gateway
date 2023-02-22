package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxe extends zzwp {
    private final zzcxu zzgqe;

    public zzcxe(Context context, zzbii zzbiiVar, zzdlp zzdlpVar, zzcdg zzcdgVar, zzwl zzwlVar) {
        zzcxw zzcxwVar = new zzcxw(zzcdgVar);
        zzcxwVar.zzc(zzwlVar);
        this.zzgqe = new zzcxu(new zzcyc(zzbiiVar, context, zzcxwVar, zzdlpVar), zzdlpVar.zzass());
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgqe.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzb(zzvc zzvcVar) throws RemoteException {
        this.zzgqe.zza(zzvcVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized void zza(zzvc zzvcVar, int i) throws RemoteException {
        this.zzgqe.zza(zzvcVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized String getMediationAdapterClassName() {
        return this.zzgqe.getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized String zzkf() {
        return this.zzgqe.zzkf();
    }
}
