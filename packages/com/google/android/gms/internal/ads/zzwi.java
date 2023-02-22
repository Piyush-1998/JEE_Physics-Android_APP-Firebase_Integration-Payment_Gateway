package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzwi extends zzgu implements zzwg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzwi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void onAdClicked() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
