package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxy implements zzelo<Set<zzbys<zzbuy>>> {
    private final zzbxj zzfug;

    private zzbxy(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxy zzv(zzbxj zzbxjVar) {
        return new zzbxy(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzakc(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
