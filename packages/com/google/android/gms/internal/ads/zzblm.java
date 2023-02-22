package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzblm implements zzblg {
    private final zzaya zzdza;

    public zzblm(zzaya zzayaVar) {
        this.zzdza = zzayaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzl(Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if ("auto_collect_location".equals(map.get("key"))) {
            this.zzdza.zzaq(Boolean.parseBoolean(str));
        }
    }
}
