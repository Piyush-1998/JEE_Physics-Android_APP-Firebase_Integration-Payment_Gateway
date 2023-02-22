package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdat implements zzden<zzdaq> {
    private final Executor executor;
    private final ScheduledExecutorService zzflf;
    private final Context zzvr;

    public zzdat(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzvr = context;
        this.zzflf = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdaq> zzaqs() {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcwc)).booleanValue()) {
            return zzdvl.zzaf(null);
        }
        final zzbbq zzbbqVar = new zzbbq();
        try {
            new zzdsh(zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzdas
                private final zzbbq zzbvp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvp = zzbbqVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdsh
                public final void zzbm(boolean z) {
                    this.zzbvp.set(false);
                }
            }.zzbm(false);
        } catch (Throwable unused) {
            zzaxy.zzfc("ArCoreApk is not ready.");
            zzbbqVar.set(false);
        }
        return zzdvl.zzb(zzdvl.zzb(zzdvl.zza(zzbbqVar, 200L, TimeUnit.MILLISECONDS, this.zzflf), new zzdsl(this) { // from class: com.google.android.gms.internal.ads.zzdav
            private final zzdat zzgtg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgtg = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                return new zzdaq(false, false, ((Boolean) obj).booleanValue());
            }
        }, this.executor), Throwable.class, zzdau.zzbok, this.executor);
    }
}
