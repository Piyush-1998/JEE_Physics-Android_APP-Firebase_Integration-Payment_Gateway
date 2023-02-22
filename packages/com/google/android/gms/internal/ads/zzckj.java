package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztq;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckj implements zzelo<zzcku> {
    public static zzckj zzaoe() {
        zzckj zzckjVar;
        zzckjVar = zzckm.zzgem;
        return zzckjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcku) zzelu.zza(new zzcku(zztq.zza.zzb.REQUEST_WILL_UPDATE_GMS_SIGNALS, zztq.zza.zzb.REQUEST_DID_UPDATE_GMS_SIGNALS, zztq.zza.zzb.REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS), "Cannot return null from a non-@Nullable @Provides method");
    }
}
