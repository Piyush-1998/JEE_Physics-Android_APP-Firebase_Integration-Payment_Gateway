package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzczz implements zzden<zzdek<Bundle>> {
    private final Set<String> zzgss;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzczz(Set<String> set) {
        this.zzgss = set;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdek<Bundle>> zzaqs() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zzgss) {
            arrayList.add(str);
        }
        return zzdvl.zzaf(new zzdek(arrayList) { // from class: com.google.android.gms.internal.ads.zzczy
            private final ArrayList zzgsr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsr = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdek
            public final void zzs(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", this.zzgsr);
            }
        });
    }
}
