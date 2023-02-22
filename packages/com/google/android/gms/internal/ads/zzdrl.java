package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrl extends zzgu implements zzdrm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final zzdrk zza(zzdri zzdriVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzdriVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzdrk zzdrkVar = (zzdrk) zzgw.zza(transactAndReadException, zzdrk.CREATOR);
        transactAndReadException.recycle();
        return zzdrkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zza(zzdrd zzdrdVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzdrdVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final zzdru zza(zzdrs zzdrsVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzdrsVar);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        zzdru zzdruVar = (zzdru) zzgw.zza(transactAndReadException, zzdru.CREATOR);
        transactAndReadException.recycle();
        return zzdruVar;
    }
}
