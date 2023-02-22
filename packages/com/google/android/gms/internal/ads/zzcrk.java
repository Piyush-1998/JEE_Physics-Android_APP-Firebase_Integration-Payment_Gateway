package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcrk implements zzcre<zzbnc> {
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzbmw zzglf;
    private final Context zzvr;

    public zzcrk(zzbmw zzbmwVar, Context context, Executor executor, zzcih zzcihVar, zzdln zzdlnVar) {
        this.zzvr = context;
        this.zzglf = zzbmwVar;
        this.zzfmk = executor;
        this.zzfzy = zzcihVar;
        this.zzfqn = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (zzdkxVar.zzhao == null || zzdkxVar.zzhao.zzdou == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<zzbnc> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzduv(this, zzdljVar, zzdkxVar) { // from class: com.google.android.gms.internal.ads.zzcrj
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcrk zzgle;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgle = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgle.zza(this.zzgbj, this.zzfoo, obj);
            }
        }, this.zzfmk);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdlj zzdljVar, zzdkx zzdkxVar, Object obj) throws Exception {
        zzvj zzb = zzdls.zzb(this.zzvr, zzdkxVar.zzhaq);
        final zzbfq zzc = this.zzfzy.zzc(zzb);
        final zzbmq zza = this.zzglf.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzbmp(zzc.getView(), zzc, zzdls.zzf(zzb), zzdkxVar.zzfnn, zzdkxVar.zzfno, zzdkxVar.zzfnp));
        zza.zzafo().zzb(zzc, false);
        zza.zzaep().zza(new zzbtm(zzc) { // from class: com.google.android.gms.internal.ads.zzcrm
            private final zzbfq zzepi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepi = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzbtm
            public final void onAdImpression() {
                zzbfq zzbfqVar = this.zzepi;
                if (zzbfqVar.zzabe() != null) {
                    zzbfqVar.zzabe().zzacd();
                }
            }
        }, zzbbi.zzedz);
        zza.zzafo();
        return zzdvl.zzb(zzcij.zza(zzc, zzdkxVar.zzhao.zzdos, zzdkxVar.zzhao.zzdou), new zzdsl(zza) { // from class: com.google.android.gms.internal.ads.zzcrl
            private final zzbmq zzglg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglg = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj2) {
                return this.zzglg.zzafn();
            }
        }, zzbbi.zzedz);
    }
}
