package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzaul extends IInterface {
    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void zza(zzaum zzaumVar) throws RemoteException;

    void zza(zzauu zzauuVar) throws RemoteException;

    void zza(zzavc zzavcVar) throws RemoteException;

    void zza(zzvc zzvcVar, zzaut zzautVar) throws RemoteException;

    void zza(zzxz zzxzVar) throws RemoteException;

    void zza(zzya zzyaVar) throws RemoteException;

    void zzb(zzvc zzvcVar, zzaut zzautVar) throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzyf zzkg() throws RemoteException;

    zzaug zzqw() throws RemoteException;
}
