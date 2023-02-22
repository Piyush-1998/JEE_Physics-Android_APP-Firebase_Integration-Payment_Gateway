package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdcd implements zzdek<Bundle> {
    private final String zzdqw;
    private final boolean zzdqy;

    public zzdcd(String str, boolean z) {
        this.zzdqw = str;
        this.zzdqy = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.zzdqw);
        if (this.zzdqy) {
            bundle2.putString("de", "1");
        }
    }
}
