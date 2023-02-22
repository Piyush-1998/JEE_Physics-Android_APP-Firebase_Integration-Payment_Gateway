package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzxa extends zzgt implements zzxb {
    public zzxa() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    public static zzxb zzd(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        if (queryLocalInterface instanceof zzxb) {
            return (zzxb) queryLocalInterface;
        }
        return new zzxd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onAdMetadataChanged();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
