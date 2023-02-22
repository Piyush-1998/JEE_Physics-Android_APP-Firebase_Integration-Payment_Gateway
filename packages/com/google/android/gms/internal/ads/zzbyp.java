package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbyp implements zzelo<zzbyo> {
    private final zzelx<Set<zzbys<zzbyl>>> zzfor;

    private zzbyp(zzelx<Set<zzbys<zzbyl>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbyp zzt(zzelx<Set<zzbys<zzbyl>>> zzelxVar) {
        return new zzbyp(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbyo(this.zzfor.get());
    }
}
