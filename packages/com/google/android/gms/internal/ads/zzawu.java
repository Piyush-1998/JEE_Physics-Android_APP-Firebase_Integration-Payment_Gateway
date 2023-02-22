package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzawu extends IInterface {
    void zza(IObjectWrapper iObjectWrapper, zzaxa zzaxaVar, zzawt zzawtVar) throws RemoteException;

    void zza(zzarn zzarnVar) throws RemoteException;

    void zza(List<Uri> list, IObjectWrapper iObjectWrapper, zzarc zzarcVar) throws RemoteException;

    void zzan(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzao(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    void zzb(List<Uri> list, IObjectWrapper iObjectWrapper, zzarc zzarcVar) throws RemoteException;
}
