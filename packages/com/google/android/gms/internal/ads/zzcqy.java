package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqy implements zzelo<zzcqt> {
    private final zzelx<Context> zzert;
    private final zzelx<zzcqq> zzeyy;
    private final zzelx<zzcqk> zzfbn;
    private final zzelx<zzbrz> zzgkv;

    private zzcqy(zzelx<Context> zzelxVar, zzelx<zzbrz> zzelxVar2, zzelx<zzcqq> zzelxVar3, zzelx<zzcqk> zzelxVar4) {
        this.zzert = zzelxVar;
        this.zzgkv = zzelxVar2;
        this.zzeyy = zzelxVar3;
        this.zzfbn = zzelxVar4;
    }

    public static zzcqy zze(zzelx<Context> zzelxVar, zzelx<zzbrz> zzelxVar2, zzelx<zzcqq> zzelxVar3, zzelx<zzcqk> zzelxVar4) {
        return new zzcqy(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcqt(this.zzert.get(), this.zzgkv.get(), this.zzeyy.get(), this.zzfbn.get());
    }
}
