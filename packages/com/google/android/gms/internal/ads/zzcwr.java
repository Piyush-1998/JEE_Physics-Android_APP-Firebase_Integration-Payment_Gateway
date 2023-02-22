package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwr implements zzelo<zzcws> {
    private final zzelx<zzcji> zzgog;

    private zzcwr(zzelx<zzcji> zzelxVar) {
        this.zzgog = zzelxVar;
    }

    public static zzcwr zzaj(zzelx<zzcji> zzelxVar) {
        return new zzcwr(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcws(this.zzgog.get());
    }
}
