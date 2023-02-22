package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzafh extends zzgu implements zzafi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    public final void zzsq() throws RemoteException {
        zza(2, obtainAndWriteInterfaceToken());
    }
}
