package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsb implements zzelo<zzbrz> {
    private final zzelx<zzaya> zzeyo;
    private final zzelx<zzdem<Bundle>> zzfbk;
    private final zzelx<zzbbg> zzfnd;
    private final zzelx<zzdpf> zzfow;
    private final zzelx<ApplicationInfo> zzfsb;
    private final zzelx<String> zzfsc;
    private final zzelx<List<String>> zzfsd;
    private final zzelx<PackageInfo> zzfse;
    private final zzelx<zzdvt<String>> zzfsf;
    private final zzelx<String> zzfsg;

    private zzbsb(zzelx<zzdpf> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<ApplicationInfo> zzelxVar3, zzelx<String> zzelxVar4, zzelx<List<String>> zzelxVar5, zzelx<PackageInfo> zzelxVar6, zzelx<zzdvt<String>> zzelxVar7, zzelx<zzaya> zzelxVar8, zzelx<String> zzelxVar9, zzelx<zzdem<Bundle>> zzelxVar10) {
        this.zzfow = zzelxVar;
        this.zzfnd = zzelxVar2;
        this.zzfsb = zzelxVar3;
        this.zzfsc = zzelxVar4;
        this.zzfsd = zzelxVar5;
        this.zzfse = zzelxVar6;
        this.zzfsf = zzelxVar7;
        this.zzeyo = zzelxVar8;
        this.zzfsg = zzelxVar9;
        this.zzfbk = zzelxVar10;
    }

    public static zzbsb zzb(zzelx<zzdpf> zzelxVar, zzelx<zzbbg> zzelxVar2, zzelx<ApplicationInfo> zzelxVar3, zzelx<String> zzelxVar4, zzelx<List<String>> zzelxVar5, zzelx<PackageInfo> zzelxVar6, zzelx<zzdvt<String>> zzelxVar7, zzelx<zzaya> zzelxVar8, zzelx<String> zzelxVar9, zzelx<zzdem<Bundle>> zzelxVar10) {
        return new zzbsb(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7, zzelxVar8, zzelxVar9, zzelxVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbrz(this.zzfow.get(), this.zzfnd.get(), this.zzfsb.get(), this.zzfsc.get(), this.zzfsd.get(), this.zzfse.get(), zzell.zzat(this.zzfsf), this.zzeyo.get(), this.zzfsg.get(), this.zzfbk.get());
    }
}
