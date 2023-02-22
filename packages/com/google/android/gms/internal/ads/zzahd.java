package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzahd implements zzahf<zzbfq> {
    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbfq zzbfqVar, Map map) {
        zzbfq zzbfqVar2 = zzbfqVar;
        if (map.keySet().contains("start")) {
            zzbfqVar2.zzaz(true);
        }
        if (map.keySet().contains("stop")) {
            zzbfqVar2.zzaz(false);
        }
    }
}
