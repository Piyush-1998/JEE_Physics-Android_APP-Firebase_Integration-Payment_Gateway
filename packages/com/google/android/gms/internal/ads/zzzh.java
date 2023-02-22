package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzzh implements Runnable {
    private final /* synthetic */ zzzi zzckj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzzh(zzzi zzziVar) {
        this.zzckj = zzziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzzg.zza(this.zzckj.zzckk) != null) {
            try {
                zzzg.zza(this.zzckj.zzckk).onAdFailedToLoad(1);
            } catch (RemoteException e) {
                zzbbd.zzd("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
