package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzapc extends zzgu implements zzapa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvj zzvjVar, zzapb zzapbVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, bundle);
        zzgw.zza(obtainAndWriteInterfaceToken, bundle2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvjVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzapbVar);
        zza(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzapo zztw() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        zzapo zzapoVar = (zzapo) zzgw.zza(transactAndReadException, zzapo.CREATOR);
        transactAndReadException.recycle();
        return zzapoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzapo zztx() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        zzapo zzapoVar = (zzapo) zzgw.zza(transactAndReadException, zzapo.CREATOR);
        transactAndReadException.recycle();
        return zzapoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzyg getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        zzyg zzk = zzyj.zzk(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzy(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeStringArray(strArr);
        obtainAndWriteInterfaceToken.writeTypedArray(bundleArr, 0);
        zza(11, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaoo zzaooVar, zzana zzanaVar, zzvj zzvjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzaooVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvjVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzaopVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken);
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaov zzaovVar, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzaovVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(16, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaou zzaouVar, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzaouVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(18, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzdr(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(19, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final void zzb(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaov zzaovVar, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzaovVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(20, obtainAndWriteInterfaceToken);
    }
}
