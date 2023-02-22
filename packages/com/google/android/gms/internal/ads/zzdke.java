package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdke implements zzdvi<zzchu> {
    private final /* synthetic */ zzcya zzgre;
    private final /* synthetic */ zzdkj zzgzp;
    final /* synthetic */ zzdkd zzgzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdke(zzdkd zzdkdVar, zzcya zzcyaVar, zzdkj zzdkjVar) {
        this.zzgzq = zzdkdVar;
        this.zzgre = zzcyaVar;
        this.zzgzp = zzdkjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzdiz zzdizVar;
        zzdje zzdjeVar;
        zzcia zze;
        Executor executor;
        final zzuw zze2 = zzcmt.zze(th);
        synchronized (this.zzgzq) {
            zzdizVar = this.zzgzq.zzgwx;
            zzchx zzchxVar = (zzchx) zzdizVar.zzasb();
            if (zzchxVar != null) {
                zzchxVar.zzafd().zzg(zze2);
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
                    executor = this.zzgzq.zzfmk;
                    executor.execute(new Runnable(this, zze2) { // from class: com.google.android.gms.internal.ads.zzdkg
                        private final zzuw zzgqk;
                        private final zzdke zzgzr;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgzr = this;
                            this.zzgqk = zze2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdje zzdjeVar2;
                            zzdke zzdkeVar = this.zzgzr;
                            zzuw zzuwVar = this.zzgqk;
                            zzdjeVar2 = zzdkeVar.zzgzq.zzgzn;
                            zzdjeVar2.zzg(zzuwVar);
                        }
                    });
                }
            } else {
                zzdjeVar = this.zzgzq.zzgzn;
                zzdjeVar.zzg(zze2);
                zze = this.zzgzq.zze(this.zzgzp);
                zze.zzage().zzafc().zzaiw().zzajs();
            }
            zzdly.zza(zze2.errorCode, th, "RewardedAdLoader.onFailure");
            this.zzgre.zzaqe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzchu zzchuVar) {
        zzdje zzdjeVar;
        Executor executor;
        zzdje zzdjeVar2;
        zzchu zzchuVar2 = zzchuVar;
        synchronized (this.zzgzq) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
                zzbwh zzaio = zzchuVar2.zzaio();
                zzdjeVar2 = this.zzgzq.zzgzn;
                zzaio.zza(zzdjeVar2);
            }
            this.zzgre.onSuccess(zzchuVar2);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
                executor = this.zzgzq.zzfmk;
                executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdkh
                    private final zzdke zzgzr;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgzr = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdje zzdjeVar3;
                        zzdjeVar3 = this.zzgzr.zzgzq.zzgzn;
                        zzdjeVar3.onAdLoaded();
                    }
                });
            }
            zzdjeVar = this.zzgzq.zzgzn;
            zzdjeVar.onAdMetadataChanged();
        }
    }
}
