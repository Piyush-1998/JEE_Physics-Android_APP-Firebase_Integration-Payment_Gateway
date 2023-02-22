package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdai implements zzelo<zzdag> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzdln> zzfos;

    private zzdai(zzelx<zzdvw> zzelxVar, zzelx<zzdln> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzfos = zzelxVar2;
    }

    public static zzdai zzax(zzelx<zzdvw> zzelxVar, zzelx<zzdln> zzelxVar2) {
        return new zzdai(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdag(this.zzerr.get(), this.zzfos.get());
    }
}
