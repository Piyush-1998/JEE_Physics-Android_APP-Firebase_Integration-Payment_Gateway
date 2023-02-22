package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzded implements zzden<zzdek<Bundle>> {
    private final boolean zzgva;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzded(zzdjf zzdjfVar) {
        if (zzdjfVar != null) {
            this.zzgva = true;
        } else {
            this.zzgva = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdek<Bundle>> zzaqs() {
        return zzdvl.zzaf(this.zzgva ? zzdec.zzguz : null);
    }
}
