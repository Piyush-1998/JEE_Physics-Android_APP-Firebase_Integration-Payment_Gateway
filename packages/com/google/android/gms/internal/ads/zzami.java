package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzami implements zzahn {
    private final zzbbq<O> zzdih;
    private final /* synthetic */ zzamg zzdik;

    public zzami(zzamg zzamgVar, zzbbq<O> zzbbqVar) {
        this.zzdik = zzamgVar;
        this.zzdih = zzbbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc(JSONObject jSONObject) {
        zzalo zzaloVar;
        try {
            zzbbq<O> zzbbqVar = this.zzdih;
            zzaloVar = this.zzdik.zzdhy;
            zzbbqVar.set(zzaloVar.zzd(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzdih.setException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void onFailure(String str) {
        try {
            if (str == null) {
                this.zzdih.setException(new zzalj());
            } else {
                this.zzdih.setException(new zzalj(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
