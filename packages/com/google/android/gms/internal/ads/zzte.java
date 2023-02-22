package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzte extends zzgu implements zztb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzte(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final zzsv zza(zzta zztaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zztaVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzsv zzsvVar = (zzsv) zzgw.zza(transactAndReadException, zzsv.CREATOR);
        transactAndReadException.recycle();
        return zzsvVar;
    }
}
