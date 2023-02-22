package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcfm implements zzdsl {
    static final zzdsl zzdwg = new zzcfm();

    private zzcfm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzadi zzadiVar : (List) obj) {
            if (zzadiVar != null) {
                arrayList.add(zzadiVar);
            }
        }
        return arrayList;
    }
}
