package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdak implements zzdsl {
    static final zzdsl zzdwg = new zzdak();

    private zzdak() {
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final Object apply(Object obj) {
        final ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzdek(arrayList) { // from class: com.google.android.gms.internal.ads.zzdan
            private final ArrayList zzgsr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgsr = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdek
            public final void zzs(Object obj2) {
                ((Bundle) obj2).putStringArrayList("android_permissions", this.zzgsr);
            }
        };
    }
}
