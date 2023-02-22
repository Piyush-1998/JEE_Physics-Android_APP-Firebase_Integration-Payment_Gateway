package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbz implements zzdek<Bundle> {
    private final Bundle zzgtx;

    public zzdbz(Bundle bundle) {
        this.zzgtx = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        bundle.putBundle("content_info", this.zzgtx);
    }
}
