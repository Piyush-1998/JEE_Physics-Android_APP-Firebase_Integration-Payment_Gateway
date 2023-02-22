package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdkd implements zzcxy<zzchu> {
    private final Executor zzfmk;
    private final zzdli zzfsl;
    private final zzdlp zzgps;
    private final zzbii zzgrp;
    private final Context zzgwv;
    private final zzdiz<zzchx, zzchu> zzgwx;
    private final zzdje zzgzn;
    private zzdvt<zzchu> zzgzo;

    public zzdkd(Context context, Executor executor, zzbii zzbiiVar, zzdiz<zzchx, zzchu> zzdizVar, zzdje zzdjeVar, zzdlp zzdlpVar, zzdli zzdliVar) {
        this.zzgwv = context;
        this.zzfmk = executor;
        this.zzgrp = zzbiiVar;
        this.zzgwx = zzdizVar;
        this.zzgzn = zzdjeVar;
        this.zzgps = zzdlpVar;
        this.zzfsl = zzdliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxy
    public final boolean isLoading() {
        zzdvt<zzchu> zzdvtVar = this.zzgzo;
        return (zzdvtVar == null || zzdvtVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcxy
    public final boolean zza(zzvc zzvcVar, String str, zzcxx zzcxxVar, zzcya<? super zzchu> zzcyaVar) throws RemoteException {
        zzatz zzatzVar = new zzatz(zzvcVar, str);
        String str2 = zzcxxVar instanceof zzdka ? ((zzdka) zzcxxVar).zzgzl : null;
        if (zzatzVar.zzbuo == null) {
            zzaxy.zzfc("Ad unit ID should not be null for rewarded video ad.");
            this.zzfmk.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdkc
                private final zzdkd zzgzm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgzm = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgzm.zzasi();
                }
            });
            return false;
        }
        zzdvt<zzchu> zzdvtVar = this.zzgzo;
        if (zzdvtVar == null || zzdvtVar.isDone()) {
            zzdly.zze(this.zzgwv, zzatzVar.zzdpw.zzcgy);
            zzdln zzasu = this.zzgps.zzgt(zzatzVar.zzbuo).zze(zzvj.zzpj()).zzh(zzatzVar.zzdpw).zzasu();
            zzdkj zzdkjVar = new zzdkj(null);
            zzdkjVar.zzfqn = zzasu;
            zzdkjVar.zzgzl = str2;
            zzdvt<zzchu> zza = this.zzgwx.zza(new zzdja(zzdkjVar), new zzdjb(this) { // from class: com.google.android.gms.internal.ads.zzdkf
                private final zzdkd zzgzm;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgzm = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdjb
                public final zzbsd zzc(zzdiy zzdiyVar) {
                    return this.zzgzm.zze(zzdiyVar);
                }
            });
            this.zzgzo = zza;
            zzdvl.zza(zza, new zzdke(this, zzcyaVar, zzdkjVar), this.zzfmk);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzea(int i) {
        this.zzgps.zzast().zzeb(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzcia zze(zzdiy zzdiyVar) {
        zzdkj zzdkjVar = (zzdkj) zzdiyVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxq)).booleanValue()) {
            return this.zzgrp.zzadv().zze(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdkjVar.zzfqn).zzfx(zzdkjVar.zzgzl).zza(this.zzfsl).zzajj()).zze(new zzbxj.zza().zzake());
        }
        zzdje zzb = zzdje.zzb(this.zzgzn);
        return this.zzgrp.zzadv().zze(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdkjVar.zzfqn).zzfx(zzdkjVar.zzgzl).zza(this.zzfsl).zzajj()).zze(new zzbxj.zza().zza((zzbsu) zzb, this.zzfmk).zza((zzbuj) zzb, this.zzfmk).zza((zzbsz) zzb, this.zzfmk).zza((AdMetadataListener) zzb, this.zzfmk).zza((zzbti) zzb, this.zzfmk).zza((zzbuy) zzb, this.zzfmk).zza(zzb).zzake());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzasi() {
        this.zzgzn.zzg(zzdmb.zza(zzdmd.zzhct, null, null));
    }
}
