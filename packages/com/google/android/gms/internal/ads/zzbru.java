package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbru implements zzbsu, zzbti, zzbwt, zzbyh {
    private final Executor executor;
    private final zzbtl zzfrn;
    private final zzdkx zzfro;
    private final ScheduledExecutorService zzfrp;
    private zzdwe<Boolean> zzfrq = zzdwe.zzaxn();
    private ScheduledFuture<?> zzfrr;

    public zzbru(zzbtl zzbtlVar, zzdkx zzdkxVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzfrn = zzbtlVar;
        this.zzfro = zzdkxVar;
        this.zzfrp = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzaiz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzaja() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zzb(zzatj zzatjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdOpened() {
        if (this.zzfro.zzhaz == 0 || this.zzfro.zzhaz == 1) {
            this.zzfrn.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzaix() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpx)).booleanValue() && this.zzfro.zzhaz == 2) {
            if (this.zzfro.zzham == 0) {
                this.zzfrn.onAdImpression();
                return;
            }
            zzdvl.zza(this.zzfrq, new zzbrw(this), this.executor);
            this.zzfrr = this.zzfrp.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbrt
                private final zzbru zzfrm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfrm = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfrm.zzajb();
                }
            }, this.zzfro.zzham, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final synchronized void zzf(zzuw zzuwVar) {
        if (this.zzfrq.isDone()) {
            return;
        }
        if (this.zzfrr != null) {
            this.zzfrr.cancel(true);
        }
        this.zzfrq.setException(new Exception());
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzaiy() {
        if (this.zzfrq.isDone()) {
            return;
        }
        if (this.zzfrr != null) {
            this.zzfrr.cancel(true);
        }
        this.zzfrq.set(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzajb() {
        synchronized (this) {
            if (this.zzfrq.isDone()) {
                return;
            }
            this.zzfrq.set(true);
        }
    }
}
