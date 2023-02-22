package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.instream.InstreamAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzajg extends zzajc {
    private final InstreamAd.InstreamAdLoadCallback zzdfn;

    public zzajg(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        this.zzdfn = instreamAdLoadCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzaiz
    public final void zza(zzait zzaitVar) {
        this.zzdfn.onInstreamAdLoaded(new zzaje(zzaitVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaiz
    public final void onInstreamAdFailedToLoad(int i) {
        this.zzdfn.onInstreamAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaiz
    public final void zzc(zzuw zzuwVar) {
        this.zzdfn.onInstreamAdFailedToLoad(zzuwVar.zzpg());
    }
}
