package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxz implements zzelo<Set<zzbys<zzqu>>> {
    private final zzbxj zzfug;

    private zzbxz(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxz zzw(zzbxj zzbxjVar) {
        return new zzbxz(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
