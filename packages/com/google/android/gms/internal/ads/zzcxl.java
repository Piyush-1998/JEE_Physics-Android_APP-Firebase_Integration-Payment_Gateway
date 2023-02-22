package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxl implements AppEventListener {
    private zzxc zzgqm;

    public final synchronized void zzb(zzxc zzxcVar) {
        this.zzgqm = zzxcVar;
    }

    public final synchronized zzxc zzaqb() {
        return this.zzgqm;
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzgqm != null) {
            try {
                this.zzgqm.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception at onAppEvent.", e);
            }
        }
    }
}
