package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddf implements zzden<zzddc> {
    private final Bundle zzfsj;
    private final zzdvw zzgay;

    public zzddf(zzdvw zzdvwVar, Bundle bundle) {
        this.zzgay = zzdvwVar;
        this.zzfsj = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzddc> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdde
            private final zzddf zzguh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguh = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzguh.zzarc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzddc zzarc() throws Exception {
        return new zzddc(this.zzfsj);
    }
}
