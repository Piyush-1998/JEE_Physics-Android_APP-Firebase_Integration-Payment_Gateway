package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbzx implements zzelo<Set<zzbys<zzbti>>> {
    private final zzelx<zzbru> zzfnr;
    private final zzbzw zzfva;

    private zzbzx(zzbzw zzbzwVar, zzelx<zzbru> zzelxVar) {
        this.zzfva = zzbzwVar;
        this.zzfnr = zzelxVar;
    }

    public static zzbzx zza(zzbzw zzbzwVar, zzelx<zzbru> zzelxVar) {
        return new zzbzx(zzbzwVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(Collections.singleton(zzbys.zzb(this.zzfnr.get(), zzbbi.zzedz)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
