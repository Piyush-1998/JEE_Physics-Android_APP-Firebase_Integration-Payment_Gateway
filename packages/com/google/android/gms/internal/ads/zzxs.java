package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzxs extends zzxq {
    private final MuteThisAdListener zzciz;

    public zzxs(MuteThisAdListener muteThisAdListener) {
        this.zzciz = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void onAdMuted() {
        this.zzciz.onAdMuted();
    }
}
