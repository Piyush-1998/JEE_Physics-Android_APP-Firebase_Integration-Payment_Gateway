package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdcx implements zzden<zzdcu> {
    private final zzdvw zzgse;
    private final Set<String> zzgss;
    private final Context zzvr;

    public zzdcx(zzdvw zzdvwVar, Context context, Set<String> set) {
        this.zzgse = zzdvwVar;
        this.zzvr = context;
        this.zzgss = set;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdcu> zzaqs() {
        return this.zzgse.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdcw
            private final zzdcx zzguf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguf = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzguf.zzarb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdcu zzarb() throws Exception {
        boolean zze;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctq)).booleanValue()) {
            zze = zzdcu.zze(this.zzgss);
            if (zze) {
                return new zzdcu(com.google.android.gms.ads.internal.zzp.zzle().getVersion(this.zzvr));
            }
        }
        return new zzdcu(null);
    }
}
