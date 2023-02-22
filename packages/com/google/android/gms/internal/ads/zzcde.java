package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcde implements zzelo<zzcdc> {
    private final zzelx<JSONObject> zzeuj;
    private final zzelx<zzdkx> zzfnc;

    public zzcde(zzelx<zzdkx> zzelxVar, zzelx<JSONObject> zzelxVar2) {
        this.zzfnc = zzelxVar;
        this.zzeuj = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcdc(this.zzfnc.get(), this.zzeuj.get());
    }
}
