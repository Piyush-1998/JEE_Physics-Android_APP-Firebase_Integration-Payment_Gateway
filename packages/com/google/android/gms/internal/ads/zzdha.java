package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdha implements Callable {
    static final Callable zzgtz = new zzdha();

    private zzdha() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String[] split;
        HashMap hashMap = new HashMap();
        String str = (String) zzwe.zzpu().zzd(zzaat.zzcml);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcmm)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzbar.zzew(str2));
                }
            }
        }
        return new zzdgy(hashMap);
    }
}
