package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbs implements zzden<zzdbx> {
    private final Context zzaai;
    private final zzdvw zzgay;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbs(Context context, zzdvw zzdvwVar) {
        this.zzaai = context;
        this.zzgay = zzdvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdbx> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdbv
            private final zzdbs zzgtu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgtu = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgtu.zzaqy();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdbx zzaqy() throws Exception {
        com.google.android.gms.ads.internal.zzp.zzkp();
        String zzba = zzayh.zzba(this.zzaai);
        String string = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcvs)).booleanValue() ? this.zzaai.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzp.zzkp();
        return new zzdbx(zzba, string, zzayh.zzbb(this.zzaai));
    }
}
