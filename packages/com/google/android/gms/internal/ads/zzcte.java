package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcte extends zzaos {
    private zzcrg<zzapa, zzcso> zzglp;

    private zzcte(zzctc zzctcVar, zzcrg<zzapa, zzcso> zzcrgVar) {
        this.zzglp = zzcrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final void zzuh() throws RemoteException {
        this.zzglp.zzglc.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaop
    public final void zzdq(String str) throws RemoteException {
        this.zzglp.zzglc.zzc(0, str);
    }
}
