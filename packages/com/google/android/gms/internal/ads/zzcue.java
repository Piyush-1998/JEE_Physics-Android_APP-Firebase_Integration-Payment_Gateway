package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcue implements zzelo<zzcub> {
    private final zzelx<zzbii> zzfwi;
    private final zzelx<zzbsg.zza> zzfwj;
    private final zzelx<zzbxj> zzfwk;

    public zzcue(zzelx<zzbii> zzelxVar, zzelx<zzbsg.zza> zzelxVar2, zzelx<zzbxj> zzelxVar3) {
        this.zzfwi = zzelxVar;
        this.zzfwj = zzelxVar2;
        this.zzfwk = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcub(this.zzfwi.get(), this.zzfwj.get(), this.zzfwk.get());
    }
}
