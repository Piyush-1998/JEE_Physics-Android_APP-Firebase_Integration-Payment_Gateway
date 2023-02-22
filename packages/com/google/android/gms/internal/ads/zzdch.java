package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdch implements zzdek<Bundle> {
    private final Bundle zzdqv;

    public zzdch(Bundle bundle) {
        this.zzdqv = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzdlu.zza(bundle2, "device");
        zza.putBundle("android_mem_info", this.zzdqv);
        bundle2.putBundle("device", zza);
    }
}
