package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzajc extends zzgt implements zzaiz {
    public zzajc() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    public static zzaiz zzab(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        if (queryLocalInterface instanceof zzaiz) {
            return (zzaiz) queryLocalInterface;
        }
        return new zzajb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzait zzaivVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzaivVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                if (queryLocalInterface instanceof zzait) {
                    zzaivVar = (zzait) queryLocalInterface;
                } else {
                    zzaivVar = new zzaiv(readStrongBinder);
                }
            }
            zza(zzaivVar);
        } else if (i == 2) {
            onInstreamAdFailedToLoad(parcel.readInt());
        } else if (i != 3) {
            return false;
        } else {
            zzc((zzuw) zzgw.zza(parcel, zzuw.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
