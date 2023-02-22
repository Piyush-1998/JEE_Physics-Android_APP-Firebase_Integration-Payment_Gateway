package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxd extends zzwx implements zzbvf {
    private final ViewGroup zzfnx;
    private final zzbii zzgmy;
    private zzbni zzgpm;
    private final Context zzgpr;
    private final zzbvb zzgqa;
    private zzvj zzgqb;
    private zzabq zzgqc;
    private zzdvt<zzbni> zzgqd;
    private final zzcxm zzgpw = new zzcxm();
    private final zzcxj zzgpx = new zzcxj();
    private final zzcxl zzgpy = new zzcxl();
    private final zzcxh zzgpz = new zzcxh();
    private final zzdlp zzgps = new zzdlp();

    public zzcxd(zzbii zzbiiVar, Context context, zzvj zzvjVar, String str) {
        this.zzfnx = new FrameLayout(context);
        this.zzgmy = zzbiiVar;
        this.zzgpr = context;
        this.zzgps.zze(zzvjVar).zzgt(str);
        zzbvb zzadn = zzbiiVar.zzadn();
        this.zzgqa = zzadn;
        zzadn.zza(this, this.zzgmy.zzadj());
        this.zzgqb = zzvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final boolean isReady() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void showInterstitial() {
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
    public final void zza(zzatt zzattVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzsi zzsiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvm zzvmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzym zzymVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzbp(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final IObjectWrapper zzkc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfnx);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized boolean zza(zzvc zzvcVar) {
        zzd(this.zzgqb);
        return zzg(zzvcVar);
    }

    private final synchronized void zzd(zzvj zzvjVar) {
        this.zzgps.zze(zzvjVar);
        this.zzgps.zzbo(this.zzgqb.zzchu);
    }

    private final synchronized boolean zzg(zzvc zzvcVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvcVar.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            if (this.zzgpw != null) {
                this.zzgpw.zzg(zzdmb.zza(zzdmd.zzhcr, null, null));
            }
            return false;
        } else if (this.zzgqd != null) {
            return false;
        } else {
            zzdly.zze(this.zzgpr, zzvcVar.zzcgy);
            zzdln zzasu = this.zzgps.zzh(zzvcVar).zzasu();
            if (zzacp.zzdbb.get().booleanValue() && this.zzgps.zzke().zzchr && this.zzgpw != null) {
                this.zzgpw.zzg(zzdmb.zza(zzdmd.zzhcu, null, null));
                return false;
            }
            zzboe zzb = zzb(zzasu);
            zzdvt<zzbni> zzaiv = zzb.zzafc().zzaiv();
            this.zzgqd = zzaiv;
            zzdvl.zza(zzaiv, new zzcxg(this, zzb), this.zzgmy.zzadj());
            return true;
        }
    }

    private final synchronized zzboe zzb(zzdln zzdlnVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxp)).booleanValue()) {
            return this.zzgmy.zzadq().zzc(new zzbsg.zza().zzcd(this.zzgpr).zza(zzdlnVar).zzajj()).zzc(new zzbxj.zza().zzake()).zza(new zzcwh(this.zzgqc)).zzb(new zzcbj(zzcdg.zzfyr, null)).zza(new zzbpa(this.zzgqa)).zzb(new zzbnd(this.zzfnx)).zzafp();
        }
        return this.zzgmy.zzadq().zzc(new zzbsg.zza().zzcd(this.zzgpr).zza(zzdlnVar).zzajj()).zzc(new zzbxj.zza().zza((zzut) this.zzgpw, this.zzgmy.zzadj()).zza(this.zzgpx, this.zzgmy.zzadj()).zza((zzbsu) this.zzgpw, this.zzgmy.zzadj()).zza((zzbuj) this.zzgpw, this.zzgmy.zzadj()).zza((zzbsz) this.zzgpw, this.zzgmy.zzadj()).zza(this.zzgpy, this.zzgmy.zzadj()).zza(this.zzgpz, this.zzgmy.zzadj()).zzake()).zza(new zzcwh(this.zzgqc)).zzb(new zzcbj(zzcdg.zzfyr, null)).zza(new zzbpa(this.zzgqa)).zzb(new zzbnd(this.zzfnx)).zzafp();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.zzail().zzbz(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.zzail().zzca(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwl zzwlVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgpw.zzc(zzwlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzwl zzki() {
        return this.zzgpw.zzaqc();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxc zzxcVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzgpy.zzb(zzxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzxc zzkh() {
        return this.zzgpy.zzaqb();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zzkd() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        if (this.zzgpm != null) {
            this.zzgpm.zzkd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized zzvj zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgpm != null) {
            return zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgpm.zzahp()));
        }
        return this.zzgps.zzke();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzvj zzvjVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzgps.zze(zzvjVar);
        this.zzgqb = zzvjVar;
        if (this.zzgpm != null) {
            this.zzgpm.zza(this.zzfnx, zzvjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String getMediationAdapterClassName() {
        if (this.zzgpm == null || this.zzgpm.zzaim() == null) {
            return null;
        }
        return this.zzgpm.zzaim().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String zzkf() {
        if (this.zzgpm == null || this.zzgpm.zzaim() == null) {
            return null;
        }
        return this.zzgpm.zzaim().getMediationAdapterClassName();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized zzyf zzkg() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwy)).booleanValue()) {
            if (this.zzgpm == null) {
                return null;
            }
            return this.zzgpm.zzaim();
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
    public final synchronized zzyg getVideoController() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        if (this.zzgpm != null) {
            return this.zzgpm.getVideoController();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String getAdUnitId() {
        return this.zzgps.zzass();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzaac zzaacVar) {
        Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        this.zzgps.zzc(zzaacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwg zzwgVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzgpx.zzb(zzwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzabq zzabqVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzgqc = zzabqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final synchronized void zzajp() {
        boolean zza;
        ViewParent parent = this.zzfnx.getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            zza = com.google.android.gms.ads.internal.zzp.zzkp().zza(view, view.getContext());
        } else {
            zza = false;
        }
        if (zza) {
            zzvj zzke = this.zzgps.zzke();
            if (this.zzgpm != null && this.zzgpm.zzahu() != null && this.zzgps.zzasv()) {
                zzke = zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgpm.zzahu()));
            }
            zzd(zzke);
            zzg(this.zzgps.zzasr());
            return;
        }
        this.zzgqa.zzdw(60);
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
}
