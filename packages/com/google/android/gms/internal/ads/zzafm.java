package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzafm extends zzgu implements zzafk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafk
    public final void zza(zzwu zzwuVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzwuVar);
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(1, obtainAndWriteInterfaceToken);
    }
}
