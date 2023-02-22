package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbyd implements zzelo<Set<zzbys<VideoController.VideoLifecycleCallbacks>>> {
    private final zzbxj zzfug;

    private zzbyd(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbyd zzaa(zzbxj zzbxjVar) {
        return new zzbyd(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
