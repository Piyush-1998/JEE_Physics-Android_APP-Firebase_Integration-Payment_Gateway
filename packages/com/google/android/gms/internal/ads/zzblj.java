package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzblj implements zzblg {
    private final Context zzvr;

    public zzblj(Context context) {
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final void zzl(Map<String, String> map) {
        CookieManager zzbg;
        String str = map.get("cookie");
        if (TextUtils.isEmpty(str) || (zzbg = com.google.android.gms.ads.internal.zzp.zzkr().zzbg(this.zzvr)) == null) {
            return;
        }
        zzbg.setCookie((String) zzwe.zzpu().zzd(zzaat.zzcny), str);
    }
}
