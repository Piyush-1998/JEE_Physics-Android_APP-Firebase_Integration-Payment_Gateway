package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaia extends zzgu implements zzahx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaia(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.zzahx
    public final void zza(zzahr zzahrVar, zzahv zzahvVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzahrVar);
        zzgw.zza(obtainAndWriteInterfaceToken, zzahvVar);
        zzb(2, obtainAndWriteInterfaceToken);
    }
}
