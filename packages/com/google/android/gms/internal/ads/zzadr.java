package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzadr extends IInterface {
    float getAspectRatio() throws RemoteException;

    float getCurrentTime() throws RemoteException;

    float getDuration() throws RemoteException;

    zzyg getVideoController() throws RemoteException;

    boolean hasVideoContent() throws RemoteException;

    void zza(zzafi zzafiVar) throws RemoteException;

    void zzo(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzsf() throws RemoteException;
}
