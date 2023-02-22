package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbso implements zzelo<zzbsp> {
    private final zzelx<zzdkx> zzfpe;
    private final zzelx<String> zzfsn;

    private zzbso(zzelx<zzdkx> zzelxVar, zzelx<String> zzelxVar2) {
        this.zzfpe = zzelxVar;
        this.zzfsn = zzelxVar2;
    }

    public static zzbso zzt(zzelx<zzdkx> zzelxVar, zzelx<String> zzelxVar2) {
        return new zzbso(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbsp(this.zzfpe.get(), this.zzfsn.get());
    }
}
