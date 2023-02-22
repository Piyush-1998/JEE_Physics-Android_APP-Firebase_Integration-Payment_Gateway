package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzxf extends zzgt implements zzxc {
    public zzxf() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzxc zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        if (queryLocalInterface instanceof zzxc) {
            return (zzxc) queryLocalInterface;
        }
        return new zzxe(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onAppEvent(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
