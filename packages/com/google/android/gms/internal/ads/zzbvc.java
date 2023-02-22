package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbvc implements Runnable {
    private final WeakReference<zzbvb> zzftd;

    private zzbvc(zzbvb zzbvbVar) {
        this.zzftd = new WeakReference<>(zzbvbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbvb zzbvbVar = this.zzftd.get();
        if (zzbvbVar != null) {
            zzbvb.zza(zzbvbVar);
        }
    }
}
