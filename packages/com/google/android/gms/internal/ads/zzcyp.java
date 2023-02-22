package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcyp implements zzdsl {
    static final zzdsl zzdwg = new zzcyp();

    private zzcyp() {
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final Object apply(Object obj) {
        String optString;
        optString = ((JSONObject) obj).optString("nas");
        return optString;
    }
}
