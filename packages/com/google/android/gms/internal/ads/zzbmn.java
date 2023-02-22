package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmn implements zzrh {
    private final Clock zzbpw;
    private final ScheduledExecutorService zzfnh;
    private ScheduledFuture<?> zzfni;
    private long zzfnj = -1;
    private long zzfnk = -1;
    private Runnable zzdze = null;
    private boolean zzfnl = false;

    public zzbmn(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zzfnh = scheduledExecutorService;
        this.zzbpw = clock;
        com.google.android.gms.ads.internal.zzp.zzks().zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzp(boolean z) {
        if (z) {
            zzahd();
        } else {
            zzahc();
        }
    }

    public final synchronized void zza(int i, Runnable runnable) {
        this.zzdze = runnable;
        long j = i;
        this.zzfnj = this.zzbpw.elapsedRealtime() + j;
        this.zzfni = this.zzfnh.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzahc() {
        if (!this.zzfnl) {
            if (this.zzfni != null && !this.zzfni.isDone()) {
                this.zzfni.cancel(true);
                this.zzfnk = this.zzfnj - this.zzbpw.elapsedRealtime();
            } else {
                this.zzfnk = -1L;
            }
            this.zzfnl = true;
        }
    }

    private final synchronized void zzahd() {
        if (this.zzfnl) {
            if (this.zzfnk > 0 && this.zzfni != null && this.zzfni.isCancelled()) {
                this.zzfni = this.zzfnh.schedule(this.zzdze, this.zzfnk, TimeUnit.MILLISECONDS);
            }
            this.zzfnl = false;
        }
    }
}
