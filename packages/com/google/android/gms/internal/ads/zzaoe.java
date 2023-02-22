package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzaoe implements Runnable {
    private final /* synthetic */ zzanx zzdlg;
    private final /* synthetic */ AdRequest.ErrorCode zzdlh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaoe(zzanx zzanxVar, AdRequest.ErrorCode errorCode) {
        this.zzdlg = zzanxVar;
        this.zzdlh = errorCode;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzana zzanaVar;
        try {
            zzanaVar = this.zzdlg.zzdks;
            zzanaVar.onAdFailedToLoad(zzaoj.zza(this.zzdlh));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
