package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzapa extends IInterface {
    zzyg getVideoController() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzvj zzvjVar, zzapb zzapbVar) throws RemoteException;

    void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaoo zzaooVar, zzana zzanaVar, zzvj zzvjVar) throws RemoteException;

    void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaop zzaopVar, zzana zzanaVar) throws RemoteException;

    void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaou zzaouVar, zzana zzanaVar) throws RemoteException;

    void zza(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaov zzaovVar, zzana zzanaVar) throws RemoteException;

    void zza(String[] strArr, Bundle[] bundleArr) throws RemoteException;

    boolean zzaa(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzb(String str, String str2, zzvc zzvcVar, IObjectWrapper iObjectWrapper, zzaov zzaovVar, zzana zzanaVar) throws RemoteException;

    void zzdr(String str) throws RemoteException;

    zzapo zztw() throws RemoteException;

    zzapo zztx() throws RemoteException;

    void zzy(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzz(IObjectWrapper iObjectWrapper) throws RemoteException;
}
