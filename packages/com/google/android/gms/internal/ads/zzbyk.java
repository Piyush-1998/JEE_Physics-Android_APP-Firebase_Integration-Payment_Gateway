package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbyk implements zzbsu {
    private boolean zzfuj = false;

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

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
        this.zzfuj = true;
    }
}
