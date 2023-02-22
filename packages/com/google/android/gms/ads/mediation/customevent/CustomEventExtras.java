package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@Deprecated
/* loaded from: classes.dex */
public final class CustomEventExtras implements NetworkExtras {
    private final HashMap<String, Object> zzerj = new HashMap<>();

    public final Object getExtra(String str) {
        return this.zzerj.get(str);
    }

    public final void setExtra(String str, Object obj) {
        this.zzerj.put(str, obj);
    }
}
