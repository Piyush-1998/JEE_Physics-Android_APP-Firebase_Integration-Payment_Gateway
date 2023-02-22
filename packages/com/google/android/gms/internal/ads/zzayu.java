package com.google.android.gms.internal.ads;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzayu extends zzayv {
    @Override // com.google.android.gms.internal.ads.zzaym
    public final zzug zza(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzp.zzkp();
        if (zzayh.zzr(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzug.ENUM_TRUE : zzug.ENUM_FALSE;
        }
        return zzug.ENUM_FALSE;
    }
}
