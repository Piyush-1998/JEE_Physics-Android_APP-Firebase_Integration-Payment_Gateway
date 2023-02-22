package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchr implements zzelo<zzchs> {
    private final zzelx<zzbtu> zzevd;
    private final zzelx<zzdkx> zzflw;

    public zzchr(zzelx<zzbtu> zzelxVar, zzelx<zzdkx> zzelxVar2) {
        this.zzevd = zzelxVar;
        this.zzflw = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzchs(this.zzevd.get(), this.zzflw.get());
    }
}
