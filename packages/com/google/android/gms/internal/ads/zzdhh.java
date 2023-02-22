package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdhh implements zzdvi<zzbnc> {
    private final /* synthetic */ zzcya zzgre;
    private final /* synthetic */ zzdhj zzgxa;
    final /* synthetic */ zzdhc zzgxb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdhh(zzdhc zzdhcVar, zzcya zzcyaVar, zzdhj zzdhjVar) {
        this.zzgxb = zzdhcVar;
        this.zzgre = zzcyaVar;
        this.zzgxa = zzdhjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzdiz zzdizVar;
        zzdht zzdhtVar;
        zzbmv zzb;
        Executor executor;
        final zzuw zze = zzcmt.zze(th);
        synchronized (this.zzgxb) {
            this.zzgxb.zzgqd = null;
            zzdizVar = this.zzgxb.zzgwx;
            zzbmw zzbmwVar = (zzbmw) zzdizVar.zzasb();
            if (zzbmwVar != null) {
                zzbmwVar.zzafd().zzg(zze);
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxr)).booleanValue()) {
                    executor = this.zzgxb.zzfmk;
                    executor.execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzdhg
                        private final zzuw zzgqk;
                        private final zzdhh zzgwz;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgwz = this;
                            this.zzgqk = zze;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdht zzdhtVar2;
                            zzdhh zzdhhVar = this.zzgwz;
                            zzuw zzuwVar = this.zzgqk;
                            zzdhtVar2 = zzdhhVar.zzgxb.zzgww;
                            zzdhtVar2.zzg(zzuwVar);
                        }
                    });
                }
            } else {
                zzdhtVar = this.zzgxb.zzgww;
                zzdhtVar.zzg(zze);
                zzb = this.zzgxb.zzb(this.zzgxa);
                zzb.zzafl().zzafc().zzaiw().zzajs();
            }
            zzdly.zza(zze.errorCode, th, "AppOpenAdLoader.onFailure");
            this.zzgre.zzaqe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbnc zzbncVar) {
        zzdht zzdhtVar;
        zzbnc zzbncVar2 = zzbncVar;
        synchronized (this.zzgxb) {
            this.zzgxb.zzgqd = null;
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxr)).booleanValue()) {
                zzbwh zzaio = zzbncVar2.zzaio();
                zzdhtVar = this.zzgxb.zzgww;
                zzaio.zza(zzdhtVar);
            }
            this.zzgre.onSuccess(zzbncVar2);
        }
    }
}
