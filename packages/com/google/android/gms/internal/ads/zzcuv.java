package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcuv implements zzcre<zzchu> {
    private final zzbbg zzbop;
    private final Executor zzfmk;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzchx zzgno;
    private final Context zzvr;

    public zzcuv(Context context, zzbbg zzbbgVar, zzdln zzdlnVar, Executor executor, zzchx zzchxVar, zzcih zzcihVar) {
        this.zzvr = context;
        this.zzfqn = zzdlnVar;
        this.zzgno = zzchxVar;
        this.zzfmk = executor;
        this.zzbop = zzbbgVar;
        this.zzfzy = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (zzdkxVar.zzhao == null || zzdkxVar.zzhao.zzdou == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<zzchu> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        final zzcix zzcixVar = new zzcix();
        zzdvt<zzchu> zzb = zzdvl.zzb(zzdvl.zzaf(null), new zzduv(this, zzdkxVar, zzcixVar, zzdljVar) { // from class: com.google.android.gms.internal.ads.zzcuy
            private final zzdkx zzgmf;
            private final zzcix zzgmg;
            private final zzdlj zzgmh;
            private final zzcuv zzgns;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgns = this;
                this.zzgmf = zzdkxVar;
                this.zzgmg = zzcixVar;
                this.zzgmh = zzdljVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgns.zzb(this.zzgmf, this.zzgmg, this.zzgmh, obj);
            }
        }, this.zzfmk);
        zzcixVar.getClass();
        zzb.addListener(zzcux.zza(zzcixVar), this.zzfmk);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(final zzdkx zzdkxVar, zzcix zzcixVar, zzdlj zzdljVar, Object obj) throws Exception {
        zzdvt<?> zza;
        final zzbfq zza2 = this.zzfzy.zza(this.zzfqn.zzbpb, zzdkxVar.zzent);
        zza2.zzba(zzdkxVar.zzdsu);
        zzcixVar.zzc(this.zzvr, zza2.getView());
        zzbbq zzbbqVar = new zzbbq();
        final zzchw zza3 = this.zzgno.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzchv(new zzcvb(this.zzvr, this.zzfzy, this.zzfqn, this.zzbop, zzdkxVar, zzbbqVar, zza2), zza2));
        zzbbqVar.set(zza3);
        zzahq.zza(zza2, zza3.zzagi());
        zza3.zzaep().zza(new zzbtm(zza2) { // from class: com.google.android.gms.internal.ads.zzcva
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
        return zzdvl.zzb(zza, new zzdsl(this, zza2, zzdkxVar, zza3) { // from class: com.google.android.gms.internal.ads.zzcuz
            private final zzdkx zzfoo;
            private final zzbfq zzgak;
            private final zzcuv zzgns;
            private final zzchw zzgnt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgns = this;
                this.zzgak = zza2;
                this.zzfoo = zzdkxVar;
                this.zzgnt = zza3;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj2) {
                zzbfq zzbfqVar = this.zzgak;
                zzdkx zzdkxVar2 = this.zzfoo;
                zzchw zzchwVar = this.zzgnt;
                if (zzdkxVar2.zzduo) {
                    zzbfqVar.zzabr();
                }
                zzbfqVar.zzaay();
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcns)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzp.zzkr();
                    zzaym.zza(zzbfqVar);
                }
                return zzchwVar.zzagh();
            }
        }, this.zzfmk);
    }
}
