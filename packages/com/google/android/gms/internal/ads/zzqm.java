package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqm implements Runnable {
    private final /* synthetic */ zzqg zzbmt;
    private final /* synthetic */ Surface zzbnb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqm(zzqg zzqgVar, Surface surface) {
        this.zzbmt = zzqgVar;
        this.zzbnb = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqd zzqdVar;
        zzqdVar = this.zzbmt.zzbmu;
        zzqdVar.zza(this.zzbnb);
    }
}
