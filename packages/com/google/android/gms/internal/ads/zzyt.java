package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzyt extends zzwh {
    private final /* synthetic */ zzyq zzcjv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzyt(zzyq zzyqVar) {
        this.zzcjv = zzyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwh, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zzcjv.zzcjj;
        videoController.zza(this.zzcjv.zzdt());
        super.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzwh, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i) {
        VideoController videoController;
        videoController = this.zzcjv.zzcjj;
        videoController.zza(this.zzcjv.zzdt());
        super.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwh, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        videoController = this.zzcjv.zzcjj;
        videoController.zza(this.zzcjv.zzdt());
        super.onAdFailedToLoad(loadAdError);
    }
}
