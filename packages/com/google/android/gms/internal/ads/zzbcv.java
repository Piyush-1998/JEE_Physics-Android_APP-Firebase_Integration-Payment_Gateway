package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbcv implements Runnable {
    private final /* synthetic */ zzbcr zzegd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcv(zzbcr zzbcrVar) {
        this.zzegd = zzbcrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzegd.zzd("surfaceDestroyed", new String[0]);
    }
}
