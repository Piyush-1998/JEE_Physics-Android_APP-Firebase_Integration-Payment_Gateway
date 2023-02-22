package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsl extends zzgu implements zzsj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void onAppOpenAdClosed() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }
}
