package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddu implements zzden<zzddv> {
    private final zzawb zzbqm;
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzddu(zzawb zzawbVar, zzdvw zzdvwVar, Context context) {
        this.zzbqm = zzawbVar;
        this.zzgay = zzdvwVar;
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzddv> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzddx
            private final zzddu zzguu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguu = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzguu.zzarf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddv zzarf() throws Exception {
        if (!this.zzbqm.zzac(this.zzvr)) {
            return new zzddv(null, null, null, null, null);
        }
        String zzaf = this.zzbqm.zzaf(this.zzvr);
        String str = zzaf == null ? "" : zzaf;
        String zzag = this.zzbqm.zzag(this.zzvr);
        String str2 = zzag == null ? "" : zzag;
        String zzah = this.zzbqm.zzah(this.zzvr);
        String str3 = zzah == null ? "" : zzah;
        String zzai = this.zzbqm.zzai(this.zzvr);
        return new zzddv(str, str2, str3, zzai == null ? "" : zzai, "TIME_OUT".equals(str2) ? (Long) zzwe.zzpu().zzd(zzaat.zzcng) : null);
    }
}
