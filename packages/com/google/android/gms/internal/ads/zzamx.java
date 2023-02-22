package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzamx extends zzgu implements zzamv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvjVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(1, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final IObjectWrapper zzto() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void showInterstitial() throws RemoteException {
        zza(4, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void destroy() throws RemoteException {
        zza(5, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, zzvc zzvcVar, String str, String str2, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvjVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(6, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void pause() throws RemoteException {
        zza(8, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void resume() throws RemoteException {
        zza(9, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzaua zzauaVar, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, zzauaVar);
        obtainAndWriteInterfaceToken.writeString(str2);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(zzvc zzvcVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(11, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void showVideo() throws RemoteException {
        zza(12, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final boolean isInitialized() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar, zzadm zzadmVar, List<String> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzadmVar);
        obtainAndWriteInterfaceToken.writeStringList(list);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzand zztp() throws RemoteException {
        zzand zzanfVar;
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzanfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            if (queryLocalInterface instanceof zzand) {
                zzanfVar = (zzand) queryLocalInterface;
            } else {
                zzanfVar = new zzanf(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzanfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzani zztq() throws RemoteException {
        zzani zzankVar;
        Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzankVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            if (queryLocalInterface instanceof zzani) {
                zzankVar = (zzani) queryLocalInterface;
            } else {
                zzankVar = new zzank(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzankVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle zztr() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgw.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle getInterstitialAdapterInfo() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgw.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final Bundle zzts() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
        Bundle bundle = (Bundle) zzgw.zza(transactAndReadException, Bundle.CREATOR);
        transactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(zzvc zzvcVar, String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zza(20, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(21, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final boolean zztt() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
        boolean zza = zzgw.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzaua zzauaVar, List<String> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzauaVar);
        obtainAndWriteInterfaceToken.writeStringList(list);
        zza(23, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzaes zztu() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
        zzaes zzr = zzaer.zzr(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void setImmersiveMode(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.writeBoolean(obtainAndWriteInterfaceToken, z);
        zza(25, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzyg getVideoController() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
        zzyg zzk = zzyj.zzk(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzanj zztv() throws RemoteException {
        zzanj zzanlVar;
        Parcel transactAndReadException = transactAndReadException(27, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzanlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            if (queryLocalInterface instanceof zzanj) {
                zzanlVar = (zzanj) queryLocalInterface;
            } else {
                zzanlVar = new zzanl(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzanlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzb(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(28, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zza(30, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zza(IObjectWrapper iObjectWrapper, zzaih zzaihVar, List<zzaip> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzaihVar);
        obtainAndWriteInterfaceToken.writeTypedList(list);
        zza(31, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final void zzc(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzvcVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zzgw.zza(obtainAndWriteInterfaceToken, zzanaVar);
        zza(32, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzapo zztw() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(33, obtainAndWriteInterfaceToken());
        zzapo zzapoVar = (zzapo) zzgw.zza(transactAndReadException, zzapo.CREATOR);
        transactAndReadException.recycle();
        return zzapoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzamv
    public final zzapo zztx() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken());
        zzapo zzapoVar = (zzapo) zzgw.zza(transactAndReadException, zzapo.CREATOR);
        transactAndReadException.recycle();
        return zzapoVar;
    }
}
