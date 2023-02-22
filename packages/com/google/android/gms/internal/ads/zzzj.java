package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzzj implements Runnable {
    private final /* synthetic */ zzzk zzckl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzj(zzzk zzzkVar) {
        this.zzckl = zzzkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzwl zzwlVar;
        zzwl zzwlVar2;
        zzwlVar = this.zzckl.zzbpf;
        if (zzwlVar != null) {
            try {
                zzwlVar2 = this.zzckl.zzbpf;
                zzwlVar2.onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
