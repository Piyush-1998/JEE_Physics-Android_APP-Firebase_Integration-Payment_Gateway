package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcf;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdqo {
    private final Executor executor;
    private final zzdqu zzhjk;
    private final zzdqu zzhjl;
    private Task<zzcf.zza> zzhjm;
    private Task<zzcf.zza> zzhjn;
    private final Context zzvr;
    private final zzdpy zzvw;
    private final zzdqc zzyr;

    private zzdqo(Context context, Executor executor, zzdpy zzdpyVar, zzdqc zzdqcVar, zzdqs zzdqsVar, zzdqr zzdqrVar) {
        this.zzvr = context;
        this.executor = executor;
        this.zzvw = zzdpyVar;
        this.zzyr = zzdqcVar;
        this.zzhjk = zzdqsVar;
        this.zzhjl = zzdqrVar;
    }

    public static zzdqo zza(Context context, Executor executor, zzdpy zzdpyVar, zzdqc zzdqcVar) {
        final zzdqo zzdqoVar = new zzdqo(context, executor, zzdpyVar, zzdqcVar, new zzdqs(), new zzdqr());
        if (zzdqoVar.zzyr.zzavc()) {
            zzdqoVar.zzhjm = zzdqoVar.zzd(new Callable(zzdqoVar) { // from class: com.google.android.gms.internal.ads.zzdqn
                private final zzdqo zzhjj;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhjj = zzdqoVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzhjj.zzavk();
                }
            });
        } else {
            zzdqoVar.zzhjm = Tasks.forResult(zzdqoVar.zzhjk.zzavl());
        }
        zzdqoVar.zzhjn = zzdqoVar.zzd(new Callable(zzdqoVar) { // from class: com.google.android.gms.internal.ads.zzdqq
            private final zzdqo zzhjj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhjj = zzdqoVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzhjj.zzavj();
            }
        });
        return zzdqoVar;
    }

    public final zzcf.zza zzavi() {
        return zza(this.zzhjm, this.zzhjk.zzavl());
    }

    public final zzcf.zza zzco() {
        return zza(this.zzhjn, this.zzhjl.zzavl());
    }

    private final Task<zzcf.zza> zzd(Callable<zzcf.zza> callable) {
        return Tasks.call(this.executor, callable).addOnFailureListener(this.executor, new OnFailureListener(this) { // from class: com.google.android.gms.internal.ads.zzdqp
            private final zzdqo zzhjj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhjj = this;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.zzhjj.zzc(exc);
            }
        });
    }

    private static zzcf.zza zza(Task<zzcf.zza> task, zzcf.zza zzaVar) {
        return !task.isSuccessful() ? zzaVar : task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzvw.zza(2025, -1L, exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza zzavj() throws Exception {
        return this.zzhjl.zzcj(this.zzvr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcf.zza zzavk() throws Exception {
        return this.zzhjk.zzcj(this.zzvr);
    }
}
