package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnx implements zzelo<Set<zzbys<zzqu>>> {
    private final zzelx<zzboy> zzfnr;
    private final zzbnl zzfoq;

    public zzbnx(zzbnl zzbnlVar, zzelx<zzboy> zzelxVar) {
        this.zzfoq = zzbnlVar;
        this.zzfnr = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.singleton(new zzbys(this.zzfnr.get(), zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
