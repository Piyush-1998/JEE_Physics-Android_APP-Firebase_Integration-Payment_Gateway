package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcuc implements zzelo<zzctz> {
    private final zzelx<zzbii> zzfwi;
    private final zzelx<zzbsg.zza> zzfwj;
    private final zzelx<zzbxj> zzfwk;
    private final zzelx<zzcwh> zzgna;

    public zzcuc(zzelx<zzbii> zzelxVar, zzelx<zzbsg.zza> zzelxVar2, zzelx<zzcwh> zzelxVar3, zzelx<zzbxj> zzelxVar4) {
        this.zzfwi = zzelxVar;
        this.zzfwj = zzelxVar2;
        this.zzgna = zzelxVar3;
        this.zzfwk = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzctz(this.zzfwi.get(), this.zzfwj.get(), this.zzgna.get(), this.zzfwk.get());
    }
}
