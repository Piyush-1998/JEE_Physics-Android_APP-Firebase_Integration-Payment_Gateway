package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcwq implements com.google.android.gms.ads.internal.zzg {
    private final /* synthetic */ zzbzt zzgph;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcwq(zzcwl zzcwlVar, zzbzt zzbztVar) {
        this.zzgph = zzbztVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzh(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzka() {
        this.zzgph.zzaeo().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkb() {
        this.zzgph.zzaep().onAdImpression();
        this.zzgph.zzaeq().zzaki();
    }
}
