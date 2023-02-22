package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxq implements zzelo<Set<zzbys<zzut>>> {
    private final zzbxj zzfug;

    private zzbxq(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxq zzm(zzbxj zzbxjVar) {
        return new zzbxq(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajz(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
