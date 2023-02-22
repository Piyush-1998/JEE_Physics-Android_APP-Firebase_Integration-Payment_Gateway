package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcnt extends zzcnr {
    private static final Pattern zzghr = Pattern.compile("Received error HTTP response code: (.*)");
    private final ScheduledExecutorService zzflf;
    private final zzdln zzfqn;
    private final zzdvw zzgay;
    private final zzcmw zzghp;
    private final zzcqq zzghq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnt(zzbve zzbveVar, zzdln zzdlnVar, zzcmw zzcmwVar, zzdvw zzdvwVar, ScheduledExecutorService scheduledExecutorService, zzcqq zzcqqVar) {
        super(zzbveVar);
        this.zzfqn = zzdlnVar;
        this.zzghp = zzcmwVar;
        this.zzgay = zzdvwVar;
        this.zzflf = scheduledExecutorService;
        this.zzghq = zzcqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final zzdvt<zzdlj> zzb(zzasp zzaspVar) throws zzcmt {
        zzdvt<zzdlj> zzb = zzdvl.zzb(this.zzghp.zze(zzaspVar), new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzcnw
            private final zzcnt zzght;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzght = this;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzght.zzd((InputStream) obj);
            }
        }, this.zzgay);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcun)).booleanValue()) {
            zzb = zzdvl.zzb(zzdvl.zza(zzb, ((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS, this.zzflf), TimeoutException.class, zzcnv.zzbok, zzbbi.zzedz);
        }
        zzdvl.zza(zzb, new zzcny(this), zzbbi.zzedz);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzd(InputStream inputStream) throws Exception {
        return zzdvl.zzaf(new zzdlj(new zzdle(this.zzfqn), zzdlh.zza(new InputStreamReader(inputStream))));
    }
}
