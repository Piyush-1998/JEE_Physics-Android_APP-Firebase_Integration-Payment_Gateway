package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzapj implements SignalCallbacks {
    private final /* synthetic */ zzapb zzdls;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapj(zzapf zzapfVar, zzapb zzapbVar) {
        this.zzdls = zzapbVar;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String str) {
        try {
            this.zzdls.zzds(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String str) {
        try {
            this.zzdls.onFailure(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
