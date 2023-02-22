package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqu implements zzelo<zzcqr> {
    private final zzelx<zzcqq> zzgko;

    private zzcqu(zzelx<zzcqq> zzelxVar) {
        this.zzgko = zzelxVar;
    }

    public static zzcqu zzah(zzelx<zzcqq> zzelxVar) {
        return new zzcqu(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcqr(this.zzgko.get());
    }
}
