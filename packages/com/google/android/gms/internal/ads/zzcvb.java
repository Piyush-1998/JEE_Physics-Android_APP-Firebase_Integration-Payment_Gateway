package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcvb implements zzcaz {
    private final zzbbg zzbop;
    private final zzdkx zzfpf;
    private final zzdln zzfqn;
    private final zzcih zzfzy;
    private final zzdvt<zzchw> zzgmk;
    private final zzbfq zzgnu;
    private final Context zzvr;

    private zzcvb(Context context, zzcih zzcihVar, zzdln zzdlnVar, zzbbg zzbbgVar, zzdkx zzdkxVar, zzdvt<zzchw> zzdvtVar, zzbfq zzbfqVar) {
        this.zzvr = context;
        this.zzfzy = zzcihVar;
        this.zzfqn = zzdlnVar;
        this.zzbop = zzbbgVar;
        this.zzfpf = zzdkxVar;
        this.zzgmk = zzdvtVar;
        this.zzgnu = zzbfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zza(boolean z, Context context) {
        zzbfq zzbfqVar;
        zzbfq zzbfqVar2;
        zzchw zzchwVar = (zzchw) zzdvl.zzb(this.zzgmk);
        try {
            zzdkx zzdkxVar = this.zzfpf;
            if (!this.zzgnu.zzabt()) {
                zzbfqVar2 = this.zzgnu;
            } else {
                if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcnw)).booleanValue()) {
                    zzbfqVar2 = this.zzgnu;
                } else {
                    final zzbfq zzc = this.zzfzy.zzc(this.zzfqn.zzbpb);
                    zzahq.zza(zzc, zzchwVar.zzagi());
                    final zzcix zzcixVar = new zzcix();
                    zzcixVar.zzc(this.zzvr, zzc.getView());
                    zzchwVar.zzafo().zzb(zzc, true);
                    zzc.zzabe().zza(new zzbhf(zzcixVar, zzc) { // from class: com.google.android.gms.internal.ads.zzcve
                        private final zzbfq zzgak;
                        private final zzcix zzgmi;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgmi = zzcixVar;
                            this.zzgak = zzc;
                        }

                        @Override // com.google.android.gms.internal.ads.zzbhf
                        public final void zzak(boolean z2) {
                            zzcix zzcixVar2 = this.zzgmi;
                            zzbfq zzbfqVar3 = this.zzgak;
                            zzcixVar2.zzanp();
                            zzbfqVar3.zzaay();
                            zzbfqVar3.zzabe().zzacd();
                        }
                    });
                    zzbhc zzabe = zzc.zzabe();
                    zzc.getClass();
                    zzabe.zza(zzcvd.zzq(zzc));
                    zzc.zzb(zzdkxVar.zzhao.zzdos, zzdkxVar.zzhao.zzdou, null);
                    zzbfqVar = zzc;
                    zzbfqVar.zzax(true);
                    com.google.android.gms.ads.internal.zzp.zzkp();
                    com.google.android.gms.ads.internal.zzi zziVar = new com.google.android.gms.ads.internal.zzi(false, zzayh.zzbc(this.zzvr), false, 0.0f, -1, z, this.zzfpf.zzfnp, this.zzfpf.zzboz);
                    com.google.android.gms.ads.internal.zzp.zzko();
                    com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zzut) null, zzchwVar.zzagd(), (com.google.android.gms.ads.internal.overlay.zzt) null, zzbfqVar, this.zzfpf.zzhaw, this.zzbop, this.zzfpf.zzdrx, zziVar, this.zzfpf.zzhao.zzdos, this.zzfpf.zzhao.zzdou), true);
                }
            }
            zzbfqVar = zzbfqVar2;
            zzbfqVar.zzax(true);
            com.google.android.gms.ads.internal.zzp.zzkp();
            com.google.android.gms.ads.internal.zzi zziVar2 = new com.google.android.gms.ads.internal.zzi(false, zzayh.zzbc(this.zzvr), false, 0.0f, -1, z, this.zzfpf.zzfnp, this.zzfpf.zzboz);
            com.google.android.gms.ads.internal.zzp.zzko();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel((zzut) null, zzchwVar.zzagd(), (com.google.android.gms.ads.internal.overlay.zzt) null, zzbfqVar, this.zzfpf.zzhaw, this.zzbop, this.zzfpf.zzdrx, zziVar2, this.zzfpf.zzhao.zzdos, this.zzfpf.zzhao.zzdou), true);
        } catch (zzbgc e) {
            zzbbd.zzc("", e);
        }
    }
}
