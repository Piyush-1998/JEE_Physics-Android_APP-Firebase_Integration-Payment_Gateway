package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgm implements zzelo<zzcgf> {
    private final zzelx<Executor> zzfol;
    private final zzelx<zzbmj> zzgad;
    private final zzelx<zzbyr> zzgcc;

    public zzcgm(zzelx<Executor> zzelxVar, zzelx<zzbmj> zzelxVar2, zzelx<zzbyr> zzelxVar3) {
        this.zzfol = zzelxVar;
        this.zzgad = zzelxVar2;
        this.zzgcc = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcgf(this.zzfol.get(), this.zzgad.get(), this.zzgcc.get());
    }
}
