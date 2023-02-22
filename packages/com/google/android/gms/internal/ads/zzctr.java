package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzctr extends zzaot {
    private zzcrg<zzapa, zzcso> zzglp;
    private final /* synthetic */ zzctp zzgmx;

    private zzctr(zzctp zzctpVar, zzcrg<zzapa, zzcso> zzcrgVar) {
        this.zzgmx = zzctpVar;
        this.zzglp = zzcrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zza(zzanj zzanjVar) throws RemoteException {
        zzctp.zza(this.zzgmx, zzanjVar);
        this.zzglp.zzglc.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaou
    public final void zzdq(String str) throws RemoteException {
        this.zzglp.zzglc.zzc(0, str);
    }
}
