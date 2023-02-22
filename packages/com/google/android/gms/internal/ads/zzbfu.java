package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbfu implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzavu zzemm;
    private final /* synthetic */ int zzemn;
    private final /* synthetic */ zzbft zzemo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfu(zzbft zzbftVar, View view, zzavu zzavuVar, int i) {
        this.zzemo = zzbftVar;
        this.val$view = view;
        this.zzemm = zzavuVar;
        this.zzemn = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzemo.zza(this.val$view, this.zzemm, this.zzemn - 1);
    }
}
