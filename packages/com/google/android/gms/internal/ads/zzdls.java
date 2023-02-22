package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdls {
    public static zzdkw zza(List<zzdkw> list, zzdkw zzdkwVar) {
        return list.get(0);
    }

    public static zzvj zzb(Context context, List<zzdkw> list) {
        ArrayList arrayList = new ArrayList();
        for (zzdkw zzdkwVar : list) {
            if (zzdkwVar.zzhae) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzdkwVar.width, zzdkwVar.height));
            }
        }
        return new zzvj(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzdkw zzf(zzvj zzvjVar) {
        if (zzvjVar.zzchp) {
            return new zzdkw(-3, 0, true);
        }
        return new zzdkw(zzvjVar.width, zzvjVar.height, false);
    }
}
