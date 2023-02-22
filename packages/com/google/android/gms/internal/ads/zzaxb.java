package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxb extends zzgu implements zzawz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final zzawu zzd(IObjectWrapper iObjectWrapper, zzamu zzamuVar, int i) throws RemoteException {
        zzawu zzawwVar;
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, iObjectWrapper);
        zzgw.zza(obtainAndWriteInterfaceToken, zzamuVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            zzawwVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            if (queryLocalInterface instanceof zzawu) {
                zzawwVar = (zzawu) queryLocalInterface;
            } else {
                zzawwVar = new zzaww(readStrongBinder);
            }
        }
        transactAndReadException.recycle();
        return zzawwVar;
    }
}
