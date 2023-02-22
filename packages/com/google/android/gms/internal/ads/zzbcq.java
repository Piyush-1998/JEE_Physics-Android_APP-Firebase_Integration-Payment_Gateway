package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbcq implements Runnable {
    private final zzbcp zzefl;

    private zzbcq(zzbcp zzbcpVar) {
        this.zzefl = zzbcpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzbcp zzbcpVar) {
        return new zzbcq(zzbcpVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzefl.stop();
    }
}
