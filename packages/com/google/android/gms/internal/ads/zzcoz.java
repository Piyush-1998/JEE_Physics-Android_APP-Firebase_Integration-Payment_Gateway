package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcoz {
    private final zzdvw zzgay;
    private final zzeli<zzcpj> zzghc;
    private final zzcoq zzgit;

    public zzcoz(zzdvw zzdvwVar, zzcoq zzcoqVar, zzeli<zzcpj> zzeliVar) {
        this.zzgay = zzdvwVar;
        this.zzgit = zzcoqVar;
        this.zzghc = zzeliVar;
    }

    private final <RetT> zzdvt<RetT> zza(final zzasp zzaspVar, zzcpk<InputStream> zzcpkVar, final zzcpk<InputStream> zzcpkVar2, final zzduv<InputStream, RetT> zzduvVar) {
        zzdvt zzb;
        String str = zzaspVar.packageName;
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzer(str)) {
            zzb = zzdvl.immediateFailedFuture(new zzcpa(zzdmd.zzhco));
        } else {
            zzb = zzdvl.zzb(zzcpkVar.zzq(zzaspVar), ExecutionException.class, zzcpc.zzbok, this.zzgay);
        }
        return zzdvc.zzg(zzb).zzb(zzduvVar, this.zzgay).zza(zzcpa.class, new zzduv(this, zzcpkVar2, zzaspVar, zzduvVar) { // from class: com.google.android.gms.internal.ads.zzcpb
            private final zzcoz zzgiu;
            private final zzcpk zzgiv;
            private final zzasp zzgiw;
            private final zzduv zzgix;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiu = this;
                this.zzgiv = zzcpkVar2;
                this.zzgiw = zzaspVar;
                this.zzgix = zzduvVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgiu.zza(this.zzgiv, this.zzgiw, this.zzgix, (zzcpa) obj);
            }
        }, this.zzgay);
    }

    public final zzdvt<zzasp> zzl(final zzasp zzaspVar) {
        zzduv zzduvVar = new zzduv(zzaspVar) { // from class: com.google.android.gms.internal.ads.zzcpe
            private final zzasp zzftf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftf = zzaspVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                zzasp zzaspVar2 = this.zzftf;
                zzaspVar2.zzdth = new String(zzdud.toByteArray((InputStream) obj), zzdsj.UTF_8);
                return zzdvl.zzaf(zzaspVar2);
            }
        };
        zzcoq zzcoqVar = this.zzgit;
        zzcoqVar.getClass();
        return zza(zzaspVar, zzcpd.zza(zzcoqVar), new zzcpk(this) { // from class: com.google.android.gms.internal.ads.zzcpg
            private final zzcoz zzgiu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiu = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcpk
            public final zzdvt zzq(zzasp zzaspVar2) {
                return this.zzgiu.zzp(zzaspVar2);
            }
        }, zzduvVar);
    }

    public final zzdvt<Void> zzm(zzasp zzaspVar) {
        if (zzfg.zzas(zzaspVar.zzdth)) {
            return zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcp, "Pool key missing from removeUrl call."));
        }
        return zza(zzaspVar, new zzcpk(this) { // from class: com.google.android.gms.internal.ads.zzcpi
            private final zzcoz zzgiu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiu = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcpk
            public final zzdvt zzq(zzasp zzaspVar2) {
                return this.zzgiu.zzo(zzaspVar2);
            }
        }, new zzcpk(this) { // from class: com.google.android.gms.internal.ads.zzcph
            private final zzcoz zzgiu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiu = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcpk
            public final zzdvt zzq(zzasp zzaspVar2) {
                return this.zzgiu.zzn(zzaspVar2);
            }
        }, zzcpf.zzbok);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzn(zzasp zzaspVar) {
        return this.zzghc.get().zzgn(zzaspVar.zzdth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzo(zzasp zzaspVar) {
        return this.zzgit.zzgm(zzaspVar.zzdth);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzp(zzasp zzaspVar) {
        return this.zzghc.get().zzc(zzaspVar, Binder.getCallingUid());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzcpk zzcpkVar, zzasp zzaspVar, zzduv zzduvVar, zzcpa zzcpaVar) throws Exception {
        return zzdvl.zzb(zzcpkVar.zzq(zzaspVar), zzduvVar, this.zzgay);
    }
}
