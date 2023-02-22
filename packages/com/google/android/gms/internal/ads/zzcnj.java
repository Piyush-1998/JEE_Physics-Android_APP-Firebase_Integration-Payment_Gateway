package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcnj implements zzelo<PackageInfo> {
    private final zzelx<Context> zzert;
    private final zzelx<ApplicationInfo> zzghj;

    private zzcnj(zzelx<Context> zzelxVar, zzelx<ApplicationInfo> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzghj = zzelxVar2;
    }

    public static zzcnj zzaq(zzelx<Context> zzelxVar, zzelx<ApplicationInfo> zzelxVar2) {
        return new zzcnj(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzcmz.zza(this.zzert.get(), this.zzghj.get());
    }
}
