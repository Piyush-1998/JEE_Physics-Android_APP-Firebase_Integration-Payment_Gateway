package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddl implements zzden<zzdek<Bundle>> {
    private final String zzfsk;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddl(Context context, String str) {
        this.zzvr = context;
        this.zzfsk = str;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdek<Bundle>> zzaqs() {
        return zzdvl.zzaf(this.zzfsk == null ? null : new zzdek(this) { // from class: com.google.android.gms.internal.ads.zzddk
            private final zzddl zzguj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzguj = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdek
            public final void zzs(Object obj) {
                this.zzguj.zzq((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.zzvr.getPackageName());
    }
}
