package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbhp {
    public static zzbfq zza(final Context context, final zzbhj zzbhjVar, final String str, final boolean z, final boolean z2, final zzeg zzegVar, final zzabt zzabtVar, final zzbbg zzbbgVar, zzabk zzabkVar, final com.google.android.gms.ads.internal.zzk zzkVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzto zztoVar, final zzsq zzsqVar, final boolean z3) throws zzbgc {
        try {
            return (zzbfq) zzbal.zza(new zzdsz(context, zzbhjVar, str, z, z2, zzegVar, zzabtVar, zzbbgVar, null, zzkVar, zzbVar, zztoVar, zzsqVar, z3) { // from class: com.google.android.gms.internal.ads.zzbho
                private final Context zzcxz;
                private final String zzdin;
                private final zzbhj zzems;
                private final boolean zzemt;
                private final boolean zzemu;
                private final zzeg zzemv;
                private final zzabt zzemw;
                private final zzbbg zzemx;
                private final zzabk zzemy;
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
                    this.zzemy = r9;
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
                    zzsq zzsqVar2 = this.zzenc;
                    boolean z6 = this.zzend;
                    zzbhi zzbhiVar = new zzbhi();
                    zzbhr zzbhrVar = new zzbhr(new zzbhg(context2), zzbhiVar, zzbhjVar2, str2, z4, z5, zzegVar2, zzabtVar2, zzbbgVar2, zzabkVar2, zzkVar2, zzbVar2, zztoVar2, zzsqVar2, z6);
                    zzbgf zzbgfVar = new zzbgf(zzbhrVar);
                    zzbhrVar.setWebChromeClient(new zzbfi(zzbgfVar));
                    zzbhiVar.zza(zzbgfVar, z5);
                    return zzbgfVar;
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbgc("Webview initialization failed.", th);
        }
    }
}
