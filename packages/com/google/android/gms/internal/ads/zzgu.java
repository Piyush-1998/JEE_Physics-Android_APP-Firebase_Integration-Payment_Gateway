package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.3.0 */
/* loaded from: classes.dex */
public class zzgu implements IInterface {
    private final IBinder zzacj;
    private final String zzack;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgu(IBinder iBinder, String str) {
        this.zzacj = iBinder;
        this.zzack = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzacj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzack);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel transactAndReadException(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zzacj.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zzacj.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(int i, Parcel parcel) throws RemoteException {
        try {
            this.zzacj.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
