package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcfk implements zzelo<zzcff> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzcfj> zzgbo;
    private final zzelx<zzcft> zzgbp;

    public zzcfk(zzelx<zzdvw> zzelxVar, zzelx<zzcfj> zzelxVar2, zzelx<zzcft> zzelxVar3) {
        this.zzerr = zzelxVar;
        this.zzgbo = zzelxVar2;
        this.zzgbp = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcff(this.zzerr.get(), this.zzgbo.get(), this.zzgbp.get());
    }
}
