package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcrn implements zzcre<zzbni> {
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzboe zzglh;
    private final zzdsl<zzdkx, zzayy> zzgli;
    private final Context zzvr;

    public zzcrn(zzboe zzboeVar, Context context, Executor executor, zzcih zzcihVar, zzdln zzdlnVar, zzdsl<zzdkx, zzayy> zzdslVar) {
        this.zzvr = context;
        this.zzglh = zzboeVar;
        this.zzfmk = executor;
        this.zzfzy = zzcihVar;
        this.zzfqn = zzdlnVar;
        this.zzgli = zzdslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (zzdkxVar.zzhao == null || zzdkxVar.zzhao.zzdou == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<zzbni> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzduv(this, zzdljVar, zzdkxVar) { // from class: com.google.android.gms.internal.ads.zzcrq
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcrn zzglk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglk = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzglk.zzb(this.zzgbj, this.zzfoo, obj);
            }
        }, this.zzfmk);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzbfq zzbfqVar) {
        zzbfqVar.zzaay();
        zzbgk zzzo = zzbfqVar.zzzo();
        if (this.zzfqn.zzhbt == null || zzzo == null) {
            return;
        }
        zzzo.zzb(this.zzfqn.zzhbt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(zzdlj zzdljVar, zzdkx zzdkxVar, Object obj) throws Exception {
        zzvj zzb = zzdls.zzb(this.zzvr, zzdkxVar.zzhaq);
        final zzbfq zzc = this.zzfzy.zzc(zzb);
        zzc.zzba(zzdkxVar.zzdsu);
        zzboe zzboeVar = this.zzglh;
        zzbpt zzbptVar = new zzbpt(zzdljVar, zzdkxVar, null);
        zzciy zzciyVar = new zzciy(this.zzvr, zzc.getView(), this.zzgli.apply(zzdkxVar));
        zzc.getClass();
        final zzbnh zza = zzboeVar.zza(zzbptVar, new zzbnl(zzciyVar, zzc, zzcrp.zzp(zzc), zzdls.zzf(zzb)));
        zza.zzafo().zzb(zzc, false);
        zza.zzaep().zza(new zzbtm(zzc) { // from class: com.google.android.gms.internal.ads.zzcrs
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
        zzdvt<?> zza2 = zzcij.zza(zzc, zzdkxVar.zzhao.zzdos, zzdkxVar.zzhao.zzdou);
        if (zzdkxVar.zzduo) {
            zzc.getClass();
            zza2.addListener(zzcrr.zzh(zzc), this.zzfmk);
        }
        zza2.addListener(new Runnable(this, zzc) { // from class: com.google.android.gms.internal.ads.zzcru
            private final zzbfq zzgak;
            private final zzcrn zzglk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzglk = this;
                this.zzgak = zzc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzglk.zzo(this.zzgak);
            }
        }, this.zzfmk);
        return zzdvl.zzb(zza2, new zzdsl(zza) { // from class: com.google.android.gms.internal.ads.zzcrt
            private final zzbnh zzgll;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgll = zza;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj2) {
                return this.zzgll.zzafs();
            }
        }, zzbbi.zzedz);
    }
}
