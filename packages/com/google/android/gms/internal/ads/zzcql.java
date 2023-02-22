package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcql implements zzelo<zzcqk> {
    private final zzelx<zzcqi> zzfbm;
    private final zzelx<zzdvw> zzgjv;

    private zzcql(zzelx<zzcqi> zzelxVar, zzelx<zzdvw> zzelxVar2) {
        this.zzfbm = zzelxVar;
        this.zzgjv = zzelxVar2;
    }

    public static zzcql zzav(zzelx<zzcqi> zzelxVar, zzelx<zzdvw> zzelxVar2) {
        return new zzcql(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcqk(this.zzfbm.get(), this.zzgjv.get());
    }
}
