package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzzr implements Runnable {
    private final /* synthetic */ zzzs zzckp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzr(zzzs zzzsVar) {
        this.zzckp = zzzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatt zzattVar;
        zzatt zzattVar2;
        zzattVar = this.zzckp.zzckq;
        if (zzattVar != null) {
            try {
                zzattVar2 = this.zzckp.zzckq;
                zzattVar2.onRewardedVideoAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
