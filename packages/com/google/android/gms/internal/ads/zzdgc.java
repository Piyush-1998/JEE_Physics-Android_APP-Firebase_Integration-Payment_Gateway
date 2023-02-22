package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdgc implements zzelo<zzdga> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<zzaxc> zzesv;
    private final zzelx<String> zzfsc;

    public zzdgc(zzelx<zzaxc> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<String> zzelxVar3) {
        this.zzesv = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzfsc = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdga(this.zzesv.get(), this.zzerr.get(), this.zzfsc.get());
    }
}
