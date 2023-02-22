package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdhc implements zzcxy<zzbnc> {
    private final Executor zzfmk;
    private final ViewGroup zzfnx;
    private final zzdlp zzgps;
    @Nullable
    private zzdvt<zzbnc> zzgqd;
    private final zzbii zzgrp;
    private final Context zzgwv;
    private final zzdht zzgww;
    private final zzdiz<zzbmw, zzbnc> zzgwx;

    public zzdhc(Context context, Executor executor, zzbii zzbiiVar, zzdiz<zzbmw, zzbnc> zzdizVar, zzdht zzdhtVar, zzdlp zzdlpVar) {
        this.zzgwv = context;
        this.zzfmk = executor;
        this.zzgrp = zzbiiVar;
        this.zzgwx = zzdizVar;
        this.zzgww = zzdhtVar;
        this.zzgps = zzdlpVar;
        this.zzfnx = new FrameLayout(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxy
    public final boolean isLoading() {
        zzdvt<zzbnc> zzdvtVar = this.zzgqd;
        return (zzdvtVar == null || zzdvtVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcxy
    public final synchronized boolean zza(zzvc zzvcVar, String str, zzcxx zzcxxVar, zzcya<? super zzbnc> zzcyaVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str == null) {
            zzaxy.zzfc("Ad unit ID should not be null for app open ad.");
            this.zzfmk.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdhf
                private final zzdhc zzgwy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgwy = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgwy.zzarw();
                }
            });
            return false;
        } else if (this.zzgqd != null) {
            return false;
        } else {
            zzdly.zze(this.zzgwv, zzvcVar.zzcgy);
            zzdln zzasu = this.zzgps.zzgt(str).zze(zzvj.zzpk()).zzh(zzvcVar).zzasu();
            zzdhj zzdhjVar = new zzdhj(null);
            zzdhjVar.zzfqn = zzasu;
            zzdvt<zzbnc> zza = this.zzgwx.zza(new zzdja(zzdhjVar), new zzdjb(this) { // from class: com.google.android.gms.internal.ads.zzdhe
                private final zzdhc zzgwy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgwy = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdjb
                public final zzbsd zzc(zzdiy zzdiyVar) {
                    return this.zzgwy.zzb(zzdiyVar);
                }
            });
            this.zzgqd = zza;
            zzdvl.zza(zza, new zzdhh(this, zzcyaVar, zzdhjVar), this.zzfmk);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza */
    public final synchronized zzbmv zzb(zzdiy zzdiyVar) {
        zzdhj zzdhjVar = (zzdhj) zzdiyVar;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxr)).booleanValue()) {
            return this.zzgrp.zzadr().zza(new zzbnd(this.zzfnx)).zzb(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdhjVar.zzfqn).zzajj()).zzb(new zzbxj.zza().zzake());
        }
        zzdht zzb = zzdht.zzb(this.zzgww);
        zzbxj.zza zzaVar = new zzbxj.zza();
        zzaVar.zza((zzbsz) zzb, this.zzfmk);
        zzaVar.zza((zzbuo) zzb, this.zzfmk);
        zzaVar.zza(zzb);
        return this.zzgrp.zzadr().zza(new zzbnd(this.zzfnx)).zzb(new zzbsg.zza().zzcd(this.zzgwv).zza(zzdhjVar.zzfqn).zzajj()).zzb(zzaVar.zzake());
    }

    public final void zza(zzvm zzvmVar) {
        this.zzgps.zzb(zzvmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzarw() {
        this.zzgww.zzg(zzdmb.zza(zzdmd.zzhct, null, null));
    }
}
