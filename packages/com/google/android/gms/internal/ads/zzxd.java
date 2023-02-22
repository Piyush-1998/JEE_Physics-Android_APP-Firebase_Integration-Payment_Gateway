package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzxd extends zzgu implements zzxb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void onAdMetadataChanged() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
