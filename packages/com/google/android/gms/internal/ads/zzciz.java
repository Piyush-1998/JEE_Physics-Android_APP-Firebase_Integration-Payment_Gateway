package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzciz implements zzelo<zzcja> {
    private final zzelx<zzbfq> zzfoi;

    private zzciz(zzelx<zzbfq> zzelxVar) {
        this.zzfoi = zzelxVar;
    }

    public static zzciz zzaa(zzelx<zzbfq> zzelxVar) {
        return new zzciz(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcja(this.zzfoi.get());
    }
}
