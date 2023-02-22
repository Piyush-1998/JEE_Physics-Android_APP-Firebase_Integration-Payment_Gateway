package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztq;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcjy implements zzelo<zzcku> {
    public static zzcjy zzaoa() {
        zzcjy zzcjyVar;
        zzcjyVar = zzcjx.zzgeg;
        return zzcjyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcku) zzelu.zza(new zzcku(zztq.zza.zzb.REQUEST_WILL_UPDATE_SIGNALS, zztq.zza.zzb.REQUEST_DID_UPDATE_SIGNALS, zztq.zza.zzb.REQUEST_FAILED_TO_UPDATE_SIGNALS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
