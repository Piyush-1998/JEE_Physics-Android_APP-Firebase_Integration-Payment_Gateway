package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzasw {
    private WeakHashMap<Context, zzasy> zzduq = new WeakHashMap<>();

    public final Future<zzasu> zzu(Context context) {
        return zzbbi.zzedu.zze(new zzasz(this, context));
    }
}
