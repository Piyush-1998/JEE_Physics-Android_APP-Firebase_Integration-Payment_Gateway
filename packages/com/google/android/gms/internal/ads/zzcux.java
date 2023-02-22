package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcux implements Runnable {
    private final zzcix zzgmi;

    private zzcux(zzcix zzcixVar) {
        this.zzgmi = zzcixVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zza(zzcix zzcixVar) {
        return new zzcux(zzcixVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzgmi.zzanp();
    }
}
