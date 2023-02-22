package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxw implements zzelo<Set<zzbys<AdMetadataListener>>> {
    private final zzbxj zzfug;

    private zzbxw(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxw zzt(zzbxj zzbxjVar) {
        return new zzbxw(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajx(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
