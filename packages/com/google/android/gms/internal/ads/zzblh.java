package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzblh implements zzblg {
    private zzaya zzdza;

    public zzblh(zzaya zzayaVar) {
        this.zzdza = zzayaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzl(Map<String, String> map) {
        this.zzdza.zzap(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
