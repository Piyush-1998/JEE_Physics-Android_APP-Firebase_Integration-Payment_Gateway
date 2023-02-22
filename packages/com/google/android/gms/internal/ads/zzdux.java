package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdux<V> extends zzduu<V, List<V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdux(zzdtf<? extends zzdvt<? extends V>> zzdtfVar, boolean z) {
        super(zzdtfVar, true);
        zzaxd();
    }

    @Override // com.google.android.gms.internal.ads.zzduu
    public final /* synthetic */ Object zzj(List list) {
        ArrayList zzep = zzdto.zzep(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzduw zzduwVar = (zzduw) it.next();
            zzep.add(zzduwVar != null ? zzduwVar.value : null);
        }
        return Collections.unmodifiableList(zzep);
    }
}
