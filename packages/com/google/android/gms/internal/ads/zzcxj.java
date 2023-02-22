package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxj implements zzut {
    private zzwg zzgql;

    public final synchronized void zzb(zzwg zzwgVar) {
        this.zzgql = zzwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final synchronized void onAdClicked() {
        if (this.zzgql != null) {
            try {
                this.zzgql.onAdClicked();
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
