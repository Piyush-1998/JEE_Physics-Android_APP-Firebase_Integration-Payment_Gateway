package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmo implements zzelo<JSONObject> {
    private final zzelx<zzdkx> zzfnc;

    private zzbmo(zzelx<zzdkx> zzelxVar) {
        this.zzfnc = zzelxVar;
    }

    public static zzbmo zzc(zzelx<zzdkx> zzelxVar) {
        return new zzbmo(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzbml.zzb(this.zzfnc.get());
    }
}
