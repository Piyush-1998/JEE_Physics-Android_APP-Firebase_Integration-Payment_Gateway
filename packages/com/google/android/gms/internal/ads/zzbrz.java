package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbrz {
    private final String packageName;
    private final zzbbg zzbop;
    private final PackageInfo zzdpx;
    private final List<String> zzdqh;
    private final String zzdtf;
    private final zzaya zzdza;
    private final zzdpf zzfqo;
    private final ApplicationInfo zzfrx;
    private final zzeli<zzdvt<String>> zzfry;
    private final zzdem<Bundle> zzfrz;

    public zzbrz(zzdpf zzdpfVar, zzbbg zzbbgVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, zzeli<zzdvt<String>> zzeliVar, zzaya zzayaVar, String str2, zzdem<Bundle> zzdemVar) {
        this.zzfqo = zzdpfVar;
        this.zzbop = zzbbgVar;
        this.zzfrx = applicationInfo;
        this.packageName = str;
        this.zzdqh = list;
        this.zzdpx = packageInfo;
        this.zzfry = zzeliVar;
        this.zzdza = zzayaVar;
        this.zzdtf = str2;
        this.zzfrz = zzdemVar;
    }

    public final zzdvt<Bundle> zzajc() {
        return this.zzfqo.zzu(zzdpg.SIGNALS).zze(this.zzfrz.zzt(new Bundle())).zzauz();
    }

    public final zzdvt<zzasp> zzajd() {
        final zzdvt<Bundle> zzajc = zzajc();
        return this.zzfqo.zza((zzdpf) zzdpg.REQUEST_PARCEL, zzajc, this.zzfry.get()).zzb(new Callable(this, zzajc) { // from class: com.google.android.gms.internal.ads.zzbsc
            private final zzbrz zzfsh;
            private final zzdvt zzfsi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsh = this;
                this.zzfsi = zzajc;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzfsh.zzc(this.zzfsi);
            }
        }).zzauz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzasp zzc(zzdvt zzdvtVar) throws Exception {
        return new zzasp((Bundle) zzdvtVar.get(), this.zzbop, this.zzfrx, this.packageName, this.zzdqh, this.zzdpx, this.zzfry.get().get(), this.zzdza.zzxc(), this.zzdtf, null, null);
    }
}
