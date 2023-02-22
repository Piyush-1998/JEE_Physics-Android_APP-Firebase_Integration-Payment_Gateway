package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdjr implements zzdio {
    static final zzdio zzgxx = new zzdjr();

    private zzdjr() {
    }

    @Override // com.google.android.gms.internal.ads.zzdio
    public final void zzq(Object obj) {
        ((AdMetadataListener) obj).onAdMetadataChanged();
    }
}
