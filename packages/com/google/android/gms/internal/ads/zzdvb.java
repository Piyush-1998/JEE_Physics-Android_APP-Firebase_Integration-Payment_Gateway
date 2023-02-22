package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdvb<T> extends zzdvs<T> {
    private final /* synthetic */ zzduz zzhpm;
    private final Executor zzhpq;
    boolean zzhpr = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvb(zzduz zzduzVar, Executor executor) {
        this.zzhpm = zzduzVar;
        this.zzhpq = (Executor) zzdsv.checkNotNull(executor);
    }

    abstract void setValue(T t);

    @Override // com.google.android.gms.internal.ads.zzdvs
    final boolean isDone() {
        return this.zzhpm.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void execute() {
        try {
            this.zzhpq.execute(this);
        } catch (RejectedExecutionException e) {
            if (this.zzhpr) {
                this.zzhpm.setException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvs
    final void zzb(T t, Throwable th) {
        this.zzhpm.zzhpn = null;
        if (th != null) {
            if (th instanceof ExecutionException) {
                this.zzhpm.setException(th.getCause());
                return;
            } else if (th instanceof CancellationException) {
                this.zzhpm.cancel(false);
                return;
            } else {
                this.zzhpm.setException(th);
                return;
            }
        }
        setValue(t);
    }
}
