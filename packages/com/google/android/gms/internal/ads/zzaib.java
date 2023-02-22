package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzaib extends zzahy {
    private final /* synthetic */ zzbbq zzbvn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaib(zzaic zzaicVar, zzbbq zzbbqVar) {
        this.zzbvn = zzbbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final void zza(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        this.zzbvn.set(parcelFileDescriptor);
    }
}
