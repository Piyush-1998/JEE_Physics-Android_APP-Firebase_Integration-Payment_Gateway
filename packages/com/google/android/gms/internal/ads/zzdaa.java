package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdaa implements zzdek<Bundle> {
    private final Bundle zzgst;

    private zzdaa(Bundle bundle) {
        this.zzgst = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zzgst.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.zzgst);
    }
}
