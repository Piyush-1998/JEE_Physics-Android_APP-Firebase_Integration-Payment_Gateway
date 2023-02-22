package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdah implements zzdek<Bundle> {
    private final zzvm zzgsx;

    public zzdah(zzvm zzvmVar) {
        this.zzgsx = zzvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzvm zzvmVar = this.zzgsx;
        if (zzvmVar != null) {
            if (zzvmVar.orientation == 1) {
                bundle2.putString("avo", "p");
            } else if (this.zzgsx.orientation == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
