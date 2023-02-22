package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbul implements zzbxg {
    static final zzbxg zzfst = new zzbul();

    private zzbul() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final void zzp(Object obj) {
        ((AdMetadataListener) obj).onAdMetadataChanged();
    }
}
