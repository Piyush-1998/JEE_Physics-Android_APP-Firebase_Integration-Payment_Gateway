package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddd implements zzelo<zzdda> {
    private final zzelx<PackageInfo> zzfse;
    private final zzelx<ApplicationInfo> zzghj;

    private zzddd(zzelx<ApplicationInfo> zzelxVar, zzelx<PackageInfo> zzelxVar2) {
        this.zzghj = zzelxVar;
        this.zzfse = zzelxVar2;
    }

    public static zzddd zzbd(zzelx<ApplicationInfo> zzelxVar, zzelx<PackageInfo> zzelxVar2) {
        return new zzddd(zzelxVar, zzelxVar2);
    }

    public static zzdda zza(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new zzdda(applicationInfo, packageInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzghj.get(), this.zzfse.get());
    }
}
