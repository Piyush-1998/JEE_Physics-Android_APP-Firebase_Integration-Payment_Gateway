package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxo implements zzelo<Set<zzbys<com.google.android.gms.ads.internal.overlay.zzo>>> {
    private final zzbxj zzfug;

    private zzbxo(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxo zzk(zzbxj zzbxjVar) {
        return new zzbxo(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
