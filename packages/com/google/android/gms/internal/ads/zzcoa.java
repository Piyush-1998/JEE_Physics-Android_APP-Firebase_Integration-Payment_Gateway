package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcoa implements zzcox {
    private static final Pattern zzghr = Pattern.compile("Received error HTTP response code: (.*)");
    private final ScheduledExecutorService zzflf;
    private final zzdln zzfqn;
    private final zzdvw zzgay;
    private final zzcmw zzghp;
    private final zzcqq zzghq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcoa(zzdln zzdlnVar, zzcmw zzcmwVar, zzdvw zzdvwVar, ScheduledExecutorService scheduledExecutorService, zzcqq zzcqqVar) {
        this.zzfqn = zzdlnVar;
        this.zzghp = zzcmwVar;
        this.zzgay = zzdvwVar;
        this.zzflf = scheduledExecutorService;
        this.zzghq = zzcqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcox
    public final zzdvt<zzdlj> zzh(zzasp zzaspVar) {
        zzdvt<zzdlj> zzb = zzdvl.zzb(this.zzghp.zze(zzaspVar), new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzcnz
            private final zzcoa zzghv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghv = this;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzghv.zze((InputStream) obj);
            }
        }, this.zzgay);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcun)).booleanValue()) {
            zzb = zzdvl.zzb(zzdvl.zza(zzb, ((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS, this.zzflf), TimeoutException.class, zzcoc.zzbok, zzbbi.zzedz);
        }
        zzdvl.zza(zzb, new zzcob(this), zzbbi.zzedz);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zze(InputStream inputStream) throws Exception {
        return zzdvl.zzaf(new zzdlj(new zzdle(this.zzfqn), zzdlh.zza(new InputStreamReader(inputStream))));
    }
}
