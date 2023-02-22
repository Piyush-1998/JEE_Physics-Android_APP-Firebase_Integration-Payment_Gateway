package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcam implements zzelo<Set<zzbys<zzbyl>>> {
    private final zzelx<zzcbd> zzfnr;

    private zzcam(zzelx<zzcbd> zzelxVar) {
        this.zzfnr = zzelxVar;
    }

    public static zzcam zzw(zzelx<zzcbd> zzelxVar) {
        return new zzcam(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.singleton(zzbys.zzb(this.zzfnr.get(), zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
