package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmr implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzbmp zzfnq;
    private final zzelx<zzboy> zzfnr;

    public zzbmr(zzbmp zzbmpVar, zzelx<zzboy> zzelxVar) {
        this.zzfnq = zzbmpVar;
        this.zzfnr = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.singleton(new zzbys(this.zzfnr.get(), zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
