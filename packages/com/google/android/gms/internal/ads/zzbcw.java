package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbcw extends zzbco {
    @Override // com.google.android.gms.internal.ads.zzbco
    public final zzbcp zza(Context context, zzbde zzbdeVar, int i, boolean z, zzabk zzabkVar, zzbdf zzbdfVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            zzbdh zzbdhVar = new zzbdh(context, zzbdeVar.zzzt(), zzbdeVar.getRequestId(), zzabkVar, zzbdeVar.zzzp());
            if (i == 2) {
                return new zzbdl(context, zzbdhVar, zzbdeVar, z, zza(zzbdeVar), zzbdfVar);
            }
            return new zzbcc(context, z, zza(zzbdeVar), zzbdfVar, new zzbdh(context, zzbdeVar.zzzt(), zzbdeVar.getRequestId(), zzabkVar, zzbdeVar.zzzp()));
        }
        return null;
    }
}
