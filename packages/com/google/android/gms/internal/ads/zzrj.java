package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzrj implements Runnable {
    private final /* synthetic */ View zzbsz;
    private final /* synthetic */ zzrk zzbta;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrj(zzrk zzrkVar, View view) {
        this.zzbta = zzrkVar;
        this.zzbsz = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbta.zzj(this.zzbsz);
    }
}
