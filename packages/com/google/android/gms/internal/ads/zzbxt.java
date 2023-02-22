package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxt implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzbxj zzfug;

    private zzbxt(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxt zzp(zzbxj zzbxjVar) {
        return new zzbxt(zzbxjVar);
    }

    public static Set<zzbys<zzbuj>> zzq(zzbxj zzbxjVar) {
        return (Set) zzelu.zza(zzbxjVar.zzaju(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzq(this.zzfug);
    }
}
