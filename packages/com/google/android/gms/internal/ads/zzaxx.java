package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxx implements Runnable {
    private final /* synthetic */ zzaxu zzdzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxx(zzaxu zzaxuVar) {
        this.zzdzk = zzaxuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdzk.thread = Thread.currentThread();
        this.zzdzk.zzuy();
    }
}
