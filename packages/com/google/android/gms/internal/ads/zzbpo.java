package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpo {
    private final Executor executor;
    private volatile boolean zzaey = true;
    private final ScheduledExecutorService zzflf;
    private final zzdvt<zzbpj> zzfqb;

    public zzbpo(Executor executor, ScheduledExecutorService scheduledExecutorService, zzdvt<zzbpj> zzdvtVar) {
        this.executor = executor;
        this.zzflf = scheduledExecutorService;
        this.zzfqb = zzdvtVar;
    }

    public final void zza(zzdvi<zzbpd> zzdviVar) {
        zzdvl.zza(this.zzfqb, new zzbpr(this, zzdviVar), this.executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(List<? extends zzdvt<? extends zzbpd>> list, final zzdvi<zzbpd> zzdviVar) {
        if (list == null || list.isEmpty()) {
            this.executor.execute(new Runnable(zzdviVar) { // from class: com.google.android.gms.internal.ads.zzbpn
                private final zzdvi zzfqa;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfqa = zzdviVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfqa.zzb(new zzcmt(zzdmd.zzhcq));
                }
            });
            return;
        }
        zzdvt zzaf = zzdvl.zzaf(null);
        for (final zzdvt<? extends zzbpd> zzdvtVar : list) {
            zzaf = zzdvl.zzb(zzdvl.zzb(zzaf, Throwable.class, new zzduv(zzdviVar) { // from class: com.google.android.gms.internal.ads.zzbpq
                private final zzdvi zzfqa;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfqa = zzdviVar;
                }

                @Override // com.google.android.gms.internal.ads.zzduv
                public final zzdvt zzf(Object obj) {
                    this.zzfqa.zzb((Throwable) obj);
                    return zzdvl.zzaf(null);
                }
            }, this.executor), new zzduv(this, zzdviVar, zzdvtVar) { // from class: com.google.android.gms.internal.ads.zzbpp
                private final zzbpo zzfqc;
                private final zzdvi zzfqd;
                private final zzdvt zzfqe;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfqc = this;
                    this.zzfqd = zzdviVar;
                    this.zzfqe = zzdvtVar;
                }

                @Override // com.google.android.gms.internal.ads.zzduv
                public final zzdvt zzf(Object obj) {
                    return this.zzfqc.zza(this.zzfqd, this.zzfqe, (zzbpd) obj);
                }
            }, this.executor);
        }
        zzdvl.zza(zzaf, new zzbpu(this, zzdviVar), this.executor);
    }

    public final boolean isLoading() {
        return this.zzaey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaip() {
        zzbbi.zzedy.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbps
            private final zzbpo zzfqc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqc = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfqc.zzaiq();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaiq() {
        this.zzaey = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdvi zzdviVar, zzdvt zzdvtVar, zzbpd zzbpdVar) throws Exception {
        if (zzbpdVar != null) {
            zzdviVar.onSuccess(zzbpdVar);
        }
        return zzdvl.zza(zzdvtVar, zzacx.zzdbv.get().longValue(), TimeUnit.MILLISECONDS, this.zzflf);
    }
}
