package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcrr implements Runnable {
    private final zzbfq zzepi;

    private zzcrr(zzbfq zzbfqVar) {
        this.zzepi = zzbfqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzh(zzbfq zzbfqVar) {
        return new zzcrr(zzbfqVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzepi.zzabr();
    }
}
