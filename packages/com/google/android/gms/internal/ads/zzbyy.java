package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbyy implements zzelo<zzbyw> {
    private final zzelx<Set<zzbys<zzbyx>>> zzfor;

    private zzbyy(zzelx<Set<zzbys<zzbyx>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbyy zzu(zzelx<Set<zzbys<zzbyx>>> zzelxVar) {
        return new zzbyy(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbyw(this.zzfor.get());
    }
}
