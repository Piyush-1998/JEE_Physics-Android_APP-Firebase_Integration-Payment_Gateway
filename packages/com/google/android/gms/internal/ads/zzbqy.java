package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqy implements zzelo<zzbpg> {
    private final zzelx<zzbto> zzeuv;
    private final zzelx<zzbvi> zzeuw;
    private final zzelx<zzbue> zzewf;
    private final zzelx<zzdlj> zzflv;
    private final zzelx<zzdkx> zzfpe;
    private final zzelx<zzdiw> zzfre;
    private final zzelx<zzbsp> zzfrf;

    private zzbqy(zzelx<zzdlj> zzelxVar, zzelx<zzdkx> zzelxVar2, zzelx<zzbto> zzelxVar3, zzelx<zzbue> zzelxVar4, zzelx<zzdiw> zzelxVar5, zzelx<zzbsp> zzelxVar6, zzelx<zzbvi> zzelxVar7) {
        this.zzflv = zzelxVar;
        this.zzfpe = zzelxVar2;
        this.zzeuv = zzelxVar3;
        this.zzewf = zzelxVar4;
        this.zzfre = zzelxVar5;
        this.zzfrf = zzelxVar6;
        this.zzeuw = zzelxVar7;
    }

    public static zzbqy zza(zzelx<zzdlj> zzelxVar, zzelx<zzdkx> zzelxVar2, zzelx<zzbto> zzelxVar3, zzelx<zzbue> zzelxVar4, zzelx<zzdiw> zzelxVar5, zzelx<zzbsp> zzelxVar6, zzelx<zzbvi> zzelxVar7) {
        return new zzbqy(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbpg(this.zzflv.get(), this.zzfpe.get(), this.zzeuv.get(), this.zzewf.get(), this.zzfre.get(), this.zzfrf.get(), this.zzeuw.get());
    }
}
