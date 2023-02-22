package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzate implements zzast {
    private zzalm<JSONObject, JSONObject> zzduw;
    private zzalm<JSONObject, JSONObject> zzdux;

    public zzate(Context context) {
        this.zzdux = com.google.android.gms.ads.internal.zzp.zzlc().zza(context, zzbbg.zzyr()).zza("google.afma.request.getAdDictionary", zzalp.zzdhs, zzalp.zzdhs);
        this.zzduw = com.google.android.gms.ads.internal.zzp.zzlc().zza(context, zzbbg.zzyr()).zza("google.afma.sdkConstants.getSdkConstants", zzalp.zzdhs, zzalp.zzdhs);
    }

    @Override // com.google.android.gms.internal.ads.zzast
    public final zzalm<JSONObject, JSONObject> zzvd() {
        return this.zzduw;
    }
}
