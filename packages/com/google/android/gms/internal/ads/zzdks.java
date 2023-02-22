package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdks implements zzelo<zzdkr> {
    private final zzelx<zzdli> zzfjf;
    private final zzelx<zzdkd> zzgxo;
    private final zzelx<zzdje> zzgxp;

    public zzdks(zzelx<zzdkd> zzelxVar, zzelx<zzdje> zzelxVar2, zzelx<zzdli> zzelxVar3) {
        this.zzgxo = zzelxVar;
        this.zzgxp = zzelxVar2;
        this.zzfjf = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdkr(this.zzgxo.get(), this.zzgxp.get(), this.zzfjf.get());
    }
}
