package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbk implements zzelo<zzcbh> {
    private final zzelx<zzcdg> zzfok;
    private final zzelx<Map<String, zzcre<zzbpj>>> zzfpz;
    private final zzelx<zzbpi<zzbni>> zzfvk;
    private final zzelx<Map<String, zzcre<zzcco>>> zzfvm;
    private final zzelx<Map<String, zzctf<zzcco>>> zzfvn;

    public zzcbk(zzelx<Map<String, zzcre<zzbpj>>> zzelxVar, zzelx<Map<String, zzcre<zzcco>>> zzelxVar2, zzelx<Map<String, zzctf<zzcco>>> zzelxVar3, zzelx<zzbpi<zzbni>> zzelxVar4, zzelx<zzcdg> zzelxVar5) {
        this.zzfpz = zzelxVar;
        this.zzfvm = zzelxVar2;
        this.zzfvn = zzelxVar3;
        this.zzfvk = zzelxVar4;
        this.zzfok = zzelxVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcbh(this.zzfpz.get(), this.zzfvm.get(), this.zzfvn.get(), this.zzfvk, this.zzfok.get());
    }
}
