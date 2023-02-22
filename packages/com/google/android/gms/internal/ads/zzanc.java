package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzanc extends zzgu implements zzana {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdClicked() throws RemoteException {
        zza(1, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdClosed() throws RemoteException {
        zza(2, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        zza(3, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdLeftApplication() throws RemoteException {
        zza(4, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdOpened() throws RemoteException {
        zza(5, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdLoaded() throws RemoteException {
        zza(6, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzanb zzanbVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzanbVar);
        zza(7, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdImpression() throws RemoteException {
        zza(8, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAppEvent(String str, String str2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        obtainAndWriteInterfaceToken.writeString(str2);
        zza(9, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzaes zzaesVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaesVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(10, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoEnd() throws RemoteException {
        zza(11, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdn(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzty() throws RemoteException {
        zza(13, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(zzaue zzaueVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaueVar);
        zza(14, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoPause() throws RemoteException {
        zza(15, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzaug zzaugVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaugVar);
        zza(16, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdd(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        zza(17, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zztz() throws RemoteException {
        zza(18, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, bundle);
        zza(19, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoPlay() throws RemoteException {
        zza(20, obtainAndWriteInterfaceToken());
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdo(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        zza(21, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzc(int i, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(22, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(zzuw zzuwVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzuwVar);
        zza(23, obtainAndWriteInterfaceToken);
    }
}
