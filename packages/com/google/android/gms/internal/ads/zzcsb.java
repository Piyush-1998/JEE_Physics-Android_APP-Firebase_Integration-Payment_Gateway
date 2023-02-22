package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcsb extends zzaon {
    private zzcrg<zzapa, zzcso> zzglp;
    private final /* synthetic */ zzcsa zzglq;

    private zzcsb(zzcsa zzcsaVar, zzcrg<zzapa, zzcso> zzcrgVar) {
        this.zzglq = zzcsaVar;
        this.zzglp = zzcrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzx(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcsa.zza(this.zzglq, (View) ObjectWrapper.unwrap(iObjectWrapper));
        this.zzglp.zzglc.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final void zzdq(String str) throws RemoteException {
        this.zzglp.zzglc.zzc(0, str);
    }
}
