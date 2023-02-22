package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbug implements zzelo<zzbue> {
    private final zzelx<Set<zzbys<zzbuj>>> zzfor;

    private zzbug(zzelx<Set<zzbys<zzbuj>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbug zzl(zzelx<Set<zzbys<zzbuj>>> zzelxVar) {
        return new zzbug(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbue(this.zzfor.get());
    }
}
