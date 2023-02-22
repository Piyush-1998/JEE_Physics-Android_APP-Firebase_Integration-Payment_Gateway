package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxv implements zzelo<Set<zzbys<zzbuo>>> {
    private final zzbxj zzfug;

    private zzbxv(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxv zzs(zzbxj zzbxjVar) {
        return new zzbxv(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzakb(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
