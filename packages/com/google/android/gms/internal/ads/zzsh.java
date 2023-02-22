package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzsh extends zzgt implements zzsi {
    public zzsh() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzsi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        if (queryLocalInterface instanceof zzsi) {
            return (zzsi) queryLocalInterface;
        }
        return new zzsk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzsd zzsfVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzsfVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                if (queryLocalInterface instanceof zzsd) {
                    zzsfVar = (zzsd) queryLocalInterface;
                } else {
                    zzsfVar = new zzsf(readStrongBinder);
                }
            }
            zza(zzsfVar);
        } else if (i == 2) {
            onAppOpenAdFailedToLoad(parcel.readInt());
        } else if (i != 3) {
            return false;
        } else {
            zza((zzuw) zzgw.zza(parcel, zzuw.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
