package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdov {
    private final E zzhgq;
    private final /* synthetic */ zzdor zzhgu;

    private zzdov(zzdor zzdorVar, E e) {
        this.zzhgu = zzdorVar;
        this.zzhgq = e;
    }

    public final <O> zzdox<O> zze(zzdvt<O> zzdvtVar) {
        zzdvt zzdvtVar2;
        zzdor zzdorVar = this.zzhgu;
        E e = this.zzhgq;
        zzdvtVar2 = zzdor.zzhgo;
        return new zzdox<>(zzdorVar, e, zzdvtVar2, Collections.emptyList(), zzdvtVar);
    }

    public final <O> zzdox<O> zzc(Callable<O> callable) {
        zzdvw zzdvwVar;
        zzdvwVar = this.zzhgu.zzgay;
        return zza(callable, zzdvwVar);
    }

    private final <O> zzdox<O> zza(Callable<O> callable, zzdvw zzdvwVar) {
        zzdvt zzdvtVar;
        zzdor zzdorVar = this.zzhgu;
        E e = this.zzhgq;
        zzdvtVar = zzdor.zzhgo;
        return new zzdox<>(zzdorVar, e, zzdvtVar, Collections.emptyList(), zzdvwVar.zze(callable));
    }

    public final zzdox<?> zza(final zzdop zzdopVar, zzdvw zzdvwVar) {
        return zza(new Callable(zzdopVar) { // from class: com.google.android.gms.internal.ads.zzdoy
            private final zzdop zzhgx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhgx = zzdopVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.zzhgx.run();
                return null;
            }
        }, zzdvwVar);
    }
}
