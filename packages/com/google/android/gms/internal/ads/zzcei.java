package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcei implements zzelo<zzcdz> {
    private final zzelx<zzchc> zzewz;
    private final zzelx<zzcdd> zzexf;
    private final zzelx<zzcih> zzgac;
    private final zzelx<zzbmj> zzgad;

    public zzcei(zzelx<zzcih> zzelxVar, zzelx<zzchc> zzelxVar2, zzelx<zzbmj> zzelxVar3, zzelx<zzcdd> zzelxVar4) {
        this.zzgac = zzelxVar;
        this.zzewz = zzelxVar2;
        this.zzgad = zzelxVar3;
        this.zzexf = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcdz(this.zzgac.get(), this.zzewz.get(), this.zzgad.get(), this.zzexf.get());
    }
}
