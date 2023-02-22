package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzduy extends zzdvb<V> {
    private final Callable<V> zzhpl;
    private final /* synthetic */ zzduz zzhpm;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzduy(zzduz zzduzVar, Callable<V> callable, Executor executor) {
        super(zzduzVar, executor);
        this.zzhpm = zzduzVar;
        this.zzhpl = (Callable) zzdsv.checkNotNull(callable);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [V, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzdvs
    final V zzaxi() throws Exception {
        this.zzhpr = false;
        return this.zzhpl.call();
    }

    @Override // com.google.android.gms.internal.ads.zzdvb
    final void setValue(V v) {
        this.zzhpm.set(v);
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final String zzaxj() {
        return this.zzhpl.toString();
    }
}
