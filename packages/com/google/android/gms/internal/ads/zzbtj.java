package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbtj implements zzelo<zzbtb> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbtf> zzews;
    private final zzelx<Set<zzbys<zzbsy>>> zzfor;

    private zzbtj(zzelx<zzbtf> zzelxVar, zzelx<Set<zzbys<zzbsy>>> zzelxVar2, zzelx<Executor> zzelxVar3) {
        this.zzews = zzelxVar;
        this.zzfor = zzelxVar2;
        this.zzerr = zzelxVar3;
    }

    public static zzbtj zzi(zzelx<zzbtf> zzelxVar, zzelx<Set<zzbys<zzbsy>>> zzelxVar2, zzelx<Executor> zzelxVar3) {
        return new zzbtj(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbtb(this.zzews.get(), this.zzfor.get(), this.zzerr.get());
    }
}
