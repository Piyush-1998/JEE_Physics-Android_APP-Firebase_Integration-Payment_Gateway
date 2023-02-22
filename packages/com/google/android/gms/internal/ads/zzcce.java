package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcce implements zzelo<JSONObject> {
    private final zzccc zzfwr;

    public zzcce(zzccc zzcccVar) {
        this.zzfwr = zzcccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (JSONObject) zzelu.zza(this.zzfwr.zzalf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
