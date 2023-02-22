package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzaup extends zzgt implements zzaum {
    public zzaup() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzaug zzauiVar;
        if (i == 1) {
            onRewardedAdOpened();
        } else if (i == 2) {
            onRewardedAdClosed();
        } else if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzauiVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                if (queryLocalInterface instanceof zzaug) {
                    zzauiVar = (zzaug) queryLocalInterface;
                } else {
                    zzauiVar = new zzaui(readStrongBinder);
                }
            }
            zza(zzauiVar);
        } else if (i == 4) {
            onRewardedAdFailedToShow(parcel.readInt());
        } else if (i != 5) {
            return false;
        } else {
            zzd((zzuw) zzgw.zza(parcel, zzuw.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
