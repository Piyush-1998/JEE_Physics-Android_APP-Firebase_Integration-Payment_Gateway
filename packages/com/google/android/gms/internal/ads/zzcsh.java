package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsh implements zzcre<zzbni> {
    private final ScheduledExecutorService zzflf;
    private final zzbsx zzfue;
    private final zzdvw zzgay;
    private final zzboe zzglv;
    private final zzcrn zzglw;

    public zzcsh(zzboe zzboeVar, zzcrn zzcrnVar, zzbsx zzbsxVar, ScheduledExecutorService scheduledExecutorService, zzdvw zzdvwVar) {
        this.zzglv = zzboeVar;
        this.zzglw = zzcrnVar;
        this.zzfue = zzbsxVar;
        this.zzflf = scheduledExecutorService;
        this.zzgay = zzdvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return zzdljVar.zzhbp.zzfqn.zzasp() != null && this.zzglw.zza(zzdljVar, zzdkxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<zzbni> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        return this.zzgay.zze(new Callable(this, zzdljVar, zzdkxVar) { // from class: com.google.android.gms.internal.ads.zzcsk
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcsh zzgly;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgly = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgly.zzc(this.zzgbj, this.zzfoo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbni zzc(final zzdlj zzdljVar, final zzdkx zzdkxVar) throws Exception {
        return this.zzglv.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzbos(zzdljVar.zzhbp.zzfqn.zzasp(), new Runnable(this, zzdljVar, zzdkxVar) { // from class: com.google.android.gms.internal.ads.zzcsj
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcsh zzgly;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgly = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgly.zzd(this.zzgbj, this.zzfoo);
            }
        })).zzafy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzdlj zzdljVar, zzdkx zzdkxVar) {
        zzdvl.zza(zzdvl.zza(this.zzglw.zzb(zzdljVar, zzdkxVar), zzdkxVar.zzhax, TimeUnit.SECONDS, this.zzflf), new zzcsm(this), this.zzgay);
    }
}
