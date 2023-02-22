package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxx implements zzelo<Set<zzbys<AppEventListener>>> {
    private final zzbxj zzfug;

    private zzbxx(zzbxj zzbxjVar) {
        this.zzfug = zzbxjVar;
    }

    public static zzbxx zzu(zzbxj zzbxjVar) {
        return new zzbxx(zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfug.zzajy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
