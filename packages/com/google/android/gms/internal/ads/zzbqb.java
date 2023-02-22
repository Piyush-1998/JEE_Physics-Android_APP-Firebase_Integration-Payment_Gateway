package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqb<T> {
    private final Executor executor;
    private final zzcnt zzfql;
    private final zzcod zzfqm;
    private final zzdln zzfqn;
    private final zzdpf zzfqo;
    private final zzbld zzfqp;
    private final zzcuk<T> zzfqq;
    private final zzbwx zzfqr;
    private final zzdlj zzfqs;
    private final zzcoz zzfqt;
    private final zzbrz zzfqu;
    private final zzcow zzfqv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqb(zzcnt zzcntVar, zzcod zzcodVar, zzdln zzdlnVar, zzdpf zzdpfVar, zzbld zzbldVar, zzcuk<T> zzcukVar, zzbwx zzbwxVar, zzdlj zzdljVar, zzcoz zzcozVar, zzbrz zzbrzVar, Executor executor, zzcow zzcowVar) {
        this.zzfql = zzcntVar;
        this.zzfqm = zzcodVar;
        this.zzfqn = zzdlnVar;
        this.zzfqo = zzdpfVar;
        this.zzfqp = zzbldVar;
        this.zzfqq = zzcukVar;
        this.zzfqr = zzbwxVar;
        this.zzfqs = zzdljVar;
        this.zzfqt = zzcozVar;
        this.zzfqu = zzbrzVar;
        this.executor = executor;
        this.zzfqv = zzcowVar;
    }

    private final zzdvt<zzdlj> zza(zzdvt<zzasp> zzdvtVar) {
        if (this.zzfqs != null) {
            return this.zzfqo.zzu(zzdpg.SERVER_TRANSACTION).zze(zzdvl.zzaf(this.zzfqs)).zzauz();
        }
        com.google.android.gms.ads.internal.zzp.zzkv().zzmt();
        if (this.zzfqn.zzhbu.zzchi != null) {
            return this.zzfqo.zzu(zzdpg.SERVER_TRANSACTION).zze(this.zzfqm.zzapk()).zzauz();
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxu)).booleanValue()) {
            zzdox<I> zza = this.zzfqo.zza((zzdpf) zzdpg.SERVER_TRANSACTION, (zzdvt) zzdvtVar);
            zzcow zzcowVar = this.zzfqv;
            zzcowVar.getClass();
            return zza.zza(zzbqe.zza(zzcowVar)).zzauz();
        }
        return this.zzfqo.zza((zzdpf) zzdpg.SERVER_TRANSACTION, (zzdvt) zzdvtVar).zza(this.zzfql).zzauz();
    }

    public final zzdvt<zzdlj> zza(zzasp zzaspVar) {
        return zza(zzdvl.zzaf(zzaspVar));
    }

    public final zzdvt<zzdlj> zzaiu() {
        return zza(this.zzfqu.zzajd());
    }

    public final zzdvt<T> zzb(zzdvt<zzdlj> zzdvtVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcun)).booleanValue()) {
            return this.zzfqo.zza((zzdpf) zzdpg.RENDERER, (zzdvt) zzdvtVar).zza(this.zzfqp).zza(this.zzfqq).zzauz();
        }
        return this.zzfqo.zza((zzdpf) zzdpg.RENDERER, (zzdvt) zzdvtVar).zza(this.zzfqp).zza(this.zzfqq).zza(((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS).zzauz();
    }

    public final zzdvt<T> zzb(zzasp zzaspVar) {
        return zzb(zza(zzaspVar));
    }

    public final zzdvt<T> zzaiv() {
        return zzb(zzaiu());
    }

    public final zzbwx zzaiw() {
        return this.zzfqr;
    }

    public final zzdvt<zzasp> zza(final zzdnd zzdndVar) {
        zzdos zzauz = this.zzfqo.zza((zzdpf) zzdpg.GET_CACHE_KEY, (zzdvt) this.zzfqu.zzajd()).zza(new zzduv(this, zzdndVar) { // from class: com.google.android.gms.internal.ads.zzbqd
            private final zzbqb zzfqw;
            private final zzdnd zzfqx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfqw = this;
                this.zzfqx = zzdndVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzfqw.zza(this.zzfqx, (zzasp) obj);
            }
        }).zzauz();
        zzdvl.zza(zzauz, new zzbqg(this), this.executor);
        return zzauz;
    }

    public final zzdvt<Void> zzc(zzasp zzaspVar) {
        zzdos zzauz = this.zzfqo.zza((zzdpf) zzdpg.NOTIFY_CACHE_HIT, (zzdvt) this.zzfqt.zzm(zzaspVar)).zzauz();
        zzdvl.zza(zzauz, new zzbqf(this), this.executor);
        return zzauz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdnd zzdndVar, zzasp zzaspVar) throws Exception {
        zzaspVar.zzdtg = zzdndVar;
        return this.zzfqt.zzl(zzaspVar);
    }
}
