package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczd implements zzelo<Set<String>> {
    private final zzcyx zzgrx;

    public zzczd(zzcyx zzcyxVar) {
        this.zzgrx = zzcyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzgrx.zzaqp(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
