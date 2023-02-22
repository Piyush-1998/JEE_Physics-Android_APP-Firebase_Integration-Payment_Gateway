package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdvy implements Executor {
    boolean zzhqc = true;
    private final /* synthetic */ Executor zzhqd;
    private final /* synthetic */ zzdui zzhqe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvy(Executor executor, zzdui zzduiVar) {
        this.zzhqd = executor;
        this.zzhqe = zzduiVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zzhqd.execute(new zzdvx(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.zzhqc) {
                this.zzhqe.setException(e);
            }
        }
    }
}
