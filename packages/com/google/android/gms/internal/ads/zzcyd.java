package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcyd implements zzdvi<zzbpd> {
    private final /* synthetic */ zzcya zzgre;
    private final /* synthetic */ zzcbn zzgrf;
    final /* synthetic */ zzcyc zzgrg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcyd(zzcyc zzcycVar, zzcya zzcyaVar, zzcbn zzcbnVar) {
        this.zzgrg = zzcycVar;
        this.zzgre = zzcyaVar;
        this.zzgrf = zzcbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzbii zzbiiVar;
        final zzuw zze = zzcmt.zze(th);
        this.zzgrf.zzafd().zzg(zze);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
            zzbiiVar = this.zzgrg.zzgmy;
            zzbiiVar.zzadj().execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzcyf
                private final zzuw zzgqk;
                private final zzcyd zzgrh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgrh = this;
                    this.zzgqk = zze;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcxw zzcxwVar;
                    zzcyd zzcydVar = this.zzgrh;
                    zzuw zzuwVar = this.zzgqk;
                    zzcxwVar = zzcydVar.zzgrg.zzgrc;
                    zzcxwVar.zzaqj().zzg(zzuwVar);
                }
            });
        }
        zzdly.zza(zze.errorCode, th, "NativeAdLoader.onFailure");
        this.zzgre.zzaqe();
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbpd zzbpdVar) {
        zzbii zzbiiVar;
        zzcxw zzcxwVar;
        zzbpd zzbpdVar2 = zzbpdVar;
        synchronized (this.zzgrg) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
                zzbwh zzaio = zzbpdVar2.zzaio();
                zzcxwVar = this.zzgrg.zzgrc;
                zzaio.zza(zzcxwVar.zzaqg());
            }
            this.zzgre.onSuccess(zzbpdVar2);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxt)).booleanValue()) {
                zzbiiVar = this.zzgrg.zzgmy;
                zzbiiVar.zzadj().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcyg
                    private final zzcyd zzgrh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgrh = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcxw zzcxwVar2;
                        zzcxwVar2 = this.zzgrh.zzgrg.zzgrc;
                        zzcxwVar2.zzaqi().onAdLoaded();
                    }
                });
            }
        }
    }
}
