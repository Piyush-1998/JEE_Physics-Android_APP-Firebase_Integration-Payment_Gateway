package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdnl {
    private HashMap<zzdng, zzdno<? extends zzbpd>> zzhfl = new HashMap<>();

    public final <AdT extends zzbpd> zzdno<AdT> zza(zzdng zzdngVar, Context context, zzdmt zzdmtVar, zzdnw<AdT> zzdnwVar) {
        zzdno<AdT> zzdnoVar = (zzdno<AdT>) this.zzhfl.get(zzdngVar);
        if (zzdnoVar == null) {
            zzdmz zzdmzVar = new zzdmz(zzdnd.zza(zzdngVar, context));
            zzdno<AdT> zzdnoVar2 = new zzdno<>(zzdmzVar, new zzdnp(zzdmzVar, zzdmtVar, zzdnwVar));
            this.zzhfl.put(zzdngVar, zzdnoVar2);
            return zzdnoVar2;
        }
        return zzdnoVar;
    }
}
