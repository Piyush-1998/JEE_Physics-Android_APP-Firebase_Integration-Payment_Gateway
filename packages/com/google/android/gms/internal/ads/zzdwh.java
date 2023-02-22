package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdwh<V> extends zzdvf<V> implements RunnableFuture<V> {
    private volatile zzdvs<?> zzhqm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdwh<V> zzf(Callable<V> callable) {
        return new zzdwh<>(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdwh<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzdwh<>(Executors.callable(runnable, v));
    }

    private zzdwh(Callable<V> callable) {
        this.zzhqm = new zzdwj(this, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwh(zzdut<V> zzdutVar) {
        this.zzhqm = new zzdwk(this, zzdutVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzdvs<?> zzdvsVar = this.zzhqm;
        if (zzdvsVar != null) {
            zzdvsVar.run();
        }
        this.zzhqm = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final void afterDone() {
        zzdvs<?> zzdvsVar;
        super.afterDone();
        if (wasInterrupted() && (zzdvsVar = this.zzhqm) != null) {
            zzdvsVar.interruptTask();
        }
        this.zzhqm = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdui
    public final String pendingToString() {
        zzdvs<?> zzdvsVar = this.zzhqm;
        if (zzdvsVar != null) {
            String valueOf = String.valueOf(zzdvsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.pendingToString();
    }
}
