package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzxu extends zzgt implements zzxv {
    public zzxu() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzxv zzg(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        if (queryLocalInterface instanceof zzxv) {
            return (zzxv) queryLocalInterface;
        }
        return new zzxx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String description = getDescription();
            parcel2.writeNoException();
            parcel2.writeString(description);
        } else if (i != 2) {
            return false;
        } else {
            String zzqh = zzqh();
            parcel2.writeNoException();
            parcel2.writeString(zzqh);
        }
        return true;
    }
}
