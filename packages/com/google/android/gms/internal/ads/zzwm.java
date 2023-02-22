package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzwm extends IInterface {
    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoading() throws RemoteException;

    void zza(zzvc zzvcVar, int i) throws RemoteException;

    void zzb(zzvc zzvcVar) throws RemoteException;

    String zzkf() throws RemoteException;
}
