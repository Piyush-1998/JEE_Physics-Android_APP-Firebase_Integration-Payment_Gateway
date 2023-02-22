package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbtv implements zzelo<zzbto> {
    private final zzelx<Set<zzbys<zzbtp>>> zzfor;

    private zzbtv(zzelx<Set<zzbys<zzbtp>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbtv zzj(zzelx<Set<zzbys<zzbtp>>> zzelxVar) {
        return new zzbtv(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbto(this.zzfor.get());
    }
}
