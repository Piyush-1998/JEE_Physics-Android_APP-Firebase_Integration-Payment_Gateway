package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzxt extends zzgu implements zzxr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdMuted() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
