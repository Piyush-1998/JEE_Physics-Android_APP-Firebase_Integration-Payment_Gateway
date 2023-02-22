package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbnq implements zzelo<zzbue> {
    private final zzbnl zzfoq;
    private final zzelx<Set<zzbys<zzbuj>>> zzfor;

    public zzbnq(zzbnl zzbnlVar, zzelx<Set<zzbys<zzbuj>>> zzelxVar) {
        this.zzfoq = zzbnlVar;
        this.zzfor = zzelxVar;
    }

    public static zzbue zza(zzbnl zzbnlVar, Set<zzbys<zzbuj>> set) {
        return (zzbue) zzelu.zza(zzbnlVar.zza(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfoq, this.zzfor.get());
    }
}
