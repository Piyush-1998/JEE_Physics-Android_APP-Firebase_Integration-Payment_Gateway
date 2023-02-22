package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdar implements zzelo<zzdap> {
    private final zzelx<zzbqq> zzeyg;
    private final zzelx<zzdmk> zzezq;
    private final zzelx<zzdln> zzfos;
    private final zzelx<String> zzgsv;
    private final zzelx<String> zzgtf;

    private zzdar(zzelx<String> zzelxVar, zzelx<String> zzelxVar2, zzelx<zzbqq> zzelxVar3, zzelx<zzdmk> zzelxVar4, zzelx<zzdln> zzelxVar5) {
        this.zzgsv = zzelxVar;
        this.zzgtf = zzelxVar2;
        this.zzeyg = zzelxVar3;
        this.zzezq = zzelxVar4;
        this.zzfos = zzelxVar5;
    }

    public static zzdar zzh(zzelx<String> zzelxVar, zzelx<String> zzelxVar2, zzelx<zzbqq> zzelxVar3, zzelx<zzdmk> zzelxVar4, zzelx<zzdln> zzelxVar5) {
        return new zzdar(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdap(this.zzgsv.get(), this.zzgtf.get(), this.zzeyg.get(), this.zzezq.get(), this.zzfos.get());
    }
}
