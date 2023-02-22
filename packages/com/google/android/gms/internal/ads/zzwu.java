package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public interface zzwu extends IInterface {
    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getAdUnitId() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    zzyg getVideoController() throws RemoteException;

    boolean isLoading() throws RemoteException;

    boolean isReady() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setManualImpressionsEnabled(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void stopLoading() throws RemoteException;

    void zza(zzaac zzaacVar) throws RemoteException;

    void zza(zzabq zzabqVar) throws RemoteException;

    void zza(zzaqv zzaqvVar) throws RemoteException;

    void zza(zzarb zzarbVar, String str) throws RemoteException;

    void zza(zzatt zzattVar) throws RemoteException;

    void zza(zzsi zzsiVar) throws RemoteException;

    void zza(zzvj zzvjVar) throws RemoteException;

    void zza(zzvm zzvmVar) throws RemoteException;

    void zza(zzwg zzwgVar) throws RemoteException;

    void zza(zzwl zzwlVar) throws RemoteException;

    void zza(zzxb zzxbVar) throws RemoteException;

    void zza(zzxc zzxcVar) throws RemoteException;

    void zza(zzxi zzxiVar) throws RemoteException;

    void zza(zzya zzyaVar) throws RemoteException;

    void zza(zzym zzymVar) throws RemoteException;

    boolean zza(zzvc zzvcVar) throws RemoteException;

    void zzbp(String str) throws RemoteException;

    IObjectWrapper zzkc() throws RemoteException;

    void zzkd() throws RemoteException;

    zzvj zzke() throws RemoteException;

    String zzkf() throws RemoteException;

    zzyf zzkg() throws RemoteException;

    zzxc zzkh() throws RemoteException;

    zzwl zzki() throws RemoteException;
}
