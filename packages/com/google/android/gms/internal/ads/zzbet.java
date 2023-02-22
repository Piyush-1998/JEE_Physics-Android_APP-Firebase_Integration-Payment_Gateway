package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbet implements Runnable {
    private final /* synthetic */ zzbeq zzekr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbet(zzbeq zzbeqVar) {
        this.zzekr = zzbeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzp.zzll().zzb(this.zzekr);
    }
}
