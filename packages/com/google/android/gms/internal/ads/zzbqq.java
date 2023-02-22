package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqq implements zzbsu, zzbtm, zzbuj, zzbvj, zzut {
    private final Clock zzbpw;
    private final zzaxj zzfrd;

    public zzbqq(Clock clock, zzaxj zzaxjVar) {
        this.zzbpw = clock;
        this.zzfrd = zzaxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zzb(zzatj zzatjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzd(zzasp zzaspVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void onAdClicked() {
        this.zzfrd.zzwa();
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void onAdLoaded() {
        this.zzfrd.zzan(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void onAdImpression() {
        this.zzfrd.zzvz();
    }

    public final void zzf(zzvc zzvcVar) {
        this.zzfrd.zze(zzvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzb(zzdlj zzdljVar) {
        this.zzfrd.zzey(this.zzbpw.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
        this.zzfrd.zzwb();
    }

    public final String zzwc() {
        return this.zzfrd.zzwc();
    }
}
