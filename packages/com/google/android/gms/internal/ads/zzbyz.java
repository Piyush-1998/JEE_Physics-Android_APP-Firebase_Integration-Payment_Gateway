package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbyz implements zzelo<zzbza> {
    private final zzelx<zzdps> zzfbu;
    private final zzelx<zzdkx> zzflw;

    private zzbyz(zzelx<zzdkx> zzelxVar, zzelx<zzdps> zzelxVar2) {
        this.zzflw = zzelxVar;
        this.zzfbu = zzelxVar2;
    }

    public static zzbyz zzv(zzelx<zzdkx> zzelxVar, zzelx<zzdps> zzelxVar2) {
        return new zzbyz(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbza(this.zzflw.get(), this.zzfbu.get());
    }
}
