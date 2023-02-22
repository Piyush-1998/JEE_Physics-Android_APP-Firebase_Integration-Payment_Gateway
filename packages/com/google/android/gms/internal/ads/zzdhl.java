package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdhl extends zzwx implements com.google.android.gms.ads.internal.overlay.zzy, zzbuo, zzsc {
    private final zzbbg zzbop;
    private final String zzbuo;
    private final ViewGroup zzfnx;
    private final zzbii zzgmy;
    private final Context zzgpr;
    private AtomicBoolean zzgxh = new AtomicBoolean();
    private final zzdhc zzgxi;
    private final zzdht zzgxj;
    private long zzgxk;
    private zzbmn zzgxl;
    protected zzbnc zzgxm;

    public zzdhl(zzbii zzbiiVar, Context context, String str, zzdhc zzdhcVar, zzdht zzdhtVar, zzbbg zzbbgVar) {
        this.zzfnx = new FrameLayout(context);
        this.zzgmy = zzbiiVar;
        this.zzgpr = context;
        this.zzbuo = str;
        this.zzgxi = zzdhcVar;
        this.zzgxj = zzdhtVar;
        zzdhtVar.zza(this);
        this.zzbop = zzbbgVar;
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
    public final void zza(zzwg zzwgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzwl zzwlVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxb zzxbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzxc zzxcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzya zzyaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzym zzymVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzbp(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzxc zzkh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final zzwl zzki() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final IObjectWrapper zzkc() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzfnx);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzvm zzvmVar) {
        this.zzgxi.zza(zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized boolean zza(zzvc zzvcVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzbe(this.zzgpr) && zzvcVar.zzchi == null) {
            zzaxy.zzfc("Failed to load the ad because app ID is missing.");
            this.zzgxj.zzg(zzdmb.zza(zzdmd.zzhcr, null, null));
            return false;
        } else if (isLoading()) {
            return false;
        } else {
            this.zzgxh = new AtomicBoolean();
            return this.zzgxi.zza(zzvcVar, this.zzbuo, new zzdhm(this), new zzdhp(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.android.gms.ads.internal.overlay.zzq zza(zzbnc zzbncVar) {
        boolean zzabx = zzbncVar.zzabx();
        int intValue = ((Integer) zzwe.zzpu().zzd(zzaat.zzctj)).intValue();
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = new com.google.android.gms.ads.internal.overlay.zzp();
        zzpVar.size = 50;
        zzpVar.paddingLeft = zzabx ? intValue : 0;
        zzpVar.paddingRight = zzabx ? 0 : intValue;
        zzpVar.paddingTop = 0;
        zzpVar.paddingBottom = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzq(this.zzgpr, zzpVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RelativeLayout.LayoutParams zzb(zzbnc zzbncVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(zzbncVar.zzabx() ? 11 : 9);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzbnc zzbncVar) {
        zzbncVar.zza(this);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzup() {
        zzasa();
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzmr() {
        zzasa();
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzajl() {
        if (this.zzgxm == null) {
            return;
        }
        this.zzgxk = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
        int zzahh = this.zzgxm.zzahh();
        if (zzahh <= 0) {
            return;
        }
        zzbmn zzbmnVar = new zzbmn(this.zzgmy.zzadk(), com.google.android.gms.ads.internal.zzp.zzkw());
        this.zzgxl = zzbmnVar;
        zzbmnVar.zza(zzahh, new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdhn
            private final zzdhl zzgxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxg = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgxg.zzarz();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzarx */
    public final void zzasa() {
        if (this.zzgxh.compareAndSet(false, true)) {
            zzbnc zzbncVar = this.zzgxm;
            if (zzbncVar != null && zzbncVar.zzahs() != null) {
                this.zzgxj.zzb(this.zzgxm.zzahs());
            }
            this.zzgxj.onAdClosed();
            this.zzfnx.removeAllViews();
            zzbmn zzbmnVar = this.zzgxl;
            if (zzbmnVar != null) {
                com.google.android.gms.ads.internal.zzp.zzks().zzb(zzbmnVar);
            }
            zzbnc zzbncVar2 = this.zzgxm;
            if (zzbncVar2 != null) {
                zzbncVar2.zzfd(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - this.zzgxk);
            }
            destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzvj zzary() {
        return zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgxm.zzahp()));
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        if (this.zzgxm != null) {
            this.zzgxm.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zza(zzsi zzsiVar) {
        this.zzgxj.zzb(zzsiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized zzvj zzke() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        if (this.zzgxm != null) {
            return zzdls.zzb(this.zzgpr, Collections.singletonList(this.zzgxm.zzahp()));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzvj zzvjVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String getMediationAdapterClassName() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String zzkf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized zzyf zzkg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized boolean isLoading() {
        return this.zzgxi.isLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized String getAdUnitId() {
        return this.zzbuo;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zzkd() {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzxi zzxiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void setManualImpressionsEnabled(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized zzyg getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzaac zzaacVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final synchronized void zza(zzabq zzabqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final Bundle getAdMetadata() {
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzarz() {
        this.zzgmy.zzadj().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdhk
            private final zzdhl zzgxg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgxg = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgxg.zzasa();
            }
        });
    }
}
