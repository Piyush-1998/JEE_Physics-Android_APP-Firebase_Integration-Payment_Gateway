package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzyb extends zzgu implements zzxz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final void onAdMetadataChanged() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
