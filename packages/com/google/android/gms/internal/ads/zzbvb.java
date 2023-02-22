package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbvb extends zzbxe<zzbvf> {
    private final Clock zzbpw;
    private boolean zzfmt;
    private final ScheduledExecutorService zzfnh;
    private long zzfnj;
    private long zzfnk;
    private ScheduledFuture<?> zzftc;

    public zzbvb(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzfnj = -1L;
        this.zzfnk = -1L;
        this.zzfmt = false;
        this.zzfnh = scheduledExecutorService;
        this.zzbpw = clock;
    }

    public final synchronized void onPause() {
        if (!this.zzfmt) {
            if (this.zzftc != null && !this.zzftc.isCancelled()) {
                this.zzftc.cancel(true);
                this.zzfnk = this.zzfnj - this.zzbpw.elapsedRealtime();
            } else {
                this.zzfnk = -1L;
            }
            this.zzfmt = true;
        }
    }

    public final synchronized void onResume() {
        if (this.zzfmt) {
            if (this.zzfnk > 0 && this.zzftc.isCancelled()) {
                zzfe(this.zzfnk);
            }
            this.zzfmt = false;
        }
    }

    public final synchronized void zzajn() {
        this.zzfmt = false;
        zzfe(0L);
    }

    public final synchronized void zzdw(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.zzfmt) {
            if (this.zzfnk <= 0 || millis >= this.zzfnk) {
                millis = this.zzfnk;
            }
            this.zzfnk = millis;
            return;
        }
        if (this.zzbpw.elapsedRealtime() > this.zzfnj || this.zzfnj - this.zzbpw.elapsedRealtime() > millis) {
            zzfe(millis);
        }
    }

    private final synchronized void zzfe(long j) {
        if (this.zzftc != null && !this.zzftc.isDone()) {
            this.zzftc.cancel(true);
        }
        this.zzfnj = this.zzbpw.elapsedRealtime() + j;
        this.zzftc = this.zzfnh.schedule(new zzbvc(this), j, TimeUnit.MILLISECONDS);
    }

    public final void zzajo() {
        zza(zzbva.zzfst);
    }
}
