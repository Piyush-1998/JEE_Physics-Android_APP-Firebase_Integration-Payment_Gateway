package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbox implements zzelo<zzboy> {
    private final zzelx<zzdkx> zzflw;
    private final zzelx<zzbtl> zzfpi;
    private final zzelx<zzbun> zzfpj;

    private zzbox(zzelx<zzdkx> zzelxVar, zzelx<zzbtl> zzelxVar2, zzelx<zzbun> zzelxVar3) {
        this.zzflw = zzelxVar;
        this.zzfpi = zzelxVar2;
        this.zzfpj = zzelxVar3;
    }

    public static zzbox zzf(zzelx<zzdkx> zzelxVar, zzelx<zzbtl> zzelxVar2, zzelx<zzbun> zzelxVar3) {
        return new zzbox(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzboy(this.zzflw.get(), this.zzfpi.get(), this.zzfpj.get());
    }
}
