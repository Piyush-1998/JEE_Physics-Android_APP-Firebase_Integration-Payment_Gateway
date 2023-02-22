package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbfy {
    public static zzdvt<zzbfq> zza(final Context context, final zzbbg zzbbgVar, final String str, final zzeg zzegVar, final com.google.android.gms.ads.internal.zzb zzbVar) {
        return zzdvl.zzb(zzdvl.zzaf(null), new zzduv(context, zzegVar, zzbbgVar, zzbVar, str) { // from class: com.google.android.gms.internal.ads.zzbgb
            private final Context zzcxz;
            private final zzeg zzdgl;
            private final zzbbg zzene;
            private final com.google.android.gms.ads.internal.zzb zzenf;
            private final String zzeng;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
                this.zzdgl = zzegVar;
                this.zzene = zzbbgVar;
                this.zzenf = zzbVar;
                this.zzeng = str;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                Context context2 = this.zzcxz;
                zzeg zzegVar2 = this.zzdgl;
                zzbbg zzbbgVar2 = this.zzene;
                com.google.android.gms.ads.internal.zzb zzbVar2 = this.zzenf;
                String str2 = this.zzeng;
                com.google.android.gms.ads.internal.zzp.zzkq();
                zzbfq zza = zzbfy.zza(context2, zzbhj.zzacu(), "", false, false, zzegVar2, null, zzbbgVar2, null, null, zzbVar2, zzto.zzmy(), null, false);
                final zzbbr zzl = zzbbr.zzl(zza);
                zza.zzabe().zza(new zzbhf(zzl) { // from class: com.google.android.gms.internal.ads.zzbgd
                    private final zzbbr zzenh;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzenh = zzl;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbhf
                    public final void zzak(boolean z) {
                        this.zzenh.zzys();
                    }
                });
                zza.loadUrl(str2);
                return zzl;
            }
        }, zzbbi.zzedy);
    }

    public static zzbfq zza(final Context context, final zzbhj zzbhjVar, final String str, final boolean z, final boolean z2, final zzeg zzegVar, final zzabt zzabtVar, final zzbbg zzbbgVar, zzabk zzabkVar, final com.google.android.gms.ads.internal.zzk zzkVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzto zztoVar, final zzsq zzsqVar, final boolean z3) throws zzbgc {
        zzaat.initialize(context);
        if (zzacz.zzdbz.get().booleanValue()) {
            return zzbhp.zza(context, zzbhjVar, str, z, z2, zzegVar, zzabtVar, zzbbgVar, null, zzkVar, zzbVar, zztoVar, zzsqVar, z3);
        }
        try {
            return (zzbfq) zzbal.zza(new zzdsz(context, zzbhjVar, str, z, z2, zzegVar, zzabtVar, zzbbgVar, null, zzkVar, zzbVar, zztoVar, zzsqVar, z3) { // from class: com.google.android.gms.internal.ads.zzbga
                private final Context zzcxz;
                private final String zzdin;
                private final zzbhj zzems;
                private final boolean zzemt;
                private final boolean zzemu;
                private final zzeg zzemv;
                private final zzabt zzemw;
                private final zzbbg zzemx;
                private final zzabk zzemy = null;
                private final com.google.android.gms.ads.internal.zzk zzemz;
                private final com.google.android.gms.ads.internal.zzb zzena;
                private final zzto zzenb;
                private final zzsq zzenc;
                private final boolean zzend;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcxz = context;
                    this.zzems = zzbhjVar;
                    this.zzdin = str;
                    this.zzemt = z;
                    this.zzemu = z2;
                    this.zzemv = zzegVar;
                    this.zzemw = zzabtVar;
                    this.zzemx = zzbbgVar;
                    this.zzemz = zzkVar;
                    this.zzena = zzbVar;
                    this.zzenb = zztoVar;
                    this.zzenc = zzsqVar;
                    this.zzend = z3;
                }

                @Override // com.google.android.gms.internal.ads.zzdsz
                public final Object get() {
                    Context context2 = this.zzcxz;
                    zzbhj zzbhjVar2 = this.zzems;
                    String str2 = this.zzdin;
                    boolean z4 = this.zzemt;
                    boolean z5 = this.zzemu;
                    zzeg zzegVar2 = this.zzemv;
                    zzabt zzabtVar2 = this.zzemw;
                    zzbbg zzbbgVar2 = this.zzemx;
                    zzabk zzabkVar2 = this.zzemy;
                    com.google.android.gms.ads.internal.zzk zzkVar2 = this.zzemz;
                    com.google.android.gms.ads.internal.zzb zzbVar2 = this.zzena;
                    zzto zztoVar2 = this.zzenb;
                    zzbgf zzbgfVar = new zzbgf(zzbgg.zzb(context2, zzbhjVar2, str2, z4, z5, zzegVar2, zzabtVar2, zzbbgVar2, zzabkVar2, zzkVar2, zzbVar2, zztoVar2, this.zzenc, this.zzend));
                    zzbgfVar.setWebViewClient(com.google.android.gms.ads.internal.zzp.zzkr().zza(zzbgfVar, zztoVar2, z5));
                    zzbgfVar.setWebChromeClient(new zzbfi(zzbgfVar));
                    return zzbgfVar;
                }
            });
        } catch (Throwable th) {
            throw new zzbgc("Webview initialization failed.", th);
        }
    }
}
