package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzafp extends zzgt implements zzafq {
    public zzafp() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static zzafq zzy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        if (queryLocalInterface instanceof zzafq) {
            return (zzafq) queryLocalInterface;
        }
        return new zzafs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            boolean zzm = zzm(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            zzgw.writeBoolean(parcel2, zzm);
            return true;
        }
        return false;
    }
}
