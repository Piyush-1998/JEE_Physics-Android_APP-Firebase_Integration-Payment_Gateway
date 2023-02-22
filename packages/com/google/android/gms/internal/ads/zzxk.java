package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzxk extends IInterface {
    String getVersionString() throws RemoteException;

    void initialize() throws RemoteException;

    void setAppMuted(boolean z) throws RemoteException;

    void setAppVolume(float f) throws RemoteException;

    void zza(zzaim zzaimVar) throws RemoteException;

    void zza(zzamu zzamuVar) throws RemoteException;

    void zza(zzzw zzzwVar) throws RemoteException;

    void zza(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzch(String str) throws RemoteException;

    void zzci(String str) throws RemoteException;

    float zzqd() throws RemoteException;

    boolean zzqe() throws RemoteException;

    List<zzaif> zzqf() throws RemoteException;

    void zzqg() throws RemoteException;
}
