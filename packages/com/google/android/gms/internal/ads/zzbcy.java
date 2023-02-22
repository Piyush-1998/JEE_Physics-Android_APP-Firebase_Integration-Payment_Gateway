package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbcy implements Runnable {
    private final /* synthetic */ zzbcm zzegj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcy(zzbcz zzbczVar, zzbcm zzbcmVar) {
        this.zzegj = zzbcmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzegj.zzzc();
    }
}
