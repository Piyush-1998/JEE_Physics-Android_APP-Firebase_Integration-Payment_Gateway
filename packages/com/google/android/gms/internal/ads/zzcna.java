package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcna implements zzelo<zzcmw> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzdvw> zzghd;
    private final zzelx<zzcoh> zzghe;
    private final zzelx<zzcpj> zzghf;

    private zzcna(zzelx<zzdvw> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcoh> zzelxVar3, zzelx<zzcpj> zzelxVar4) {
        this.zzghd = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzghe = zzelxVar3;
        this.zzghf = zzelxVar4;
    }

    public static zzcna zzd(zzelx<zzdvw> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcoh> zzelxVar3, zzelx<zzcpj> zzelxVar4) {
        return new zzcna(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcmw(this.zzghd.get(), this.zzerr.get(), this.zzghe.get(), zzell.zzat(this.zzghf));
    }
}
