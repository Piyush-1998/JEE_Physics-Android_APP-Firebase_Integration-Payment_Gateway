package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcaf implements zzelo<Set<zzbys<zzbsu>>> {
    private final zzelx<zzbru> zzfnr;
    private final zzbzw zzfva;

    private zzcaf(zzbzw zzbzwVar, zzelx<zzbru> zzelxVar) {
        this.zzfva = zzbzwVar;
        this.zzfnr = zzelxVar;
    }

    public static zzcaf zze(zzbzw zzbzwVar, zzelx<zzbru> zzelxVar) {
        return new zzcaf(zzbzwVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(this.zzfva.zzb(this.zzfnr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
