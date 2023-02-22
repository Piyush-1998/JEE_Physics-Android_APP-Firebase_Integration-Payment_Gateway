package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxp {
    private final Object lock;
    private volatile int zzdys;
    private volatile long zzdyt;

    private zzaxp() {
        this.lock = new Object();
        this.zzdys = zzaxo.zzdyo;
        this.zzdyt = 0L;
    }

    public final void zzwf() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzdys == zzaxo.zzdyq) {
                if (this.zzdyt + ((Long) zzwe.zzpu().zzd(zzaat.zzcvk)).longValue() <= currentTimeMillis) {
                    this.zzdys = zzaxo.zzdyo;
                }
            }
        }
        long currentTimeMillis2 = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzdys != 2) {
                return;
            }
            this.zzdys = 3;
            if (this.zzdys == zzaxo.zzdyq) {
                this.zzdyt = currentTimeMillis2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaxp(zzaxm zzaxmVar) {
        this();
    }
}
