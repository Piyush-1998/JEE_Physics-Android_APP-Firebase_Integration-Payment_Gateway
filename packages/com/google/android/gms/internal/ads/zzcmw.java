package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmw {
    private final zzdvw zzgay;
    private final zzdvw zzgha;
    private final zzcoh zzghb;
    private final zzeli<zzcpj> zzghc;

    public zzcmw(zzdvw zzdvwVar, zzdvw zzdvwVar2, zzcoh zzcohVar, zzeli<zzcpj> zzeliVar) {
        this.zzgha = zzdvwVar;
        this.zzgay = zzdvwVar2;
        this.zzghb = zzcohVar;
        this.zzghc = zzeliVar;
    }

    public final zzdvt<InputStream> zze(final zzasp zzaspVar) {
        zzdvt zzb;
        String str = zzaspVar.packageName;
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzer(str)) {
            zzb = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhco));
        } else {
            zzb = zzdvl.zzb(this.zzgha.zze(new Callable(this, zzaspVar) { // from class: com.google.android.gms.internal.ads.zzcmv
                private final zzcmw zzggy;
                private final zzasp zzggz;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzggy = this;
                    this.zzggz = zzaspVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzggy.zzf(this.zzggz);
                }
            }), ExecutionException.class, zzcmy.zzbok, this.zzgay);
        }
        final int callingUid = Binder.getCallingUid();
        return zzdvl.zzb(zzb, zzcpa.class, new zzduv(this, zzaspVar, callingUid) { // from class: com.google.android.gms.internal.ads.zzcmx
            private final int zzeay;
            private final zzcmw zzggy;
            private final zzasp zzggz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzggy = this;
                this.zzggz = zzaspVar;
                this.zzeay = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzggy.zza(this.zzggz, this.zzeay, (zzcpa) obj);
            }
        }, this.zzgay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzasp zzaspVar, int i, zzcpa zzcpaVar) throws Exception {
        return this.zzghc.get().zzb(zzaspVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzf(zzasp zzaspVar) throws Exception {
        return this.zzghb.zzi(zzaspVar).get(((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS);
    }
}
