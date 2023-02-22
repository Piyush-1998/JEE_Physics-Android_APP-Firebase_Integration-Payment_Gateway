package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcnq {
    private final ScheduledExecutorService zzflf;
    private final zzdvw zzgay;
    private final zzeli<zzcpj> zzghc;
    private final zzcol zzghn;

    public zzcnq(ScheduledExecutorService scheduledExecutorService, zzdvw zzdvwVar, zzcol zzcolVar, zzeli<zzcpj> zzeliVar) {
        this.zzflf = scheduledExecutorService;
        this.zzgay = zzdvwVar;
        this.zzghn = zzcolVar;
        this.zzghc = zzeliVar;
    }

    public final zzdvt<InputStream> zzg(final zzasp zzaspVar) {
        zzdvt<InputStream> zzj;
        String str = zzaspVar.packageName;
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzer(str)) {
            zzj = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhco));
        } else {
            zzj = this.zzghn.zzj(zzaspVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzdvc.zzg(zzj).zza(((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS, this.zzflf).zza(Throwable.class, new zzduv(this, zzaspVar, callingUid) { // from class: com.google.android.gms.internal.ads.zzcnp
            private final int zzeay;
            private final zzasp zzggz;
            private final zzcnq zzghm;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghm = this;
                this.zzggz = zzaspVar;
                this.zzeay = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzghm.zza(this.zzggz, this.zzeay, (Throwable) obj);
            }
        }, this.zzgay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzasp zzaspVar, int i, Throwable th) throws Exception {
        return this.zzghc.get().zzd(zzaspVar, i);
    }
}
