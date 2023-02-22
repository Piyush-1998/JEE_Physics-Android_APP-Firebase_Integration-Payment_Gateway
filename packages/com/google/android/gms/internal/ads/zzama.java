package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzama implements zzahn {
    private final /* synthetic */ zzalv zzdid;
    private final zzakx zzdig;
    private final zzbbq<O> zzdih;

    public zzama(zzalv zzalvVar, zzakx zzakxVar, zzbbq<O> zzbbqVar) {
        this.zzdid = zzalvVar;
        this.zzdig = zzakxVar;
        this.zzdih = zzbbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc(JSONObject jSONObject) {
        zzalo zzaloVar;
        try {
            try {
                zzbbq<O> zzbbqVar = this.zzdih;
                zzaloVar = this.zzdid.zzdhy;
                zzbbqVar.set(zzaloVar.zzd(jSONObject));
                this.zzdig.release();
            } catch (IllegalStateException unused) {
                this.zzdig.release();
            } catch (JSONException e) {
                this.zzdih.setException(e);
                this.zzdig.release();
            }
        } catch (Throwable th) {
            this.zzdig.release();
            throw th;
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
        } finally {
            this.zzdig.release();
        }
    }
}
