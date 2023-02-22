package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxm implements zzelo<Set<zzbys<zzbtp>>> {
    private final zzbxj zzfug;

    private zzbxm(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxm zzi(zzbxj zzbxjVar) {
        return new zzbxm(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
