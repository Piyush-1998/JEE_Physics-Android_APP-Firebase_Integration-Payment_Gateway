package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzblw implements zzahf<Object> {
    final /* synthetic */ zzblr zzfmb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblw(zzblr zzblrVar) {
        this.zzfmb = zzblrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final void zza(Object obj, Map<String, String> map) {
        boolean zzm;
        Executor executor;
        zzm = this.zzfmb.zzm(map);
        if (zzm) {
            executor = this.zzfmb.executor;
            executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzblv
                private final zzblw zzfmc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfmc = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbma zzbmaVar;
                    zzbmaVar = this.zzfmc.zzfmb.zzflr;
                    zzbmaVar.zzaha();
                }
            });
        }
    }
}
