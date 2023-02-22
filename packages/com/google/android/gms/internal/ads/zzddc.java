package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddc implements zzdek<Bundle> {
    private final Bundle zzfsj;

    public zzddc(Bundle bundle) {
        this.zzfsj = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.zzfsj;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
