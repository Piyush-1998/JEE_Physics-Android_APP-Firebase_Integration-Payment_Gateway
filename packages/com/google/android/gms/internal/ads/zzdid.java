package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zztw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdid<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdiz<R, AdT> {
    private final Executor executor;
    private final zzdiz<R, AdT> zzgwx;
    private final zzdiz<R, zzdim<AdT>> zzgyi;
    private final zzdnp<AdT> zzgyj;
    private R zzgyk;

    public zzdid(zzdiz<R, AdT> zzdizVar, zzdiz<R, zzdim<AdT>> zzdizVar2, zzdnp<AdT> zzdnpVar, Executor executor) {
        this.zzgwx = zzdizVar;
        this.zzgyi = zzdizVar2;
        this.zzgyj = zzdnpVar;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdiz
    /* renamed from: zzasc */
    public final synchronized R zzasb() {
        return this.zzgyk;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final synchronized zzdvt<AdT> zza(final zzdja zzdjaVar, final zzdjb<R> zzdjbVar) {
        final zzdig zzdigVar;
        zzdln zzafj = zzdjbVar.zzc(zzdjaVar.zzgzc).zzael().zzafj();
        zzdigVar = new zzdig(zzdjbVar, zzdjaVar, zzafj.zzhbu, zzafj.zzhbv, this.executor, zzafj.zzhby, null);
        return zzdvc.zzg(this.zzgyi.zza(zzdjaVar, zzdjbVar)).zzb(new zzduv(this, zzdjaVar, zzdigVar, zzdjbVar) { // from class: com.google.android.gms.internal.ads.zzdic
            private final zzdid zzgye;
            private final zzdja zzgyf;
            private final zzdig zzgyg;
            private final zzdjb zzgyh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgye = this;
                this.zzgyf = zzdjaVar;
                this.zzgyg = zzdigVar;
                this.zzgyh = zzdjbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgye.zza(this.zzgyf, this.zzgyg, this.zzgyh, (zzdim) obj);
            }
        }, this.executor);
    }

    private final zzdvt<AdT> zza(zzdnh<AdT> zzdnhVar, zzdja zzdjaVar, zzdjb<R> zzdjbVar) {
        final zzbsd<R> zzc = zzdjbVar.zzc(zzdjaVar.zzgzc);
        if (zzdnhVar.zzhfi != null) {
            R zzael = zzc.zzael();
            if (zzael.zzafk() != null) {
                zzdnhVar.zzhfi.zzain().zzb(zzael.zzafk());
            }
            return zzdvl.zzaf(zzdnhVar.zzhfi);
        }
        zzc.zza(zzdnhVar.zzeua);
        zzdvt<AdT> zza = this.zzgwx.zza(zzdjaVar, new zzdjb(zzc) { // from class: com.google.android.gms.internal.ads.zzdif
            private final zzbsd zzgym;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgym = zzc;
            }

            @Override // com.google.android.gms.internal.ads.zzdjb
            public final zzbsd zzc(zzdiy zzdiyVar) {
                return this.zzgym;
            }
        });
        this.zzgyk = this.zzgwx.zzasb();
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdjb zzdjbVar, zzdnt zzdntVar) throws Exception {
        if (zzdntVar != null && zzdntVar.zzgyw != null && zzdntVar.zzhfx != null) {
            zzdntVar.zzgyw.zzhfh.zzaiw().zze((zztw.zzb) ((zzegp) zztw.zzb.zzng().zza(zztw.zzb.zza.zzne().zzb(zztw.zzb.zzc.IN_MEMORY).zza(zztw.zzb.zzd.zzni())).zzbfx()));
            return zza(zzdntVar.zzgyw, ((zzdig) zzdntVar.zzhfx).zzgyo, zzdjbVar);
        }
        throw new zzcmt(zzdmd.zzhco, "Empty prefetch");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdja zzdjaVar, zzdig zzdigVar, final zzdjb zzdjbVar, zzdim zzdimVar) throws Exception {
        if (zzdimVar != null) {
            zzdig zzdigVar2 = new zzdig(zzdigVar.zzgyn, zzdigVar.zzgyo, zzdigVar.zzdpw, zzdigVar.zzbuo, zzdigVar.executor, zzdigVar.zzgsx, zzdimVar.zzgyp);
            if (zzdimVar.zzgyw != null) {
                this.zzgyk = null;
                this.zzgyj.zzb(zzdigVar2);
                return zza(zzdimVar.zzgyw, zzdjaVar, zzdjbVar);
            }
            zzdvt<zzdnt<AdT>> zzc = this.zzgyj.zzc(zzdigVar2);
            if (zzc != null) {
                this.zzgyk = (R) zzdjbVar.zzc(zzdjaVar.zzgzc).zzael();
                return zzdvl.zzb(zzc, new zzduv(this, zzdjbVar) { // from class: com.google.android.gms.internal.ads.zzdie
                    private final zzdid zzgye;
                    private final zzdjb zzgyl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgye = this;
                        this.zzgyl = zzdjbVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzduv
                    public final zzdvt zzf(Object obj) {
                        return this.zzgye.zza(this.zzgyl, (zzdnt) obj);
                    }
                }, this.executor);
            }
            this.zzgyj.zzb(zzdigVar2);
            zzdjaVar = new zzdja(zzdjaVar.zzgzc, zzdimVar.zzgid);
        }
        zzdvt<AdT> zza = this.zzgwx.zza(zzdjaVar, zzdjbVar);
        this.zzgyk = this.zzgwx.zzasb();
        return zza;
    }
}
