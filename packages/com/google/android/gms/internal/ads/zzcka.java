package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztq;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcka implements zzelo<zzcku> {
    public static zzcka zzaoc() {
        zzcka zzckaVar;
        zzckaVar = zzcjz.zzgeh;
        return zzckaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcku) zzelu.zza(new zzcku(zztq.zza.zzb.REQUEST_WILL_RENDER, zztq.zza.zzb.REQUEST_DID_RENDER, zztq.zza.zzb.REQUEST_FAILED_TO_RENDER), "Cannot return null from a non-@Nullable @Provides method");
    }
}
