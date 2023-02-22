package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzee implements Runnable {
    private final /* synthetic */ int zzxu;
    private final /* synthetic */ int zzxv;
    private final /* synthetic */ int zzxw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzee(zzdy zzdyVar, int i, int i2, int i3) {
        this.zzxu = i;
        this.zzxv = i2;
        this.zzxw = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdpy zzdpyVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdy.zzxe;
            zzdpVar.zza(MotionEvent.obtain(0L, this.zzxu, 0, this.zzxv, this.zzxw, 0));
        } catch (Exception e) {
            zzdpyVar = zzdy.zzxg;
            zzdpyVar.zza(2022, -1L, e);
        }
    }
}
