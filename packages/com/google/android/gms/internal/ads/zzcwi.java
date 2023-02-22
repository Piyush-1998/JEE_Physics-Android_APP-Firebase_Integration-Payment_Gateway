package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwi<AdT> implements zzelo<zzcwe<AdT>> {
    private final zzelx<zzdvw> zzfol;
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzabq> zzgow;
    private final zzelx<zzcwf<AdT>> zzgpd;

    public zzcwi(zzelx<zzdpf> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzabq> zzelxVar3, zzelx<zzcwf<AdT>> zzelxVar4) {
        this.zzfow = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzgow = zzelxVar3;
        this.zzgpd = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcwe(this.zzfow.get(), this.zzfol.get(), this.zzgow.get(), this.zzgpd.get());
    }
}
