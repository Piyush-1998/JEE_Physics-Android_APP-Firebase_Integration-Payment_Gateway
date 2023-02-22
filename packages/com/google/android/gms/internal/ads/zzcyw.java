package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcyw implements zzdvi<ArrayList<Uri>> {
    private final /* synthetic */ zzarc zzgru;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyw(zzcyk zzcykVar, zzarc zzarcVar) {
        this.zzgru = zzarcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        try {
            zzarc zzarcVar = this.zzgru;
            String valueOf = String.valueOf(th.getMessage());
            zzarcVar.onError(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(@Nonnull ArrayList<Uri> arrayList) {
        try {
            this.zzgru.onSuccess(arrayList);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
