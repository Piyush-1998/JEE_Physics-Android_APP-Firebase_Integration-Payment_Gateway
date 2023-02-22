package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsq implements zzcre<zzbzr> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzcar zzglr;
    private final Context zzvr;

    public zzcsq(Context context, zzbbg zzbbgVar, zzdln zzdlnVar, Executor executor, zzcar zzcarVar, zzcih zzcihVar) {
        this.zzvr = context;
        this.zzfqn = zzdlnVar;
        this.zzglr = zzcarVar;
        this.zzfmk = executor;
        this.zzbop = zzbbgVar;
        this.zzfzy = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (zzdkxVar.zzhao == null || zzdkxVar.zzhao.zzdou == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<zzbzr> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        final zzcix zzcixVar = new zzcix();
        zzdvt<zzbzr> zzb = zzdvl.zzb(zzdvl.zzaf(null), new zzduv(this, zzdkxVar, zzcixVar, zzdljVar) { // from class: com.google.android.gms.internal.ads.zzcsp
            private final zzcsq zzgme;
            private final zzdkx zzgmf;
            private final zzcix zzgmg;
            private final zzdlj zzgmh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgme = this;
                this.zzgmf = zzdkxVar;
                this.zzgmg = zzcixVar;
                this.zzgmh = zzdljVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgme.zza(this.zzgmf, this.zzgmg, this.zzgmh, obj);
            }
        }, this.zzfmk);
        zzcixVar.getClass();
        zzb.addListener(zzcss.zza(zzcixVar), this.zzfmk);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(final zzdkx zzdkxVar, zzcix zzcixVar, zzdlj zzdljVar, Object obj) throws Exception {
        zzdvt<?> zza;
        final zzbfq zza2 = this.zzfzy.zza(this.zzfqn.zzbpb, zzdkxVar.zzent);
        zza2.zzba(zzdkxVar.zzdsu);
        zzcixVar.zzc(this.zzvr, zza2.getView());
        zzbbq zzbbqVar = new zzbbq();
        final zzbzt zza3 = this.zzglr.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzbzw(new zzcsw(this.zzvr, this.zzbop, zzbbqVar, zzdkxVar, zza2), zza2));
        zzbbqVar.set(zza3);
        zza3.zzaep().zza(new zzbtm(zza2) { // from class: com.google.android.gms.internal.ads.zzcsr
            private final zzbfq zzepi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepi = zza2;
            }

            @Override // com.google.android.gms.internal.ads.zzbtm
            public final void onAdImpression() {
                zzbfq zzbfqVar = this.zzepi;
                if (zzbfqVar.zzabe() != null) {
                    zzbfqVar.zzabe().zzacd();
                }
            }
        }, zzbbi.zzedz);
        zza3.zzafo().zzb(zza2, true);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwc)).booleanValue() && zzdkxVar.zzent) {
            zza = zzdvl.zzaf(null);
        } else {
            zza3.zzafo();
            zza = zzcij.zza(zza2, zzdkxVar.zzhao.zzdos, zzdkxVar.zzhao.zzdou);
        }
        return zzdvl.zzb(zza, new zzdsl(this, zza2, zzdkxVar, zza3) { // from class: com.google.android.gms.internal.ads.zzcsu
            private final zzdkx zzfoo;
            private final zzbfq zzgak;
            private final zzcsq zzgme;
            private final zzbzt zzgmj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgme = this;
                this.zzgak = zza2;
                this.zzfoo = zzdkxVar;
                this.zzgmj = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj2) {
                zzbfq zzbfqVar = this.zzgak;
                zzdkx zzdkxVar2 = this.zzfoo;
                zzbzt zzbztVar = this.zzgmj;
                if (zzdkxVar2.zzduo) {
                    zzbfqVar.zzabr();
                }
                zzbfqVar.zzaay();
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcns)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzp.zzkr();
                    zzaym.zza(zzbfqVar);
                }
                return zzbztVar.zzagb();
            }
        }, this.zzfmk);
    }
}
