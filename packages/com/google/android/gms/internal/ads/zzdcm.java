package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdcm implements zzelo<zzdck> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzdkv> zzglx;

    private zzdcm(zzelx<zzdvw> zzelxVar, zzelx<zzdkv> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzglx = zzelxVar2;
    }

    public static zzdcm zzbc(zzelx<zzdvw> zzelxVar, zzelx<zzdkv> zzelxVar2) {
        return new zzdcm(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdck(this.zzerr.get(), this.zzglx.get());
    }
}
