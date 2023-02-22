package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzahe implements zzahf<zzbfq> {
    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbfq zzbfqVar, Map map) {
        zzbfq zzbfqVar2 = zzbfqVar;
        if (map.keySet().contains("start")) {
            zzbfqVar2.zzabe().zzace();
        } else if (map.keySet().contains("stop")) {
            zzbfqVar2.zzabe().zzacf();
        } else if (map.keySet().contains("cancel")) {
            zzbfqVar2.zzabe().zzacg();
        }
    }
}
