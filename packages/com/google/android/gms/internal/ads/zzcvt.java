package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbuc;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvt<AdT, AdapterT, ListenerT extends zzbuc> implements zzelo<zzcvp<AdT, AdapterT, ListenerT>> {
    private final zzelx<zzcrf<AdapterT, ListenerT>> zzfks;
    private final zzelx<zzdvw> zzfol;
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzcrh<AdT, AdapterT, ListenerT>> zzgok;

    private zzcvt(zzelx<zzdpf> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcrf<AdapterT, ListenerT>> zzelxVar3, zzelx<zzcrh<AdT, AdapterT, ListenerT>> zzelxVar4) {
        this.zzfow = zzelxVar;
        this.zzfol = zzelxVar2;
        this.zzfks = zzelxVar3;
        this.zzgok = zzelxVar4;
    }

    public static <AdT, AdapterT, ListenerT extends zzbuc> zzcvt<AdT, AdapterT, ListenerT> zzf(zzelx<zzdpf> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcrf<AdapterT, ListenerT>> zzelxVar3, zzelx<zzcrh<AdT, AdapterT, ListenerT>> zzelxVar4) {
        return new zzcvt<>(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcvp(this.zzfow.get(), this.zzfol.get(), this.zzfks.get(), this.zzgok.get());
    }
}
