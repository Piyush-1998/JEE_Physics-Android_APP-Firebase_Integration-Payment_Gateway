package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbtg implements zzelo<zzbtf> {
    private final zzelx<Set<zzbys<zzbti>>> zzfor;

    private zzbtg(zzelx<Set<zzbys<zzbti>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbtg zzh(zzelx<Set<zzbys<zzbti>>> zzelxVar) {
        return new zzbtg(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbtf(this.zzfor.get());
    }
}
