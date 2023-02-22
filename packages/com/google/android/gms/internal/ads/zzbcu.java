package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbcu implements Runnable {
    private final /* synthetic */ zzbcr zzegd;
    private final /* synthetic */ boolean zzegg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcu(zzbcr zzbcrVar, boolean z) {
        this.zzegd = zzbcrVar;
        this.zzegg = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzegd.zzd("windowVisibilityChanged", "isVisible", String.valueOf(this.zzegg));
    }
}
