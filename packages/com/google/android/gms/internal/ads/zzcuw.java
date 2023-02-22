package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcuw implements zzcrf<zzdlx, zzcsn> {
    private final zzcji zzggg;
    private final Map<String, zzcrg<zzdlx, zzcsn>> zzgnr = new HashMap();

    public zzcuw(zzcji zzcjiVar) {
        this.zzggg = zzcjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrf
    public final zzcrg<zzdlx, zzcsn> zzf(String str, JSONObject jSONObject) throws zzdlr {
        synchronized (this) {
            zzcrg<zzdlx, zzcsn> zzcrgVar = this.zzgnr.get(str);
            if (zzcrgVar == null) {
                zzdlx zzd = this.zzggg.zzd(str, jSONObject);
                if (zzd == null) {
                    return null;
                }
                zzcrgVar = new zzcrg<>(zzd, new zzcsn(), str);
                this.zzgnr.put(str, zzcrgVar);
            }
            return zzcrgVar;
        }
    }
}
