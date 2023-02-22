package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxl implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzbxj zzfug;

    private zzbxl(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxl zzg(zzbxj zzbxjVar) {
        return new zzbxl(zzbxjVar);
    }

    public static Set<zzbys<zzbuj>> zzh(zzbxj zzbxjVar) {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzh(this.zzfug);
    }
}
