package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzahb implements zzahf<zzbfq> {
    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbfq zzbfqVar, Map map) {
        zzbfq zzbfqVar2 = zzbfqVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbfqVar2.zzkl();
        } else if ("resume".equals(str)) {
            zzbfqVar2.zzkm();
        }
    }
}
