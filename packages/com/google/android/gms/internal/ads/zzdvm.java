package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdvm<V> {
    private final boolean zzhpb;
    private final zzdtg<zzdvt<? extends V>> zzhpt;

    private zzdvm(boolean z, zzdtg<zzdvt<? extends V>> zzdtgVar) {
        this.zzhpb = z;
        this.zzhpt = zzdtgVar;
    }

    public final <C> zzdvt<C> zza(Callable<C> callable, Executor executor) {
        return new zzduz(this.zzhpt, this.zzhpb, executor, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdvm(boolean z, zzdtg zzdtgVar, zzdvk zzdvkVar) {
        this(z, zzdtgVar);
    }
}
