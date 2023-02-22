package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzayi implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzayh zzean;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayi(zzayh zzayhVar, Context context) {
        this.zzean = zzayhVar;
        this.val$context = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.zzean.zzeak;
        synchronized (obj) {
            this.zzean.zzbif = zzayh.zzar(this.val$context);
            obj2 = this.zzean.zzeak;
            obj2.notifyAll();
        }
    }
}
