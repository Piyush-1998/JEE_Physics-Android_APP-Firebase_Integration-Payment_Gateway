package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzanp implements InitializationCompleteCallback {
    private final /* synthetic */ zzaih zzdkm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanp(zzanq zzanqVar, zzaih zzaihVar) {
        this.zzdkm = zzaihVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zzdkm.onInitializationSucceeded();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zzdkm.onInitializationFailed(str);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
