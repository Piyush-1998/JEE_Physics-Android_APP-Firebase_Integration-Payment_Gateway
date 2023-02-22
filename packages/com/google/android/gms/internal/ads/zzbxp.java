package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxp implements zzelo<Set<zzbys<zzbsz>>> {
    private final zzbxj zzfug;

    private zzbxp(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxp zzl(zzbxj zzbxjVar) {
        return new zzbxp(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajv(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
