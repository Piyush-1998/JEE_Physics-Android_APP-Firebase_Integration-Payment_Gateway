package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagg extends zzaev {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzddo;

    public zzagg(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzddo = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaew
    public final void zza(zzaek zzaekVar) {
        this.zzddo.onAppInstallAdLoaded(new zzael(zzaekVar));
    }
}
