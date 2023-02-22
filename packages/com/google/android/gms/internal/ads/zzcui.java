package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcui implements zzelo<zzcuf> {
    private final zzelx<zzcjd> zzesd;
    private final zzelx<zzdlt> zzetm;
    private final zzelx<zzcli> zzetn;

    private zzcui(zzelx<zzdlt> zzelxVar, zzelx<zzcjd> zzelxVar2, zzelx<zzcli> zzelxVar3) {
        this.zzetm = zzelxVar;
        this.zzesd = zzelxVar2;
        this.zzetn = zzelxVar3;
    }

    public static zzcui zzp(zzelx<zzdlt> zzelxVar, zzelx<zzcjd> zzelxVar2, zzelx<zzcli> zzelxVar3) {
        return new zzcui(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcuf(this.zzetm.get(), this.zzesd.get(), this.zzetn.get());
    }
}
