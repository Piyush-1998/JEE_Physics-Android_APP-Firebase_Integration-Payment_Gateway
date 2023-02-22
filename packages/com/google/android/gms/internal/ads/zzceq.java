package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzceq implements zzelo<zzceh> {
    private final zzelx<zzchc> zzewz;
    private final zzelx<zzcih> zzgac;

    public zzceq(zzelx<zzcih> zzelxVar, zzelx<zzchc> zzelxVar2) {
        this.zzgac = zzelxVar;
        this.zzewz = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzceh(this.zzgac.get(), this.zzewz.get());
    }
}
