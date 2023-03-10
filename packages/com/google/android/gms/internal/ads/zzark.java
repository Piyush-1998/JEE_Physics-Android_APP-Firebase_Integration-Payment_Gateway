package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzark {
    @Nonnull
    private View zzaat;
    private final Map<String, WeakReference<View>> zzdpj = new HashMap();

    public final zzark zzk(View view) {
        this.zzaat = view;
        return this;
    }

    public final zzark zzh(Map<String, View> map) {
        this.zzdpj.clear();
        for (Map.Entry<String, View> entry : map.entrySet()) {
            View value = entry.getValue();
            if (value != null) {
                this.zzdpj.put(entry.getKey(), new WeakReference<>(value));
            }
        }
        return this;
    }
}
