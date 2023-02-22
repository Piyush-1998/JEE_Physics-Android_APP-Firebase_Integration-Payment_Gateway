package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdwj extends zzdvs<V> {
    private final Callable<V> zzhpl;
    private final /* synthetic */ zzdwh zzhqn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwj(zzdwh zzdwhVar, Callable<V> callable) {
        this.zzhqn = zzdwhVar;
        this.zzhpl = (Callable) zzdsv.checkNotNull(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final boolean isDone() {
        return this.zzhqn.isDone();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [V, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzdvs
    final V zzaxi() throws Exception {
        return this.zzhpl.call();
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final void zzb(V v, Throwable th) {
        if (th == null) {
            this.zzhqn.set(v);
        } else {
            this.zzhqn.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final String zzaxj() {
        return this.zzhpl.toString();
    }
}
