package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddg implements zzdek<Bundle> {
    private String zzdqg;

    public zzddg(String str) {
        this.zzdqg = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        bundle.putString("request_id", this.zzdqg);
    }
}
