package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcct implements zzelo<zzccu> {
    private final zzelx<zzccm> zzfxq;

    private zzcct(zzelx<zzccm> zzelxVar) {
        this.zzfxq = zzelxVar;
    }

    public static zzcct zzz(zzelx<zzccm> zzelxVar) {
        return new zzcct(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzccu(this.zzfxq.get());
    }
}
