package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzamv extends IInterface {
    void destroy() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzyg getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzaih zzaihVar, List<zzaip> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzaua zzauaVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzaua zzauaVar, String str2) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, String str2, zzana zzanaVar, zzadm zzadmVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvj zzvjVar, zzvc zzvcVar, String str, String str2, zzana zzanaVar) throws RemoteException;

    void zza(zzvc zzvcVar, String str) throws RemoteException;

    void zza(zzvc zzvcVar, String str, String str2) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper, zzvc zzvcVar, String str, zzana zzanaVar) throws RemoteException;

    void zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzt(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzto() throws RemoteException;

    zzand zztp() throws RemoteException;

    zzani zztq() throws RemoteException;

    Bundle zztr() throws RemoteException;

    Bundle zzts() throws RemoteException;

    boolean zztt() throws RemoteException;

    zzaes zztu() throws RemoteException;

    zzanj zztv() throws RemoteException;

    zzapo zztw() throws RemoteException;

    zzapo zztx() throws RemoteException;
}
