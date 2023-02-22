package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgo {
    private final zzasp zzgid;
    private final int zzgjp;

    public zzdgo(zzasp zzaspVar, int i) {
        this.zzgid = zzaspVar;
        this.zzgjp = i;
    }

    public final String zzarn() {
        return this.zzgid.packageName;
    }

    public final String zzaro() {
        return this.zzgid.zzdtd.getString("ms");
    }

    public final PackageInfo zzarp() {
        return this.zzgid.zzdpx;
    }

    public final boolean zzarq() {
        return this.zzgid.zzdte;
    }

    public final List<String> zzarr() {
        return this.zzgid.zzdqh;
    }

    public final ApplicationInfo zzars() {
        return this.zzgid.applicationInfo;
    }

    public final String zzart() {
        return this.zzgid.zzdtf;
    }

    public final int zzaru() {
        return this.zzgjp;
    }
}
