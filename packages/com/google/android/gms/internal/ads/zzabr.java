package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzabr extends zzabp {
    private final OnCustomRenderedAdLoadedListener zzcjl;

    public zzabr(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcjl = onCustomRenderedAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zza(zzabl zzablVar) {
        this.zzcjl.onCustomRenderedAdLoaded(new zzabm(zzablVar));
    }
}
