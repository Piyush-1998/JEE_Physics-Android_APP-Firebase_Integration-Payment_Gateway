package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzri implements Runnable {
    private final /* synthetic */ zzrf zzbsy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzri(zzrf zzrfVar) {
        this.zzbsy = zzrfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzrh> list;
        obj = this.zzbsy.lock;
        synchronized (obj) {
            z = this.zzbsy.foreground;
            if (z) {
                z2 = this.zzbsy.zzbsq;
                if (z2) {
                    this.zzbsy.foreground = false;
                    zzaxy.zzef("App went background");
                    list = this.zzbsy.zzbsr;
                    for (zzrh zzrhVar : list) {
                        try {
                            zzrhVar.zzp(false);
                        } catch (Exception e) {
                            zzbbd.zzc("", e);
                        }
                    }
                }
            }
            zzaxy.zzef("App is still foreground");
        }
    }
}
