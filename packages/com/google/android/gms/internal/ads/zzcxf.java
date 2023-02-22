package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcxf implements Runnable {
    private final zzcxm zzgqf;

    private zzcxf(zzcxm zzcxmVar) {
        this.zzgqf = zzcxmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzcxm zzcxmVar) {
        return new zzcxf(zzcxmVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgqf.onAdLoaded();
    }
}
