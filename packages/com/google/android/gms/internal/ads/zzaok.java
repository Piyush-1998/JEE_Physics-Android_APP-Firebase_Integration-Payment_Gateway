package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzaok implements Runnable {
    private final /* synthetic */ zzanx zzdlg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaok(zzanx zzanxVar) {
        this.zzdlg = zzanxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzana zzanaVar;
        try {
            zzanaVar = this.zzdlg.zzdks;
            zzanaVar.onAdLeftApplication();
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }
}
