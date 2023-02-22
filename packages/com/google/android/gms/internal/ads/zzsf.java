package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzsf extends zzgu implements zzsd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final zzwu zzdu() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        zzwu zzc = zzwx.zzc(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zza(zzsj zzsjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzsjVar);
        zza(3, obtainAndWriteInterfaceToken);
    }
}
