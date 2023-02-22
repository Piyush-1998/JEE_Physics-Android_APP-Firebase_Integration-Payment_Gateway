package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmg implements zzelo<zzqo> {
    private final zzelx<JSONObject> zzeum;
    private final zzelx<zzdkx> zzfnc;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<String> zzfne;

    private zzbmg(zzelx<zzdkx> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<JSONObject> zzelxVar3, zzelx<String> zzelxVar4) {
        this.zzfnc = zzelxVar;
        this.zzfnd = zzelxVar2;
        this.zzeum = zzelxVar3;
        this.zzfne = zzelxVar4;
    }

    public static zzbmg zza(zzelx<zzdkx> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<JSONObject> zzelxVar3, zzelx<String> zzelxVar4) {
        return new zzbmg(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        this.zzfnc.get();
        zzbbg zzbbgVar = this.zzfnd.get();
        JSONObject jSONObject = this.zzeum.get();
        String str = this.zzfne.get();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzp.zzkp();
        return (zzqo) zzelu.zza(new zzqo(zzayh.zzxo(), zzbbgVar, str, jSONObject, false, equals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
