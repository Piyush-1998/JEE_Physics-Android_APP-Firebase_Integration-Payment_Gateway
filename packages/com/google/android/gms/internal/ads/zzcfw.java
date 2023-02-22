package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcfw implements zzdsl {
    static final zzdsl zzdwg = new zzcfw();

    private zzcfw() {
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzcfy zzcfyVar : (List) obj) {
            if (zzcfyVar != null) {
                arrayList.add(zzcfyVar);
            }
        }
        return arrayList;
    }
}
