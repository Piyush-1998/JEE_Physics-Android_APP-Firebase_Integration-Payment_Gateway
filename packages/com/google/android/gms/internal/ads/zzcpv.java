package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcpv implements zzdvi<ParcelFileDescriptor> {
    private final /* synthetic */ zzasj zzgjf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpv(zzcpj zzcpjVar, zzasj zzasjVar) {
        this.zzgjf = zzasjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        try {
            this.zzgjf.zza(zzazl.zzc(th));
        } catch (RemoteException e) {
            zzaxy.zza("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.zzgjf.zzb(parcelFileDescriptor);
        } catch (RemoteException e) {
            zzaxy.zza("Service can't call client", e);
        }
    }
}
