package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqa implements zzelo<zzbpx> {
    private final zzelx<zzbtu> zzevd;

    private zzbqa(zzelx<zzbtu> zzelxVar) {
        this.zzevd = zzelxVar;
    }

    public static zzbqa zze(zzelx<zzbtu> zzelxVar) {
        return new zzbqa(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbpx(this.zzevd.get());
    }
}
