package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdaq implements zzdek<Bundle> {
    private final boolean zzgtc = false;
    private final boolean zzgtd = false;
    private final boolean zzgte;

    public zzdaq(boolean z, boolean z2, boolean z3) {
        this.zzgte = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("c_pcbg", this.zzgtc);
        bundle2.putBoolean("c_phbg", this.zzgtd);
        bundle2.putBoolean("ar_lr", this.zzgte);
    }
}
