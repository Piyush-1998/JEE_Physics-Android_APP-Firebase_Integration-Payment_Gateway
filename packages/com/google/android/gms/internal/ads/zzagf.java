package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagf extends zzafa {
    private final NativeContentAd.OnContentAdLoadedListener zzddn;

    public zzagf(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzddn = onContentAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zza(zzaeo zzaeoVar) {
        this.zzddn.onContentAdLoaded(new zzaep(zzaeoVar));
    }
}
