package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcme implements zzelo<Set<zzbys<zzbtm>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcmg> zzgek;
    private final zzclw zzgfx;

    private zzcme(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzgfx = zzclwVar;
        this.zzgek = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzcme zzh(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzcme(zzclwVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(zzclw.zzf(this.zzgek.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
