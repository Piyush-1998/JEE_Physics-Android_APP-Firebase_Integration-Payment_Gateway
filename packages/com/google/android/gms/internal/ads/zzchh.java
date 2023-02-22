package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchh implements com.google.android.gms.ads.internal.overlay.zzo, com.google.android.gms.ads.internal.overlay.zzt, zzagl, zzagn, zzut {
    private zzut zzcgq;
    private zzagl zzddv;
    private zzagn zzddw;
    private com.google.android.gms.ads.internal.overlay.zzo zzdor;
    private com.google.android.gms.ads.internal.overlay.zzt zzdov;

    private zzchh() {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final synchronized void onAdClicked() {
        if (this.zzcgq != null) {
            this.zzcgq.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzui() {
        if (this.zzdor != null) {
            this.zzdor.zzui();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onPause() {
        if (this.zzdor != null) {
            this.zzdor.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void onResume() {
        if (this.zzdor != null) {
            this.zzdor.onResume();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzuj() {
        if (this.zzdor != null) {
            this.zzdor.zzuj();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final synchronized void zzuz() {
        if (this.zzdov != null) {
            this.zzdov.zzuz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final synchronized void zza(String str, Bundle bundle) {
        if (this.zzddv != null) {
            this.zzddv.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    public final synchronized void onAppEvent(String str, String str2) {
        if (this.zzddw != null) {
            this.zzddw.onAppEvent(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zza(zzut zzutVar, zzagl zzaglVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzagn zzagnVar, com.google.android.gms.ads.internal.overlay.zzt zztVar) {
        this.zzcgq = zzutVar;
        this.zzddv = zzaglVar;
        this.zzdor = zzoVar;
        this.zzddw = zzagnVar;
        this.zzdov = zztVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzchh(zzchd zzchdVar) {
        this();
    }
}
