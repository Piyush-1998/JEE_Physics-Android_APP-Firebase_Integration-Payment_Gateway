package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnw implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzelx<zzboy> zzfnr;
    private final zzbnl zzfoq;

    public zzbnw(zzbnl zzbnlVar, zzelx<zzboy> zzelxVar) {
        this.zzfoq = zzbnlVar;
        this.zzfnr = zzelxVar;
    }

    public static Set<zzbys<zzbuj>> zza(zzbnl zzbnlVar, zzboy zzboyVar) {
        return (Set) zzelu.zza(Collections.singleton(new zzbys(zzboyVar, zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzfnr.get());
    }
}
