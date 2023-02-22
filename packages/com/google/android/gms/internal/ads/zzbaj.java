package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbaj {
    private long zzecm;
    private long zzecn = Long.MIN_VALUE;
    private final Object lock = new Object();

    public zzbaj(long j) {
        this.zzecm = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
            if (this.zzecn + this.zzecm > elapsedRealtime) {
                return false;
            }
            this.zzecn = elapsedRealtime;
            return true;
        }
    }

    public final void zzfb(long j) {
        synchronized (this.lock) {
            this.zzecm = j;
        }
    }
}
