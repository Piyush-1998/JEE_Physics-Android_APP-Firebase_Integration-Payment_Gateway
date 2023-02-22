package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzase extends zzgu implements zzasc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzase(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final zzary zza(zzarw zzarwVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzarwVar);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzary zzaryVar = (zzary) zzgw.zza(transactAndReadException, zzary.CREATOR);
        transactAndReadException.recycle();
        return zzaryVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzarw zzarwVar, zzash zzashVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzarwVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzashVar);
        zza(2, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzasp zzaspVar, zzasj zzasjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaspVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzasjVar);
        zza(4, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzb(zzasp zzaspVar, zzasj zzasjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaspVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzasjVar);
        zza(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzc(zzasp zzaspVar, zzasj zzasjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaspVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzasjVar);
        zza(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(String str, zzasj zzasjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, zzasjVar);
        zza(7, obtainAndWriteInterfaceToken);
    }
}
