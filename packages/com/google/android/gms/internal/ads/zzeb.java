package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzeb implements Runnable {
    private final /* synthetic */ MotionEvent zzxs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeb(zzdy zzdyVar, MotionEvent motionEvent) {
        this.zzxs = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdpy zzdpyVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdy.zzxe;
            zzdpVar.zza(this.zzxs);
        } catch (Exception e) {
            zzdpyVar = zzdy.zzxg;
            zzdpyVar.zza(2022, -1L, e);
        }
    }
}
