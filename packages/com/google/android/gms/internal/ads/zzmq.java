package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzmq implements Runnable {
    private final /* synthetic */ zzmn zzbeg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmq(zzmn zzmnVar) {
        this.zzbeg = zzmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbeg.zzhr();
    }
}
