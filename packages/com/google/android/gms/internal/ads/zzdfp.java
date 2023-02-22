package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfp implements zzden<zzdfm> {
    private final Executor executor;
    private final zzaxk zzbps;
    private final ScheduledExecutorService zzflf;
    private final int zzgjp;
    private final zzaxg zzgvu;
    private final Context zzvr;

    public zzdfp(zzaxg zzaxgVar, int i, Context context, zzaxk zzaxkVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zzgvu = zzaxgVar;
        this.zzgjp = i;
        this.zzvr = context;
        this.zzbps = zzaxkVar;
        this.zzflf = scheduledExecutorService;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdfm> zzaqs() {
        return zzdvc.zzg(zzdvl.zza(new zzdut(this) { // from class: com.google.android.gms.internal.ads.zzdfo
            private final zzdfp zzgwd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgwd = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdut
            public final zzdvt zzard() {
                return this.zzgwd.zzarm();
            }
        }, this.executor)).zza(zzdfr.zzdwg, this.executor).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcoh)).longValue(), TimeUnit.MILLISECONDS, this.zzflf).zza(Exception.class, new zzdsl(this) { // from class: com.google.android.gms.internal.ads.zzdfq
            private final zzdfp zzgwd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgwd = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                return this.zzgwd.zzb((Exception) obj);
            }
        }, zzdvv.zzaxm());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdfm zzb(Exception exc) {
        this.zzbps.zza(exc, "AttestationTokenSignal");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzarm() throws Exception {
        return this.zzgvu.zza(this.zzvr, this.zzgjp);
    }
}
