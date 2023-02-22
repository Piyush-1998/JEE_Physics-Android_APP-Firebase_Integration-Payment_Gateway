package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwe<AdT> implements zzcre<AdT> {
    private final zzdpf zzfqo;
    private final zzdvw zzgoi;
    private final zzabq zzgop;
    private final zzcwf<AdT> zzgoy;

    public zzcwe(zzdpf zzdpfVar, zzdvw zzdvwVar, zzabq zzabqVar, zzcwf<AdT> zzcwfVar) {
        this.zzfqo = zzdpfVar;
        this.zzgoi = zzdvwVar;
        this.zzgop = zzabqVar;
        this.zzgoy = zzcwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (this.zzgop == null || zzdkxVar.zzhao == null || zzdkxVar.zzhao.zzdou == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<AdT> zzb(zzdlj zzdljVar, zzdkx zzdkxVar) {
        zzbbq zzbbqVar = new zzbbq();
        zzcwm zzcwmVar = new zzcwm();
        zzcwmVar.zza(new zzcwg(this, zzbbqVar, zzdljVar, zzdkxVar, zzcwmVar));
        final zzabj zzabjVar = new zzabj(zzcwmVar, zzdkxVar.zzhao.zzdos, zzdkxVar.zzhao.zzdou);
        return this.zzfqo.zzu(zzdpg.CUSTOM_RENDER_SYN).zza(new zzdop(this, zzabjVar) { // from class: com.google.android.gms.internal.ads.zzcwd
            private final zzabj zzgos;
            private final zzcwe zzgox;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgox = this;
                this.zzgos = zzabjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdop
            public final void run() {
                this.zzgox.zzb(this.zzgos);
            }
        }, this.zzgoi).zzw(zzdpg.CUSTOM_RENDER_ACK).zze(zzbbqVar).zzauz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzabj zzabjVar) throws Exception {
        this.zzgop.zza(zzabjVar);
    }
}
