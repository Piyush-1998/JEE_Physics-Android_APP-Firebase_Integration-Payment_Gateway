package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzww extends zzgu implements zzwu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final IObjectWrapper zzkc() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void destroy() throws RemoteException {
        zza(2, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean isReady() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean zza(zzvc zzvcVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void pause() throws RemoteException {
        zza(5, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void resume() throws RemoteException {
        zza(6, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwl zzwlVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzwlVar);
        zza(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxc zzxcVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzxcVar);
        zza(8, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void showInterstitial() throws RemoteException {
        zza(9, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void stopLoading() throws RemoteException {
        zza(10, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzkd() throws RemoteException {
        zza(11, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzvj zzke() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
        zzvj zzvjVar = (zzvj) zzgw.zza(transactAndReadException, zzvj.CREATOR);
        transactAndReadException.recycle();
        return zzvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvj zzvjVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzvjVar);
        zza(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzaqv zzaqvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaqvVar);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzarb zzarbVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzarbVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(15, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String getMediationAdapterClassName() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzabq zzabqVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzabqVar);
        zza(19, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwg zzwgVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzwgVar);
        zza(20, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxi zzxiVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzxiVar);
        zza(21, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setManualImpressionsEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(22, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean isLoading() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzatt zzattVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzattVar);
        zza(24, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setUserId(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(25, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzyg getVideoController() throws RemoteException {
        zzyg zzyiVar;
        Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzyiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            if (queryLocalInterface instanceof zzyg) {
                zzyiVar = (zzyg) queryLocalInterface;
            } else {
                zzyiVar = new zzyi(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzaac zzaacVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaacVar);
        zza(29, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzym zzymVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzymVar);
        zza(30, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String getAdUnitId() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(31, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzxc zzkh() throws RemoteException {
        zzxc zzxeVar;
        Parcel transactAndReadException = transactAndReadException(32, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzxeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof zzxc) {
                zzxeVar = (zzxc) queryLocalInterface;
            } else {
                zzxeVar = new zzxe(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzwl zzki() throws RemoteException {
        zzwl zzwnVar;
        Parcel transactAndReadException = transactAndReadException(33, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzwnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            if (queryLocalInterface instanceof zzwl) {
                zzwnVar = (zzwl) queryLocalInterface;
            } else {
                zzwnVar = new zzwn(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzwnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(34, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final String zzkf() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxb zzxbVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzxbVar);
        zza(36, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final Bundle getAdMetadata() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(37, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgw.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzbp(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(38, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvm zzvmVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzvmVar);
        zza(39, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzsi zzsiVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzsiVar);
        zza(40, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzyf zzkg() throws RemoteException {
        zzyf zzyhVar;
        Parcel transactAndReadException = transactAndReadException(41, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzyhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzyf) {
                zzyhVar = (zzyf) queryLocalInterface;
            } else {
                zzyhVar = new zzyh(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzya zzyaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzyaVar);
        zza(42, obtainAndWriteInterfaceToken);
    }
}
