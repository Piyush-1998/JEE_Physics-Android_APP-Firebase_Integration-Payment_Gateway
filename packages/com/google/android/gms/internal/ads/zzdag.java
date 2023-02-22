package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdag implements zzden<zzdah> {
    private final zzdln zzfqn;
    private final zzdvw zzgay;

    public zzdag(zzdvw zzdvwVar, zzdln zzdlnVar) {
        this.zzgay = zzdvwVar;
        this.zzfqn = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdah> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdaj
            private final zzdag zzgsy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsy = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgsy.zzaqv();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdah zzaqv() throws Exception {
        return new zzdah(this.zzfqn.zzhby);
    }
}
