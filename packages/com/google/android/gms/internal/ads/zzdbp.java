package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.location.Location;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbp implements zzden<zzdbm> {
    private ApplicationInfo applicationInfo;
    private zzaya zzdza;
    private ScheduledExecutorService zzflf;
    zzdln zzfqn;
    private zzamh zzgts;

    public zzdbp(zzamh zzamhVar, ScheduledExecutorService scheduledExecutorService, zzaya zzayaVar, ApplicationInfo applicationInfo, zzdln zzdlnVar) {
        this.zzgts = zzamhVar;
        this.zzflf = scheduledExecutorService;
        this.zzdza = zzayaVar;
        this.applicationInfo = applicationInfo;
        this.zzfqn = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdbm> zzaqs() {
        zzdvt zzb;
        if (!zzacd.zzczh.get().booleanValue()) {
            zzb = zzdvl.zzaf(null);
        } else if (!this.zzdza.zzxc()) {
            zzb = zzdvl.zzaf(null);
        } else {
            zzb = zzdvl.zzb(zzdvl.zza(this.zzgts.zza(this.applicationInfo), ((Long) zzwe.zzpu().zzd(zzaat.zzcsa)).longValue(), TimeUnit.MILLISECONDS, this.zzflf), Throwable.class, zzdbq.zzbok, zzbbi.zzedz);
        }
        return zzdvl.zzb(zzdvl.zzb(zzb, new zzdsl(this) { // from class: com.google.android.gms.internal.ads.zzdbr
            private final zzdbp zzgtt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgtt = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                Location location = (Location) obj;
                return location != null ? location : this.zzgtt.zzfqn.zzhbu.zznb;
            }
        }, this.zzflf), zzdbo.zzdwg, zzbbi.zzedu);
    }
}
