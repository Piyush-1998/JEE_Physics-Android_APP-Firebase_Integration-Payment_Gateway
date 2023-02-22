package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaho implements zzahn {
    private final /* synthetic */ zzbbq zzdew;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaho(zzahl zzahlVar, zzbbq zzbbqVar) {
        this.zzdew = zzbbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc(JSONObject jSONObject) {
        this.zzdew.set(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void onFailure(String str) {
        this.zzdew.setException(new zzalj(str));
    }
}
