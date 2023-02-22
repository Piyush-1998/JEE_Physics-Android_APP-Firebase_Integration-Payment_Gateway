package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdda implements zzdek<Bundle>, zzden<zzdek<Bundle>> {
    private final ApplicationInfo applicationInfo;
    private final PackageInfo zzdpx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdda(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.applicationInfo = applicationInfo;
        this.zzdpx = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdek<Bundle>> zzaqs() {
        return zzdvl.zzaf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.applicationInfo.packageName;
        PackageInfo packageInfo = this.zzdpx;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle2.putString("pn", str);
        if (valueOf != null) {
            bundle2.putInt("vc", valueOf.intValue());
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvi)).booleanValue()) {
            PackageInfo packageInfo2 = this.zzdpx;
            String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
            if (str2 != null) {
                bundle2.putString("vnm", str2);
            }
        }
    }
}
