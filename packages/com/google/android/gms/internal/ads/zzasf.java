package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzasf extends zzgt implements zzasc {
    public zzasf() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzgt
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            zzash zzashVar = null;
            zzasj zzasjVar = null;
            zzasj zzasjVar2 = null;
            zzasj zzasjVar3 = null;
            zzasj zzasjVar4 = null;
            if (i == 2) {
                zzarw zzarwVar = (zzarw) zzgw.zza(parcel, zzarw.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzash) {
                        zzashVar = (zzash) queryLocalInterface;
                    } else {
                        zzashVar = new zzasg(readStrongBinder);
                    }
                }
                zza(zzarwVar, zzashVar);
                parcel2.writeNoException();
            } else if (i == 4) {
                zzasp zzaspVar = (zzasp) zzgw.zza(parcel, zzasp.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface2 instanceof zzasj) {
                        zzasjVar4 = (zzasj) queryLocalInterface2;
                    } else {
                        zzasjVar4 = new zzasl(readStrongBinder2);
                    }
                }
                zza(zzaspVar, zzasjVar4);
                parcel2.writeNoException();
            } else if (i == 5) {
                zzasp zzaspVar2 = (zzasp) zzgw.zza(parcel, zzasp.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface3 instanceof zzasj) {
                        zzasjVar3 = (zzasj) queryLocalInterface3;
                    } else {
                        zzasjVar3 = new zzasl(readStrongBinder3);
                    }
                }
                zzb(zzaspVar2, zzasjVar3);
                parcel2.writeNoException();
            } else if (i == 6) {
                zzasp zzaspVar3 = (zzasp) zzgw.zza(parcel, zzasp.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface4 instanceof zzasj) {
                        zzasjVar2 = (zzasj) queryLocalInterface4;
                    } else {
                        zzasjVar2 = new zzasl(readStrongBinder4);
                    }
                }
                zzc(zzaspVar3, zzasjVar2);
                parcel2.writeNoException();
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    if (queryLocalInterface5 instanceof zzasj) {
                        zzasjVar = (zzasj) queryLocalInterface5;
                    } else {
                        zzasjVar = new zzasl(readStrongBinder5);
                    }
                }
                zza(readString, zzasjVar);
                parcel2.writeNoException();
            }
        } else {
            zzary zza = zza((zzarw) zzgw.zza(parcel, zzarw.CREATOR));
            parcel2.writeNoException();
            zzgw.zzb(parcel2, zza);
        }
        return true;
    }
}
