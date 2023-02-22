package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzt extends zzyd {
    private final OnPaidEventListener zzckr;

    public zzzt(OnPaidEventListener onPaidEventListener) {
        this.zzckr = onPaidEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zza(zzvl zzvlVar) {
        if (this.zzckr != null) {
            this.zzckr.onPaidEvent(AdValue.zza(zzvlVar.zzadb, zzvlVar.zzadc, zzvlVar.zzadd));
        }
    }
}
