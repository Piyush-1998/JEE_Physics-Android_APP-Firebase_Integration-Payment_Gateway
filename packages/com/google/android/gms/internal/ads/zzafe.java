package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzafe extends zzgu implements zzafc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzafc
    public final void zza(zzaes zzaesVar, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgw.zza(obtainAndWriteInterfaceToken, zzaesVar);
        obtainAndWriteInterfaceToken.writeString(str);
        zza(1, obtainAndWriteInterfaceToken);
    }
}
