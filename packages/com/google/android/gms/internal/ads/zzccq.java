package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzccq implements Runnable {
    private final zzcdd zzfxi;

    private zzccq(zzcdd zzcddVar) {
        this.zzfxi = zzcddVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcdd zzcddVar) {
        return new zzccq(zzcddVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzfxi.zzale();
    }
}
