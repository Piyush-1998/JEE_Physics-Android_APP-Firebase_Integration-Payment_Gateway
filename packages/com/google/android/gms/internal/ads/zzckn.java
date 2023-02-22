package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztq;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckn implements zzelo<zzcku> {
    public static zzckn zzaoi() {
        zzckn zzcknVar;
        zzcknVar = zzckq.zzgeq;
        return zzcknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcku) zzelu.zza(new zzcku(zztq.zza.zzb.REQUEST_WILL_PROCESS_RESPONSE, zztq.zza.zzb.REQUEST_DID_PROCESS_RESPONSE, zztq.zza.zzb.REQUEST_FAILED_TO_PROCESS_RESPONSE), "Cannot return null from a non-@Nullable @Provides method");
    }
}
