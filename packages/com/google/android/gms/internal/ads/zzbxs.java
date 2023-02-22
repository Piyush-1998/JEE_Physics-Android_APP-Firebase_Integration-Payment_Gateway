package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxs implements zzelo<Set<zzbys<zzbti>>> {
    private final zzbxj zzfug;

    private zzbxs(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxs zzo(zzbxj zzbxjVar) {
        return new zzbxs(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajw(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
