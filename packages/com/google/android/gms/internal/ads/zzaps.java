package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzaps implements Runnable {
    private final /* synthetic */ zzapq zzdlx;
    private final /* synthetic */ AdOverlayInfoParcel zzdmf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaps(zzapq zzapqVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdlx = zzapqVar;
        this.zzdmf = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzp.zzko();
        activity = this.zzdlx.zzdly;
        com.google.android.gms.ads.internal.overlay.zzn.zza(activity, this.zzdmf, true);
    }
}
