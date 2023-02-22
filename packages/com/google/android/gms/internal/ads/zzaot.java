package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzaot extends zzgt implements zzaou {
    public zzaot() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zza(zzanm.zzae(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            zzdq(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
