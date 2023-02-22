package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfv implements zzden<zzdfs> {
    private zzdvw zzgay;
    zztc zzgwh;
    Context zzvr;

    public zzdfv(zztc zztcVar, zzdvw zzdvwVar, Context context) {
        this.zzgwh = zztcVar;
        this.zzgay = zzdvwVar;
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdfs> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdfu
            private final zzdfv zzgwg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgwg = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdfv zzdfvVar = this.zzgwg;
                return new zzdfs(zzdfvVar.zzgwh.zzf(zzdfvVar.zzvr));
            }
        });
    }
}
