package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zztq;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckl implements zzelo<zzcku> {
    public static zzckl zzaog() {
        zzckl zzcklVar;
        zzcklVar = zzcko.zzgen;
        return zzcklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcku) zzelu.zza(new zzcku(zztq.zza.zzb.REQUEST_WILL_MAKE_NETWORK_REQUEST, zztq.zza.zzb.REQUEST_DID_RECEIVE_NETWORK_RESPONSE, zztq.zza.zzb.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST), "Cannot return null from a non-@Nullable @Provides method");
    }
}
