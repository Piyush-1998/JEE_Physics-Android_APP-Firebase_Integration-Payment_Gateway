package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzboo extends zzbni {
    private final Executor zzfmk;
    private final zzafq zzfpa;
    private final Runnable zzfpb;

    public zzboo(zzbpg zzbpgVar, zzafq zzafqVar, Runnable runnable, Executor executor) {
        super(zzbpgVar);
        this.zzfpa = zzafqVar;
        this.zzfpb = runnable;
        this.zzfmk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzyg getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zza(ViewGroup viewGroup, zzvj zzvjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzdkw zzahp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final View zzahq() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final zzdkw zzahu() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final int zzahv() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbni
    public final void zzkd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzahw() {
        final AtomicReference atomicReference = new AtomicReference(this.zzfpb);
        final Runnable runnable = new Runnable(atomicReference) { // from class: com.google.android.gms.internal.ads.zzbon
            private final AtomicReference zzfoz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfoz = atomicReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = (Runnable) this.zzfoz.getAndSet(null);
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        this.zzfmk.execute(new Runnable(this, runnable) { // from class: com.google.android.gms.internal.ads.zzboq
            private final Runnable zzfkq;
            private final zzboo zzfpc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfpc = this;
                this.zzfkq = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfpc.zze(this.zzfkq);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Runnable runnable) {
        try {
            if (this.zzfpa.zzm(ObjectWrapper.wrap(runnable))) {
                return;
            }
            runnable.run();
        } catch (RemoteException unused) {
            runnable.run();
        }
    }
}
