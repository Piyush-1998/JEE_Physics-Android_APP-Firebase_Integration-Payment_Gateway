package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzahk implements zzahf<zzbfq> {
    private static final Map<String, Integer> zzdeu = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zza zzder;
    private final zzapw zzdes;
    private final zzaqf zzdet;

    public zzahk(com.google.android.gms.ads.internal.zza zzaVar, zzapw zzapwVar, zzaqf zzaqfVar) {
        this.zzder = zzaVar;
        this.zzdes = zzapwVar;
        this.zzdet = zzaqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbfq zzbfqVar, Map map) {
        com.google.android.gms.ads.internal.zza zzaVar;
        zzbfq zzbfqVar2 = zzbfqVar;
        int intValue = zzdeu.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzaVar = this.zzder) != null && !zzaVar.zzjx()) {
            this.zzder.zzbo(null);
        } else if (intValue == 1) {
            this.zzdes.zzg(map);
        } else if (intValue == 3) {
            new zzapx(zzbfqVar2, map).execute();
        } else if (intValue == 4) {
            new zzapr(zzbfqVar2, map).execute();
        } else if (intValue == 5) {
            new zzapy(zzbfqVar2, map).execute();
        } else if (intValue == 6) {
            this.zzdes.zzac(true);
        } else if (intValue == 7) {
            this.zzdet.zzun();
        } else {
            zzaxy.zzfd("Unknown MRAID command called.");
        }
    }
}
