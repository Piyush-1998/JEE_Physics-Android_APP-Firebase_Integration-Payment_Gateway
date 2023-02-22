package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdem<T> {
    private final Executor executor;
    private final Set<zzden<? extends zzdek<T>>> zzgvi;

    public zzdem(Executor executor, Set<zzden<? extends zzdek<T>>> set) {
        this.executor = executor;
        this.zzgvi = set;
    }

    public final zzdvt<T> zzt(final T t) {
        final ArrayList arrayList = new ArrayList(this.zzgvi.size());
        for (final zzden<? extends zzdek<T>> zzdenVar : this.zzgvi) {
            zzdvt<? extends zzdek<T>> zzaqs = zzdenVar.zzaqs();
            if (zzacn.zzdaw.get().booleanValue()) {
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
                zzaqs.addListener(new Runnable(zzdenVar, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzdep
                    private final zzden zzgvj;
                    private final long zzgvk;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgvj = zzdenVar;
                        this.zzgvk = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzden zzdenVar2 = this.zzgvj;
                        long j = this.zzgvk;
                        String canonicalName = zzdenVar2.getClass().getCanonicalName();
                        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - j;
                        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
                        sb.append("Signal runtime : ");
                        sb.append(canonicalName);
                        sb.append(" = ");
                        sb.append(elapsedRealtime2);
                        zzaxy.zzei(sb.toString());
                    }
                }, zzbbi.zzedz);
            }
            arrayList.add(zzaqs);
        }
        return zzdvl.zzk(arrayList).zza(new Callable(arrayList, t) { // from class: com.google.android.gms.internal.ads.zzdeo
            private final Object zzdij;
            private final List zzgup;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgup = arrayList;
                this.zzdij = t;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzdvt> list = this.zzgup;
                Object obj = this.zzdij;
                for (zzdvt zzdvtVar : list) {
                    zzdek zzdekVar = (zzdek) zzdvtVar.get();
                    if (zzdekVar != null) {
                        zzdekVar.zzs(obj);
                    }
                }
                return obj;
            }
        }, this.executor);
    }
}
