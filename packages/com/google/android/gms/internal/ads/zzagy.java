package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzagy implements zzahf<zzbfq> {
    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbfq zzbfqVar, Map map) {
        zzbfq zzbfqVar2 = zzbfqVar;
        if (zzbfqVar2.zzabs() != null) {
            zzbfqVar2.zzabs().zzmr();
        }
        com.google.android.gms.ads.internal.overlay.zzc zzaba = zzbfqVar2.zzaba();
        if (zzaba != null) {
            zzaba.close();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzc zzabb = zzbfqVar2.zzabb();
        if (zzabb != null) {
            zzabb.close();
        } else {
            zzaxy.zzfe("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
