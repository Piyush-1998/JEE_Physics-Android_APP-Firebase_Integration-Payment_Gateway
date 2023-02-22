package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdck implements zzden<zzdcl> {
    private final zzdkv zzfld;
    private final zzdvw zzgay;

    public zzdck(zzdvw zzdvwVar, zzdkv zzdkvVar) {
        this.zzgay = zzdvwVar;
        this.zzfld = zzdkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdcl> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdcn
            private final zzdck zzgua;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgua = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgua.zzaqz();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdcl zzaqz() throws Exception {
        return new zzdcl(this.zzfld);
    }
}
