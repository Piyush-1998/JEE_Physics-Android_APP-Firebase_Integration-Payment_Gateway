package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcxn implements zzdvi<zzbzr> {
    private final /* synthetic */ zzcar zzgqo;
    final /* synthetic */ zzcxo zzgqp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxn(zzcxo zzcxoVar, zzcar zzcarVar) {
        this.zzgqp = zzcxoVar;
        this.zzgqo = zzcarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzbii zzbiiVar;
        zzbii zzbiiVar2;
        final zzuw zze = zzcmt.zze(th);
        synchronized (this.zzgqp) {
            this.zzgqp.zzgqd = null;
            this.zzgqo.zzafd().zzg(zze);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
                zzbiiVar = this.zzgqp.zzgmy;
                zzbiiVar.zzadj().execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzcxs
                    private final zzuw zzgqk;
                    private final zzcxn zzgqt;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgqt = this;
                        this.zzgqk = zze;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcxm zzcxmVar;
                        zzcxn zzcxnVar = this.zzgqt;
                        zzuw zzuwVar = this.zzgqk;
                        zzcxmVar = zzcxnVar.zzgqp.zzgpw;
                        zzcxmVar.zzg(zzuwVar);
                    }
                });
                zzbiiVar2 = this.zzgqp.zzgmy;
                zzbiiVar2.zzadj().execute(new Runnable(this, zze) { // from class: com.google.android.gms.internal.ads.zzcxr
                    private final zzuw zzgqk;
                    private final zzcxn zzgqt;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgqt = this;
                        this.zzgqk = zze;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdje zzdjeVar;
                        zzcxn zzcxnVar = this.zzgqt;
                        zzuw zzuwVar = this.zzgqk;
                        zzdjeVar = zzcxnVar.zzgqp.zzgqq;
                        zzdjeVar.zzg(zzuwVar);
                    }
                });
            }
            zzdly.zza(zze.errorCode, th, "InterstitialAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbzr zzbzrVar) {
        zzbii zzbiiVar;
        zzbii zzbiiVar2;
        zzcxm zzcxmVar;
        zzcxl zzcxlVar;
        zzcxh zzcxhVar;
        zzdje zzdjeVar;
        zzbzr zzbzrVar2 = zzbzrVar;
        synchronized (this.zzgqp) {
            this.zzgqp.zzgqd = null;
            this.zzgqp.zzgqr = zzbzrVar2;
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxs)).booleanValue()) {
                zzbwh zzaio = zzbzrVar2.zzaio();
                zzcxmVar = this.zzgqp.zzgpw;
                zzbwh zza = zzaio.zza(zzcxmVar);
                zzcxlVar = this.zzgqp.zzgpy;
                zzbwh zza2 = zza.zza(zzcxlVar);
                zzcxhVar = this.zzgqp.zzgpz;
                zzbwh zza3 = zza2.zza(zzcxhVar);
                zzdjeVar = this.zzgqp.zzgqq;
                zza3.zza(zzdjeVar);
            }
            zzbzrVar2.zzahw();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxs)).booleanValue()) {
                zzbiiVar = this.zzgqp.zzgmy;
                zzbiiVar.zzadj().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcxq
                    private final zzcxn zzgqt;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgqt = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcxm zzcxmVar2;
                        zzcxmVar2 = this.zzgqt.zzgqp.zzgpw;
                        zzcxmVar2.onAdLoaded();
                    }
                });
                zzbiiVar2 = this.zzgqp.zzgmy;
                zzbiiVar2.zzadj().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcxp
                    private final zzcxn zzgqt;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgqt = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdje zzdjeVar2;
                        zzdjeVar2 = this.zzgqt.zzgqp.zzgqq;
                        zzdjeVar2.onAdLoaded();
                    }
                });
            }
        }
    }
}
