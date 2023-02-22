package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxo extends zzwx {
    private final Executor zzfmk;
    private final zzbii zzgmy;
    private final Context zzgpr;
    private final zzdlp zzgps;
    private zzabq zzgqc;
    private zzdvt<zzbzr> zzgqd;
    private zzbzr zzgqr;
    private boolean zzgqs;
    private final zzcxm zzgpw = new zzcxm();
    private final zzcxl zzgpy = new zzcxl();
    private final zzdje zzgqq = new zzdje(new zzdmt());
    private final zzcxh zzgpz = new zzcxh();

    public zzcxo(zzbii zzbiiVar, Context context, zzvj zzvjVar, String str) {
        zzdlp zzdlpVar = new zzdlp();
        this.zzgps = zzdlpVar;
        this.zzgqs = false;
        this.zzgmy = zzbiiVar;
        zzdlpVar.zze(zzvjVar).zzgt(str);
        this.zzfmk = zzbiiVar.zzadj();
        this.zzgpr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzyg getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzaqv zzaqvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzarb zzarbVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzsi zzsiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvj zzvjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvm zzvmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwg zzwgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzym zzymVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzbp(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final IObjectWrapper zzkc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzkd() {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzvj zzke() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized boolean zza(zzvc zzvcVar) {
        zzcar zzafz;
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvcVar.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            if (this.zzgpw != null) {
                this.zzgpw.zzg(zzdmb.zza(zzdmd.zzhcr, null, null));
            }
            return false;
        }
        if (this.zzgqd == null && !zzaqd()) {
            zzdly.zze(this.zzgpr, zzvcVar.zzcgy);
            this.zzgqr = null;
            zzdln zzasu = this.zzgps.zzh(zzvcVar).zzasu();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxs)).booleanValue()) {
                zzafz = this.zzgmy.zzadt().zzd(new zzbsg.zza().zzcd(this.zzgpr).zza(zzasu).zzajj()).zzd(new zzbxj.zza().zzake()).zzb(new zzcwh(this.zzgqc)).zzafz();
            } else {
                zzbxj.zza zzaVar = new zzbxj.zza();
                if (this.zzgqq != null) {
                    zzaVar.zza((zzbsu) this.zzgqq, this.zzgmy.zzadj()).zza((zzbuj) this.zzgqq, this.zzgmy.zzadj()).zza((zzbsz) this.zzgqq, this.zzgmy.zzadj());
                }
                zzafz = this.zzgmy.zzadt().zzd(new zzbsg.zza().zzcd(this.zzgpr).zza(zzasu).zzajj()).zzd(zzaVar.zza((zzbsu) this.zzgpw, this.zzgmy.zzadj()).zza((zzbuj) this.zzgpw, this.zzgmy.zzadj()).zza((zzbsz) this.zzgpw, this.zzgmy.zzadj()).zza((zzut) this.zzgpw, this.zzgmy.zzadj()).zza(this.zzgpy, this.zzgmy.zzadj()).zza(this.zzgpz, this.zzgmy.zzadj()).zzake()).zzb(new zzcwh(this.zzgqc)).zzafz();
            }
            zzdvt<zzbzr> zzaiv = zzafz.zzafc().zzaiv();
            this.zzgqd = zzaiv;
            zzdvl.zza(zzaiv, new zzcxn(this, zzafz), this.zzfmk);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgqr != null) {
            this.zzgqr.zzail().zzcb(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgqr != null) {
            this.zzgqr.zzail().zzbz(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgqr != null) {
            this.zzgqr.zzail().zzca(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwl zzwlVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgpw.zzc(zzwlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxc zzxcVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgpy.zzb(zzxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void showInterstitial() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzgqr == null) {
            return;
        }
        this.zzgqr.zzbi(this.zzgqs);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgqr == null || this.zzgqr.zzaim() == null) {
            return null;
        }
        return this.zzgqr.zzaim().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String zzkf() {
        if (this.zzgqr == null || this.zzgqr.zzaim() == null) {
            return null;
        }
        return this.zzgqr.zzaim().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized zzyf zzkg() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue()) {
            if (this.zzgqr == null) {
                return null;
            }
            return this.zzgqr.zzaim();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzxi zzxiVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzgps.zzc(zzxiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void setManualImpressionsEnabled(boolean z) {
        Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        this.zzgps.zzbp(z);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized boolean isLoading() {
        boolean z;
        if (this.zzgqd != null) {
            z = this.zzgqd.isDone() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized boolean isReady() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzaqd();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String getAdUnitId() {
        return this.zzgps.zzass();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzxc zzkh() {
        return this.zzgpy.zzaqb();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzwl zzki() {
        return this.zzgpw.zzaqc();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzgqs = z;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzaac zzaacVar) {
        this.zzgps.zzc(zzaacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzabq zzabqVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgqc = zzabqVar;
    }

    private final synchronized boolean zzaqd() {
        boolean z;
        if (this.zzgqr != null) {
            z = this.zzgqr.isClosed() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzya zzyaVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzgpz.zzb(zzyaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxb zzxbVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final Bundle getAdMetadata() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzatt zzattVar) {
        this.zzgqq.zzb(zzattVar);
    }
}
